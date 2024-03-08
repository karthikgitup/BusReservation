package buspack;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	Scanner obj=new Scanner(System.in);
	String name;
	int busnum;
	Date date;
	Booking(){
		System.out.println("enter the name");
		name=obj.next();
		System.out.println("enter the busnum");
		busnum=obj.nextInt();
		System.out.println("enter the date");
		String inputdate=obj.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(inputdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusno()==busnum) {
				capacity=bus.getCapacity();
			}
		}
		int booked=0;
		for(Booking bok:bookings) {
			if(bok.busnum==busnum && bok.date.equals(date)) {
				booked++;
				
				
			}
		}
		return booked<capacity?true:false;
		
	}

}
