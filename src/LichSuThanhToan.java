import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class LichSuThanhToan extends JFrame implements ActionListener {
	private JTable table;
	private JTextField textField;
	public LichSuThanhToan() {
		getContentPane().setLayout(null);
		setTitle("Lịch Sử Thanh Toán");
		setSize(540,540);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Từ Ngày");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 111, 59, 19);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lịch Sử Thanh Toán");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_1.setBounds(83, 24, 376, 56);
		getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(269, 112, 144, 21);
		getContentPane().add(comboBox);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSearch.setBounds(427, 112, 85, 21);
		getContentPane().add(btnSearch);
		btnSearch.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 146, 502, 303);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnExit = new JButton("Thoát");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExit.setBounds(20, 468, 85, 21);
		getContentPane().add(btnExit);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(362, 470, 150, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tổng");
		lblNewLabel_2.setBounds(293, 473, 45, 13);
		getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(89, 112, 120, 21);
		getContentPane().add(comboBox_1);
		
		JLabel lbln = new JLabel("Đến");
		lbln.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbln.setBounds(219, 111, 64, 19);
		getContentPane().add(lbln);
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
		new LichSuThanhToan();
	}
}
