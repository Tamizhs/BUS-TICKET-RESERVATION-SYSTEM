package bus_reserv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no, boolean ac, int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public int getbusNo() {
		return busNo;
	}
	public boolean isAC(){
		return ac;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	
	public void setac(boolean ac) {
		this.ac=ac;
	}
	public void setCapacity(int cap) {
		capacity=cap;
	}
	public void displayBusInfo(){
		System.out.println("Bus no:"+busNo+" Is ac: "+ac+" Capacity: "+capacity);
	}

}


