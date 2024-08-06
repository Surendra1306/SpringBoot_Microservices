package in.surendra.service;

import in.surendra.dao.BookDao;

public class BookServiceImpl implements BookService {
	
	private BookDao bookdao;

	public void setBookdao(BookDao bookdao) {
		this.bookdao = bookdao;
	}


	@Override
	public void saveBookDetails() {
		 boolean status = bookdao.saveBook();
		 
		 if(status) {
			 System.out.println("Records Inserted Successfully....");
		 }
		 else {
			 System.out.println("Insertion Failed....");
		 }
		 
	}
 


}
