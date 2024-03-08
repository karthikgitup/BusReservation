package buspack;

public class Bus {
private	int busno;
public boolean getAc() {
	return ac;
}

public void setAc(boolean ac) {
	this.ac = ac;
}
public int getBusno() {
	return busno;
}


public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

private	boolean ac;
private	int capacity;
	 
	Bus(int busno,boolean ac,int capacity){
		this.busno=busno;
		this.ac=ac;
		this.capacity=capacity;
		
	}
public void displayinfo() {
	System.out.println("BusNo:"+" "+busno+"Ac:"+" "+ac+"capacity:"+" "+capacity);
}
}
