package OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass1 {

	public static void main(String[] args) {
		Button b=new Button("statr");
		b.addActionListener(new EventHandler());

	}

}
class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action Event occureed");
		
	}
	
}