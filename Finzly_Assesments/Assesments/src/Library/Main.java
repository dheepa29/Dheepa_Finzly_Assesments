package library;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		LibraryItem book = new Book("Title of Book",123,"Author0");
		LibraryItem dvd = new DVD("Title of DVD1",32,"Author1");
		LibraryItem dvd2 = new DVD("Title of DVD2",32,"Author2");
		
		StudentMember student = new StudentMember(123,"Mithul");  //Creating student
		FacultyMember faculty = new FacultyMember(987,"Bhalaji"); //Creating faculty 
		System.out.println("___________________________");
		System.out.println(student.getType());					  //Getting the type of Library Member
		System.out.println(faculty.getType());					  //Getting the type of Library Member
		
		System.out.println("___________________________");
		System.out.print("Book info ");
		book.displayInfo();
		
		System.out.println("___________________");
		student.borrowItem(book);	 							  //Borrowing book
		student.borrowItem(dvd);
		student.returnItem(dvd);								  //Returning the book
		System.out.println("___________________________");
		System.out.print("Borrowed Item :");					  //Getting information about borrowed items	
		List<LibraryItem> studentBorrow = student.getBorrowedItems();
		for(LibraryItem item: studentBorrow) {
			System.out.println(item);
		}
		
		
		System.out.println("___________________________");
		student.reserveItem(book);									//Reserving book
		faculty.reserveItem(book);									//Reserving same book, (it will not reserve as student reserved it)
		
		System.out.println("___________________________");
		student.removeReserveItem(book);							//Removing reservation of book
		faculty.reserveItem(book);									//So now successfully reserved
		
		student.reserveItem(dvd2);									//Reserving DVD2
		faculty.borrowItem(dvd2);									//faculty can't get the DVD2 because it is reserved by student
		
		
	}
}
