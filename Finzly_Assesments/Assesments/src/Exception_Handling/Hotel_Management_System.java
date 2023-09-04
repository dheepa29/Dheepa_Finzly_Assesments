import java.util.ArrayList;
import java.util.List;

// Custom exception classes
class InvalidReservationException extends Exception {
    public InvalidReservationException(String message) {
        super(message);
    }
}

class RoomNotFoundException extends Exception {
    public RoomNotFoundException(String message) {
        super(message);
    }
}

// Guest and Reservation classes
class Guest {
    private String guestName;

    public Guest(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestName() {
        return guestName;
    }
}

class Reservation {
    private int reservationId;
    private Guest guest;

    public Reservation(int reservationId, Guest guest) {
        this.reservationId = reservationId;
        this.guest = guest;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Guest getGuest() {
        return guest;
    }
}

// Room hierarchy
class Room {
    private int roomNumber;
    private boolean isAvailable;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void reserve() {
        isAvailable = false;
    }

    public void checkOut() {
        isAvailable = true;
    }
}

class StandardRoom extends Room {
    public StandardRoom(int roomNumber) {
        super(roomNumber);
    }
}

class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber) {
        super(roomNumber);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom(int roomNumber) {
        super(roomNumber);
    }
}

// Hotel class
class Hotel {
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private int nextReservationId = 1;

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void makeReservation(Guest guest, Room room) throws InvalidReservationException {
        if (room == null || !room.isAvailable()) {
            throw new InvalidReservationException("Invalid room selection or room not available.");
        }

        Reservation reservation = new Reservation(nextReservationId++, guest);
        reservations.add(reservation);
        room.reserve();
    }

    public Room findAvailableRoom() throws RoomNotFoundException {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                return room;
            }
        }
        throw new RoomNotFoundException("No available rooms found.");
    }
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.addRoom(new StandardRoom(101));
        hotel.addRoom(new DeluxeRoom(201));
        hotel.addRoom(new SuiteRoom(301));

        try {
            Guest guest1 = new Guest("Alice");
            Room availableRoom = hotel.findAvailableRoom();
            hotel.makeReservation(guest1, availableRoom);
            System.out.println(guest1.getGuestName() + " reserved room " + availableRoom.getRoomNumber());

            Guest guest2 = new Guest("Bob");
            availableRoom = hotel.findAvailableRoom();
            hotel.makeReservation(guest2, availableRoom);
            System.out.println(guest2.getGuestName() + " reserved room " + availableRoom.getRoomNumber());
        } catch (InvalidReservationException | RoomNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
