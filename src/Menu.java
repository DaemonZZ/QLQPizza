
public class Menu {
	private String maSP;
	private String tenSP;
	private String gia;
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
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	
	public Menu() {
		this.maSP="";
		this.tenSP="";
		this.gia="";
	}
	public Menu(String maSP, String tenSP, String gia) {
		this.maSP = maSP;
		this.tenSP =tenSP;
		this.gia = gia;
	}
}
