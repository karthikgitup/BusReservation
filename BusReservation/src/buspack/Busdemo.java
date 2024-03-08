package buspack;

import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Bus>buses=new ArrayList<Bus>();
		ArrayList <Booking>bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,42));
		buses.add(new Bus(3,true,32));
		buses.add(new Bus(4,false,42));
		
		for(Bus b:buses) {
			b.displayinfo();
			
		}
		
		
int choice =1;
Scanner sc=new Scanner(System.in);
while(choice==1) {
	System.out.println("Enter the number 1(bookinng) or 2(cancel)");
	choice=sc.nextInt();
	if(choice==1) {
//		System.out.println("Booking......");
		Booking books=new Booking();
		if(books.isAvailable(bookings,buses)) {
			bookings.add(books);
			System.out.println("your bbokings is confirmed");
		}
		else {
			System.out.println("sorry,bus is full.try another bus or date");
		}
	}
}
	}

}
