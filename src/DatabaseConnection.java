

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DatabaseConnection {
	protected Connection conn;
	///Tao Lien ket voi SQL Server
	public DatabaseConnection() {
		try {
			String dbURL = "jdbc:sqlserver://localhost\\Thang;user=sa;password=123;database=QLQPizza";
			
			conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
			    System.out.println("Connected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Added your method 
	//
	//
	
	public ArrayList<NhanVien> getListNV(){
		String sql = "select * from NhanVien";
		ArrayList<NhanVien> a = new ArrayList<NhanVien>();
		try {
			PreparedStatement p =conn.prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
				NhanVien nv =new NhanVien();
				nv.setMaNV(rs.getString(1));
				nv.setTenNV(rs.getString(2));
				nv.setMatKhau(rs.getString(3));
				nv.setViTri(rs.getString(4));
				a.add(nv);
			}
			
		} catch (Exception e) {
			
		}
		return a;
	}
	
	public ArrayList<Menu> getListMN(){
		String sql = "select * from Menu";
		ArrayList<Menu> b = new ArrayList<Menu>();
		try {
			PreparedStatement p =conn.prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
				Menu mn = new Menu();
				mn.setMaSP(rs.getString(1));
				mn.setTenSP(rs.getString(2));
				mn.setGia(rs.getInt(3));
				b.add(mn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}
	public static void main(String[] args) {
		new DatabaseConnection();
	}
}
