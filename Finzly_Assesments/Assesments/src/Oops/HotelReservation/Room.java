package hotelreservation;
import java.time.LocalDate;

public class Room {
	
	
	private int pricePerNight;	
	private int roomNumber = 100;
	private boolean occupied;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	
	private static int reservationID = 1000;
	private static int capacity;

	
	public Room(int pricePerNight, int roomNumber, boolean occupied) {
		this.pricePerNight = pricePerNight;
		this.roomNumber = roomNumber;
		this.occupied = occupied;
		capacity++;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public boolean isAvailable(int roomID) {
		return true;	
	}
	
	
	public static  int getReservationID() {
		return reservationID;
	}

	public static int getCapacity() {
		return capacity;
	}
	
	public boolean isReserved() {
		return occupied ? true : false;
	}
	
	public boolean makeReservation(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
		this.checkOutDate = null;
		occupied = true;
		return true;
	}
	public boolean makeReservation(int noOfDays) {
		LocalDate cDate = LocalDate.now();
		this.checkInDate = cDate;
		LocalDate oDate = cDate.plusDays(noOfDays);
		this.checkOutDate =oDate;
		occupied = true;
		return true;
	}
	public boolean makeReservation(LocalDate checkInDate, LocalDate checkOutDate) {
		if(checkOutDate.isBefore(checkInDate) || checkInDate.isAfter(checkOutDate)) {
			System.out.println("Please enter a valid date");
			return false;
		}
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		occupied = true;
		return true;
	}

	@Override
	public String toString() {
		return "Room [pricePerNight=" + pricePerNight + ", roomNumber=" + roomNumber + ", occupied=" + occupied
				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + "]";
	}
	
}
