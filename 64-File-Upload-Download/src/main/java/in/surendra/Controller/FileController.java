package in.surendra.Controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.surendra.Entity.User;

@RestController
@RequestMapping("/file")
public class FileController {
	
	@PostMapping("/user")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		System.out.println(user);
		return new ResponseEntity<String>("User saved.",HttpStatus.OK);
	}
	
	Path destPath = Paths.get("saved-files"); //create the path where files will upload
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file1") MultipartFile file) throws Exception{
		//you can also pass multiple files as param like file2,file3,... to upload multiple files
		
		
		if(!Files.exists(destPath) ){
			Files.createDirectories(destPath);  //if path not exists create new path
		}
		
		try {
			
			Files.copy(file.getInputStream(), destPath.resolve(file.getOriginalFilename()));	
			
			//1st arg is to get the file as a param from multipartfile and resolve() is used to get the location,where the files will upload
			//go to postman formdata - key as file1(param) and value is the file that u have to upload
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>("file uploaded successfully...",HttpStatus.OK);
	}

	@GetMapping("/download/{filename}")
	public ResponseEntity<org.springframework.core.io.Resource> downloadFile(@PathVariable String filename) throws Exception {
		Path filePath = destPath.resolve(filename);
		
		org.springframework.core.io.Resource file = new UrlResource(filePath.toUri());
		
		if(file.exists()) {
			return ResponseEntity.ok()
					 .header(org.springframework.http.HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
					 .body(file);		
		}
		else {
			throw new Exception("file not found..");
		}
		
	}
}







