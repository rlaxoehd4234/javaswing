package 시계앱;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame{
	
	
	
		Calendar calendar;
		SimpleDateFormat timeFormat;
		SimpleDateFormat dayFormat;
		SimpleDateFormat dateFormat;
		JLabel timeLabel;
		JLabel dayLabel;
		JLabel dateLabel;
		String time;
		String day;
		String date;

		MyFrame() {
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Clock Program");
			this.setLayout(new FlowLayout());
			this.setSize(350,200);
			this.setResizable(false);
			
			timeFormat = new SimpleDateFormat("hh:mm:ss a");
			dayFormat = new SimpleDateFormat("EEEE");
			dateFormat = new SimpleDateFormat("MM dd, yy");
			
			timeLabel = new JLabel();
			timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
			timeLabel.setForeground(new Color(0x00ff00));
			timeLabel.setBackground(Color.black);
			timeLabel.setOpaque(true);
			
			
			dayLabel = new JLabel();
			dayLabel.setFont(new Font("Verdana",Font.PLAIN,35));
			
			dateLabel = new JLabel();
			dateLabel.setFont(new Font("Verdana",Font.PLAIN,35));
			
			time = 	timeFormat.format(Calendar.getInstance().getTime());
			day = dayFormat.format(Calendar.getInstance().getTime());
			date = dateFormat.format(Calendar.getInstance().getTime());
			
			timeLabel.setText(time);
			dayLabel.setText(day);
			dateLabel.setText(date);
			
			this.add(dateLabel);
			this.add(timeLabel);
			this.add(dayLabel);
			this.setVisible(true);
			
			setTime();
			
			
		}
		
		public void setTime() {
			
			while(true) {
				time = 	timeFormat.format(Calendar.getInstance().getTime());
				
				timeLabel.setText(time);
				
				
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
}
