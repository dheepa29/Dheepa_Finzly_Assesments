package library;

import java.util.ArrayList;
import java.util.List;

public class FacultyMember extends LibraryMember implements Reservable{
	private String type;
	private List<LibraryItem> borrowedItems = new ArrayList<>();    
	
	
	public FacultyMember(int memberID, String name) {
		super(memberID, name);
		this.type = "Faculty";
	}

	@Override
	void borrowItem(LibraryItem item) {
		if(super.checkReservedItem(item)) {
			System.out.println("The book is already reserved");
		}else if(borrowedItems.contains(item)) {
			System.out.println("Can't provide this "+ item+" already borrowed");
		}else {
			borrowedItems.add(item);
			System.out.println(item + " borrowed");
		}
		
	}
	
	//getters and setters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<LibraryItem> getBorrowedItems() {
		return borrowedItems;
	}
	
	@Override
	public void returnItem(LibraryItem item) {
		if(borrowedItems.contains(item)) {
			borrowedItems.remove(item);
		}else {
			System.out.println("The item is not borrowed");
		}
	}

	@Override
	public void reserveItem(LibraryItem item) {
	     super.addReserveItem(item);
		
	}

	public void removeReserveItem(LibraryItem item) {
		super.removeReserveItem(item);
	}
	
	
}
