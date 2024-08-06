package in.surendra.utils;

import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {
	
	@Autowired 
	private JavaMailSender mailsender;
	public boolean sendEmail(String to,String Subject,String body){
		
		try {
//			SimpleMailMessage simplemail = new SimpleMailMessage();
//			simplemail.setTo(to);
//			simplemail.setSubject(Subject);
//			simplemail.setText(body);
//			
//			mailsender.send(simplemail);
//			return true;
			
			MimeMessage mimeMessage = mailsender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
			helper.setTo(to);
			helper.setSubject(Subject);
			helper.setText(body);
			
			mailsender.send(mimeMessage);
			return true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		}
}
