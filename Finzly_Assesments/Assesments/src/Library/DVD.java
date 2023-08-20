package library;

public class DVD extends LibraryItem {
	private String duration;
	
	

	public DVD(String title, int itemID, String duration) {
		super(title, itemID);
		this.duration = duration;
	}
	
	public void displayInfo() {
		System.out.println("DVD {Duration= " + duration + " Title= "+super.getTitle()+ " ItemID= "+super.getItemID()+" ]");
	}

	
	
	
}
