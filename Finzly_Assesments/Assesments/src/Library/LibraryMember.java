package library;

import java.util.ArrayList;
import java.util.List;

public abstract class LibraryMember {
        private int memberID;
        private String name;  
        private static List<LibraryItem> reservedItem = new ArrayList<>();
        
        public LibraryMember(int memberID, String name) {
			this.setMemberID(memberID);
			this.setName(name);
		}

        
		abstract void borrowItem(LibraryItem item);
		
		abstract void returnItem(LibraryItem item);
		
		public  void addReserveItem(LibraryItem item) {
			if(reservedItem.contains(item)) {
				System.out.println("Already reserved");
			}else {
				reservedItem.add(item);
				System.out.println("Successfully reserved");
			}
		};
		
		public void removeReserveItem(LibraryItem item) {
			if(reservedItem.contains(item)) {
				reservedItem.remove(item);
			}else {
				System.out.println("Reservatin not found");
			}
		}
		
		public boolean checkReservedItem(LibraryItem item) {
			if(reservedItem.contains(item)) {
				return true;
			}
			return false;
		}
		

		public int getMemberID() {
			return memberID;
		}

		public void setMemberID(int memberID) {
			this.memberID = memberID;
		}
		public void setName(String name) {
			this.name = name;
		}
		
        
}
