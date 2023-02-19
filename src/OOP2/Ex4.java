package OOP2;

class MyTv5 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel; // (previous channel) 이전 채널
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		prevChannel=this.channel;
		this.channel=channel;
	}

	public int getChannel() {
		return channel;
	}

	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class Ex4 {

	public static void main(String[] args) {
		MyTv5 v=new MyTv5();
		v.setChannel(10);
		System.out.println("ch: "+v.getChannel());
		v.setChannel(20);
		System.out.println("ch: "+v.getChannel());
		v.setChannel(30);
		System.out.println("ch: "+v.getChannel());
		v.setChannel(40);
		System.out.println("ch: "+v.getChannel());
		
		System.out.println("===이전 체널변경==");
		
		v.gotoPrevChannel(); 
		System.out.println("ch: "+v.getChannel());
		v.gotoPrevChannel();
		System.out.println("ch: "+v.getChannel());
		v.gotoPrevChannel();
		System.out.println("ch: "+v.getChannel());
		
		v.gotoPrevChannel();
		System.out.println("ch: "+v.getChannel());

		v.gotoPrevChannel();
		System.out.println("ch: "+v.getChannel());

		v.gotoPrevChannel();
		System.out.println("ch: "+v.getChannel());
	
		v.gotoPrevChannel();
		System.out.println("ch: "+v.getChannel());

		v.gotoPrevChannel();
		System.out.println("ch: "+v.getChannel());

		v.gotoPrevChannel();
		System.out.println("ch: "+v.getChannel());
	
		System.out.println("=====new ===");

	}

}
