package library;

public class LibraryItem {
	
	private String title;
	private int itemID;
	
	public LibraryItem(String title, int itemID) {
		super();
		this.title = title;
		this.itemID = itemID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	
	
	public void displayInfo() {
		System.out.println("LibraryItem [title=" + title + ", itemID=" + itemID + "]");
	}

	@Override
	public String toString() {
		return "LibraryItem [title=" + title + ", itemID=" + itemID + "]";
	}
	
}
