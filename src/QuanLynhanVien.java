import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class QuanLynhanVien extends JFrame implements ActionListener {
	private JTextField tfSearch;
	private JTable table;
	public QuanLynhanVien() {
		getContentPane().setLayout(null);
		setTitle("Quản Lý Nhân Viên");
		setSize(540,540);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Tìm Kiếm");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 111, 75, 19);
		getContentPane().add(lblNewLabel);
		
		tfSearch = new JTextField();
		tfSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSearch.setBounds(95, 111, 175, 19);
		getContentPane().add(tfSearch);
		tfSearch.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Danh Sách Nhân Viên");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_1.setBounds(83, 24, 376, 56);
		getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(293, 112, 120, 21);
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
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAdd.setBounds(41, 466, 85, 21);
		getContentPane().add(btnAdd);
		btnAdd.addActionListener(this);
		
		JButton btnEdit = new JButton("Sửa");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEdit.setBounds(158, 466, 85, 21);
		getContentPane().add(btnEdit);
		btnEdit.addActionListener(this);
		
		JButton btnDel = new JButton("Xóa");
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDel.setBounds(288, 466, 85, 21);
		getContentPane().add(btnDel);
		btnDel.addActionListener(this);
		
		JButton btnExit = new JButton("Thoát");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExit.setBounds(413, 466, 85, 21);
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
		new QuanLynhanVien();
	}
}
