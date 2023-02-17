package OOP1;

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUMN =100;
	final int MIN_VOLUMN=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	void turnOnOff() {
		isPowerOn=!isPowerOn;
	}

	void volumnUp() {
		if(volume<MAX_VOLUMN) 
			volume++;
	}
	
	void volumnDown() {
		if(volume>MIN_VOLUMN)
			volume--;
	}
	
	void channelUp() {
		
		if(channel==MAX_CHANNEL) {
			channel=MIN_CHANNEL;
		}else {
			channel++;
		}
			
	}
	
	void channelDown() {
		channel=channel==MIN_CHANNEL?MAX_CHANNEL:--channel;	
	
	}

}
public class Ex5 {

		
	public static void main(String[] args) {
		MyTv t=new MyTv();
		t.channel=100;
		t.volume=0;
		System.out.println("CH: "+t.channel+", VOL:"+t.volume);
		
		t.channelDown();
		t.volumnDown();
		System.out.println("CH: "+t.channel+", VOL:"+t.volume);
		
		t.volume=100;
		t.channelUp();
		t.volumnUp();
		System.out.println("CH: "+t.channel+", VOL:"+t.volume);
		
		
		
		
	}

}
