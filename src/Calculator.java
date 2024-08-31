import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Math;
import java.awt.Color;
public class Calculator {
	
	private JFrame frame;
	private JTextField textField;
	
	double One; // We initialize these two var for arithmetic operations, so that we can hold the values to be
	double Two; // added, subtracted, multiplied, or divided.
	double Total; // FInal value after calculation
	
	String action;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.setBackground(new Color(51, 51, 51));
		frame.setBounds(100, 100, 715, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(187, 238, 253));
		textField.setBounds(8, 26, 683, 53);
		textField.setFont(new Font("Dubai Medium", Font.PLAIN, 60));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(105, 105, 105));
		btn1.setBounds(8, 103, 60, 53);
		btn1.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btn1.getText();
				textField.setText(num);
			}
		});
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(105, 105, 105));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn2.getText();
				textField.setText(num);
			}
		});
		btn2.setBounds(88, 103, 60, 53);
		btn2.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(105, 105, 105));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn3.getText();
				textField.setText(num);
			}
		});
		btn3.setBounds(175, 103, 60, 53);
		btn3.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(105, 105, 105));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btn4.getText();
				textField.setText(num);
			}
		});
		btn4.setBounds(8, 179, 60, 53);
		btn4.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(105, 105, 105));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btn5.getText();
				textField.setText(num);
			}
		});
		btn5.setBounds(88, 179, 60, 53);
		btn5.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(105, 105, 105));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btn6.getText();
				textField.setText(num);
			}
		});
		btn6.setBounds(175, 179, 60, 53);
		btn6.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btn6);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(105, 105, 105));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btn8.getText();
				textField.setText(num);
			}
		});
		btn8.setBounds(88, 254, 60, 53);
		btn8.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(105, 105, 105));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btn7.getText();
				textField.setText(num);
			}
		});
		btn7.setBounds(8, 254, 60, 53);
		btn7.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btn7);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(105, 105, 105));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btn9.getText();
				textField.setText(num);
			}
		});
		btn9.setBounds(175, 254, 60, 53);
		btn9.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(105, 105, 105));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btn0.getText();
				textField.setText(num);
			}
		});
		btn0.setBounds(8, 327, 140, 53);
		btn0.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btn0);
		
		JButton Equals = new JButton("=");
		Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Two = Double.parseDouble(textField.getText());
				if (action == "+") {
					Total = One + Two; 
					answer = Double.toString(Total);
					textField.setText(answer);
					
				} else if (action == "-") {
					Total = One - Two; 
					answer = Double.toString(Total);
					textField.setText(answer);
					
				} else if (action == "*") {
					Total = One * Two; 
					answer = Double.toString(Total);
					textField.setText(answer);
					
				} else if (action == "/") {
					Total = One / Two; 
					answer = Double.toString(Total);
					textField.setText(answer);
					
				} else if (action == "X^Y") {
					Double n = 1.0;
					int i = 0;
					while (i < Two) {
						n = One * n;
						i++;
					}
					answer = Double.toString(n);
					textField.setText(answer);
				}
			}
		});
		Equals.setBounds(291, 391, 264, 53);
		Equals.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(Equals);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(new Color(105, 105, 105));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				One = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "/";
			}
		});
		btnDivide.setBounds(495, 103, 60, 53);
		btnDivide.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btnDivide);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBackground(new Color(105, 105, 105));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				One = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "*";
			}
		});
		btnMultiply.setBounds(427, 103, 60, 53);
		btnMultiply.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		frame.getContentPane().add(btnMultiply);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.setBackground(new Color(105, 105, 105));
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				One = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "-";
			}
		});
		btnSubtract.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		btnSubtract.setBounds(359, 103, 60, 53);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(new Color(105, 105, 105));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				One = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "+";
			}
		});
		btnAdd.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		btnAdd.setBounds(291, 103, 60, 53);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(105, 105, 105));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnDot.getText();
				textField.setText(num);
			}
		});
		btnDot.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		btnDot.setBounds(175, 327, 60, 53);
		frame.getContentPane().add(btnDot);
		
		JButton SqrRoot = new JButton("sqrt");
		SqrRoot.setBackground(new Color(105, 105, 105));
		SqrRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x = Double.parseDouble(textField.getText());
				x = Math.sqrt(x);
				textField.setText(String.valueOf(x));
			}
		});
		SqrRoot.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		SqrRoot.setBounds(563, 179, 128, 53);
		frame.getContentPane().add(SqrRoot);
		
		JButton btnDel = new JButton("C");
		btnDel.setBackground(new Color(105, 105, 105));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String point = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt((textField.getText().length()) - 1);
					point = str.toString();
					textField.setText(point);
				}
				
			}
		});
		btnDel.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		btnDel.setBounds(563, 103, 128, 53);
		frame.getContentPane().add(btnDel);
		
		JButton btnDeleteAll = new JButton("DEL");
		btnDeleteAll.setBackground(new Color(255, 187, 187));
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(null);
				
			}
		});
		btnDeleteAll.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		btnDeleteAll.setBounds(583, 391, 100, 53);
		frame.getContentPane().add(btnDeleteAll);
		
		JButton btnSquared = new JButton("X^2");
		btnSquared.setBackground(new Color(105, 105, 105));
		btnSquared.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sqr = Double.parseDouble(textField.getText());
				sqr = sqr * sqr;
				textField.setText(String.valueOf(sqr));
			}
		});
		btnSquared.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		btnSquared.setBounds(291, 179, 128, 53);
		frame.getContentPane().add(btnSquared);
		
		JButton btnCubed = new JButton("X^3");
		btnCubed.setBackground(new Color(105, 105, 105));
		btnCubed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cube = Double.parseDouble(textField.getText());
				cube = cube * cube * cube;
				textField.setText(String.valueOf(cube));
			}
		});
		btnCubed.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		btnCubed.setBounds(431, 179, 124, 53);
		frame.getContentPane().add(btnCubed);
		
		JButton btnNSquared = new JButton("X^?");		
		btnNSquared.setBackground(new Color(105, 105, 105));
		btnNSquared.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				One = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "X^Y";
			}
		});
		btnNSquared.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		btnNSquared.setBounds(291, 254, 128, 53);
		frame.getContentPane().add(btnNSquared);
	}
}
