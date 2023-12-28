package bus_reserv;
import java.util.Scanner;
import java.util.ArrayList; 

public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList <Bus> buses= new ArrayList <Bus>();
		ArrayList <Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,true,20));
		buses.add(new Bus(3,false,30));
	
		int user_opt=1;
	    Scanner scanner = new Scanner(System.in);
	    
	    for(Bus b:buses){
	    	b.displayBusInfo();
	    }
		
		while(user_opt ==1) {
		System.out.println("Enter 1 to book 2 to exit....");
		user_opt = scanner.nextInt();
		if(user_opt==1) {
			Booking booking = new Booking();
			if(booking.isAvailable(bookings, buses)) {
				bookings.add(booking);
				System.out.println("Your booking is confirmed...");
			}
			else
				System.out.println("Sorry bus is full. Try another bus.");
		}
	}

}
}
