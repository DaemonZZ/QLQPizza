
public class Menu {
	private String maSP;
	private String tenSP;
	private int gia;
	
	
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int i) {
		this.gia = i;
	}
	
	public Menu() {
		this.maSP="";
		this.tenSP="";
		this.gia=0;
	}
	public Menu(String maSP, String tenSP, int gia) {
		this.maSP = maSP;
		this.tenSP =tenSP;
		this.gia = gia;
	}
}
