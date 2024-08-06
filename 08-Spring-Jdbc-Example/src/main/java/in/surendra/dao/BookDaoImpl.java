package in.surendra.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public BookDaoImpl() {
		System.out.println("bookdaoimpl - constructor created...");
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
		 
	}
	
	@Override
	public boolean saveBook() {			//create table book(book_id int(10),book_name varchar(40),book_price int(10));
										// create table manually in mysql 
		
	String str = "insert into book values(10,'Wings_Of_Fire',250)";
		
		jdbcTemplate.execute(str);
		
		return true;
	} 

}
