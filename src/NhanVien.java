
public class NhanVien {
	private String maNV;
	private String tenNV;
	private String matKhau;
	private String viTri;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	public NhanVien() {
		this.matKhau="";
		this.maNV="";
		this.viTri="";
		this.tenNV="";
	}
	public NhanVien(String maNV, String tenNV, String matKhau, String viTri) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.matKhau = matKhau;
		this.viTri = viTri;
	}
	
	
	
}
