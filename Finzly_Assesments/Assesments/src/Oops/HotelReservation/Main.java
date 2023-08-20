package hotelreservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Main {
		public static void main(String[] args) {
			int  roomNoToReserve;
			List<Room> rooms = new ArrayList<>();
			for(int i = 1;i<=10 ; i++) {
				rooms.add(new Room(2000,100+i,false));
			}
			
			Scanner sc = new Scanner(System.in);
			
			rooms.get(0).makeReservation(10);
			rooms.get(1).makeReservation(LocalDate.parse("2023-09-12"));
			rooms.get(2).makeReservation(LocalDate.parse("2023-09-13"),LocalDate.parse("2023-09-17"));
			
			for(Room room : rooms) {
				System.out.println(room);
			}
			
		}
}
