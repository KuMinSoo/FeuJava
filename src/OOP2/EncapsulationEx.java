package OOP2;

public class EncapsulationEx {

	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour<0 || hour>23) return;
		this.hour=hour;
	}
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int minute) {
		if(minute<0||minute>59) return;
		this.minute=minute;
	}
	
	public int getMinute() {
		return minute;
	}

	public void setSecond(int second) {
		if(second<0||second>59) return;
		this.second=second;
	}
	public int getSecond() {
		return second;
	}
	
	public static void main(String[] args) {
		
		EncapsulationEx en =new EncapsulationEx();
		en.setHour(40);
		System.out.println(en.hour);
		
		
	}

}
