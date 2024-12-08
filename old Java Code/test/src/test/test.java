//package test;

//public class test {
//	
//}

package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
public class Calculator extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	JPanel[] row = new JPanel[5];
	JButton[] button = new JButton[19];
	String[] buttonString = {"1","2","3","+",
							 "4","5","6","-",
							  "7","8","9","*",
							  ".","/","C","?",
							  "+/-","=","0"};
	
	int[] dimW = {430,70,150,140};
	int[] dimH = {50,60};
	
	Dimension displayDimention = new Dimension(dimW[0],dimH[0]);
	Dimension regularDimension = new Dimension(dimW[1],dimH[1]);
	Dimension rColumnDimension = new Dimension(dimW[2],dimH[1]);
	Dimension zeroButDimension = new Dimension(dimW[3],dimH[1]);
	
	boolean[]  function = new boolean[4];
	double[] temporary = {0,0};
	
	JTextArea display = new JTextArea(2,25);
	
	Font font = new Font("Times new Roman",Font.BOLD,20);
	
	Calculator(){
		super("Calculator");
		setDesign();
		setSize(500,350);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(5,5);
		setLayout(grid);
		
		
		for(int i = 0; i < 4;i++) {
			function[i] = false;
		}
		
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
		FlowLayout f2 = new FlowLayout(FlowLayout.CENTER,1,1);
		for(int i = 0; i<5;i++) {
			row[i] = new JPanel();
		}
		
		row[0].setLayout(f1);
		
		for(int i = 1;i<5;i++) {
			row[i].setLayout(f2);
		}
		
		for (int i = 0; i < 19; i++) {
			button[i] = new JButton();
			button[i].setText(buttonString[i]);
			button[i].setBackground(Color.blue);
			button[i].setFont(font);
			button[i].addActionListener(this);
		}
		
		display.setFont(font);
		display.setEditable(false);
		display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		display.setPreferredSize(displayDimention);
		
		for(int i = 0;i<14;i++) {
			button[i].setPreferredSize(regularDimension);
		}
		for (int i = 14; i <18; i++) {
			button[i].setPreferredSize(rColumnDimension);
		}
		button[18].setPreferredSize(zeroButDimension);
		
		row[0].add(display);
		add(row[0]);
		
		for(int i = 0;i<4;i++) {
			row[1].add(button[i]);
		}
		row[1].add(button[14]);
		add(row[1]);
		
		for(int i = 4;i<8;i++) {
			row[2].add(button[i]);
		}
		row[2].add(button[15]);
		add(row[2]);
		
		
		for(int i = 8;i<12;i++) {
			row[3].add(button[i]);
		}
		row[3].add(button[16]);
		add(row[3]);
		
		row[4].add(button[18]);
		for(int i = 12;i<14;i++) {
			row[4].add(button[i]);
		}
		row[4].add(button[17]);
		add(row[4]);
		
		setVisible(true);

	}
	
	public void clear() {
		try {
			display.setText("");
			for(int i = 0;i<4;i++) {
				function[i] = false;
			}
			for(int i = 0;i<2;i++) {
				temporary[i] = 0;
			} 
		}catch(NullPointerException e) {
			
		}
	}
		public void getSqrt() {
			try {
				double value = Math.sqrt(Double.parseDouble(display.getText()));
				display.setText(Double.toString(value));
			}catch(NumberFormatException e){
				
			}
		}
		
		public void getPosNeg() {
			try {
				double value = Double.parseDouble(display.getText());
				if(value != 0) {
					value = value *(-1);
				}else {
					
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
		
		public void getResult() {
			double result = 0;
			temporary[1] = Double.parseDouble(display.getText());
			try {
				if(function[2] == true) {
					result = temporary[0] * temporary[1];
				}else if(function[3] == true) {
					result = temporary[0] / temporary[1];
				}else if(function[0] == true) {
					result = temporary[0] + temporary[1];
				}else if(function[1] == true) {
					result = temporary[0]= temporary[1];
				}
				display.setText(Double.toString(result));
				for(int i = 0;i < 4;i++) {
					function[i] = false;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
		
		
		public final void setDesign() {
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
