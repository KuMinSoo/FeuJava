package OOP2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class MyTvv{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	int cnt=-1;

	ArrayList<Integer> cc =new ArrayList<Integer>();
	
	public void setIsPowerOn(boolean b) {
		this.isPowerOn=b;
	}
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	
	public void setChannel(int a) {
		if(MAX_CHANNEL<a) {
			return;
		}else if(a<MIN_CHANNEL)
			return;
		channel=a;
		cc.add(channel);
		cnt++;
	}
	public int getChannel() {
		return channel;
	}
	public void setVolume(int a) {
		if(MAX_VOLUME<a) {
			return;
		}else if(MIN_VOLUME>a) {
			return;
		}
		 volume=a;
		
	}

	
	public int getVolume() {
		return volume;
	}

	public void gotoPrevChannel() {
		if(cnt==0) {
			cnt=cc.size()-1;
			channel=cc.get(cnt);
			return;
		}
		if(cnt==-1) return;
		channel=cc.get(--cnt);
		
	}

}


public class Ex3 {

	public static void main(String[] args) {
		MyTvv t=new MyTvv();
		
		t.setChannel(30);
		System.out.println("CH: "+t.getChannel());
		t.setChannel(1000);
		
		System.out.println("CH: "+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL: "+t.getVolume());
		t.setVolume(-10);
		System.out.println("VOL: "+t.getVolume());
		System.out.println("===========");
		
		MyTvv v=new MyTvv();
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
		
		MyTvv e=new MyTvv();
		
		e.gotoPrevChannel();
		System.out.println("ch: "+e.getChannel());
	}

}
