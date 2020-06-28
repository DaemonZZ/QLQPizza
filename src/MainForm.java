import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.Font;

public class MainForm extends JFrame implements ActionListener {
	private JTable table;
	private JTextField textField;
	public MainForm() {
		setTitle("PizzaPazza");
		setSize(1280,720);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenu mnQuanLy = new JMenu("Quản Lý");
		menuBar.add(mnQuanLy);
		
		JMenu mnThongKe = new JMenu("Thống Kê");
		menuBar.add(mnThongKe);
		getContentPane().setLayout(null);
		
		JButton btnLogOut = new JButton("Đăng Xuất");
		btnLogOut.setBackground(Color.YELLOW);
		btnLogOut.setFont(new Font("Dialog", Font.BOLD, 10));
		btnLogOut.setBounds(10, 10, 99, 85);
		getContentPane().add(btnLogOut);
		
		JButton btnThongKe = new JButton("Thống Kê");
		btnThongKe.setBackground(Color.YELLOW);
		btnThongKe.setFont(new Font("Dialog", Font.BOLD, 10));
		btnThongKe.setBounds(134, 10, 99, 85);
		getContentPane().add(btnThongKe);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBackground(Color.YELLOW);
		btnMenu.setFont(new Font("Dialog", Font.BOLD, 10));
		btnMenu.setBounds(254, 10, 99, 85);
		getContentPane().add(btnMenu);
		
		JButton btnExit = new JButton("Thoát");
		btnExit.setBackground(Color.YELLOW);
		btnExit.setFont(new Font("Dialog", Font.BOLD, 10));
		btnExit.setBounds(381, 10, 99, 85);
		getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(20, 105, 460, 538);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(29, 39, 97, 96);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(171, 39, 97, 96);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(314, 39, 97, 96);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setForeground(Color.BLUE);
		btnNewButton_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(171, 162, 97, 96);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(29, 162, 97, 96);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("New button");
		btnNewButton_2_1.setForeground(Color.BLUE);
		btnNewButton_2_1.setBackground(Color.GREEN);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2_1.setBounds(314, 162, 97, 96);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setForeground(Color.BLUE);
		btnNewButton_1_2.setBackground(Color.GREEN);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_2.setBounds(171, 293, 97, 96);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(29, 293, 97, 96);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_2_2 = new JButton("New button");
		btnNewButton_2_2.setForeground(Color.BLUE);
		btnNewButton_2_2.setBackground(Color.GREEN);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2_2.setBounds(314, 293, 97, 96);
		panel.add(btnNewButton_2_2);
		
		JButton btnNewButton_1_3 = new JButton("New button");
		btnNewButton_1_3.setForeground(Color.BLUE);
		btnNewButton_1_3.setBackground(Color.GREEN);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_3.setBounds(171, 415, 97, 96);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.setBackground(Color.GREEN);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setBounds(29, 415, 97, 96);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_2_3 = new JButton("New button");
		btnNewButton_2_3.setForeground(Color.BLUE);
		btnNewButton_2_3.setBackground(Color.GREEN);
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2_3.setBounds(314, 415, 97, 96);
		panel.add(btnNewButton_2_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(536, 10, 255, 85);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbClock = new JLabel("New label");
		lbClock.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbClock.setBounds(10, 10, 219, 29);
		panel_1.add(lbClock);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setForeground(new Color(153, 50, 204));
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(33, 45, 185, 34);
		panel_1.add(rdbtnNewRadioButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(505, 105, 182, 30);
		getContentPane().add(comboBox);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setBounds(706, 105, 85, 30);
		getContentPane().add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(515, 154, 276, 461);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(801, 10, 455, 184);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(30, 21, 80, 29);
		panel_2.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(801, 204, 455, 308);
		getContentPane().add(scrollPane_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(1105, 533, 151, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lbTong = new JLabel("Tổng");
		lbTong.setBounds(1064, 534, 64, 16);
		getContentPane().add(lbTong);
		
		JButton btnEdit = new JButton("Sửa");
		btnEdit.setBounds(801, 532, 85, 21);
		getContentPane().add(btnEdit);
		
		JButton btnChange = new JButton("Chuyển bàn");
		btnChange.setBounds(896, 532, 113, 21);
		getContentPane().add(btnChange);
		
		JButton btnPay = new JButton("Thanh Toán");
		btnPay.setBounds(1125, 562, 106, 89);
		getContentPane().add(btnPay);
		setVisible(true);
		
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		try {
            while (true) {
                Calendar calendar = Calendar.getInstance();
                String time = format.format(calendar.getTime());
                lbClock.setText(time);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new MainForm();
	}
}
