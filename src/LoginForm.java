import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame implements ActionListener {
	private JPasswordField passwordField;
	public LoginForm() {
		getContentPane().setLayout(null);
		setTitle("Đăng nhập");
		setSize(443,420);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Pizza");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 45));
		lblNewLabel.setBounds(91, 30, 165, 74);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPazza = new JLabel("Pazza");
		lblPazza.setForeground(Color.RED);
		lblPazza.setFont(new Font("Lucida Bright", Font.BOLD, 45));
		lblPazza.setBounds(176, 79, 165, 74);
		getContentPane().add(lblPazza);
		
		JLabel lblNewLabel_1 = new JLabel("Vị Trí");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(25, 182, 81, 22);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mã NV");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(25, 234, 81, 22);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mật Khẩu");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(25, 284, 81, 22);
		getContentPane().add(lblNewLabel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(116, 184, 225, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(116, 237, 225, 22);
		getContentPane().add(comboBox_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 288, 225, 19);
		getContentPane().add(passwordField);
		
		JButton btnLogIn = new JButton("Đăng Nhập");
		btnLogIn.setBounds(238, 337, 106, 32);
		getContentPane().add(btnLogIn);
		
		JButton btnExit = new JButton("Thoát");
		btnExit.setBounds(70, 337, 106, 32);
		getContentPane().add(btnExit);
		btnExit.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Thoát")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new LoginForm();
	}
}
