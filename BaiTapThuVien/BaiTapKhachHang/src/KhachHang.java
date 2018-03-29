
public class KhachHang {
	protected int maKH,soLuong;
	protected double donGia,thanhTien;
	protected String ngayHD,hoTenKH;
	
	protected KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected KhachHang(int maKH, int soLuong, double donGia, double thanhTien, String ngayHD, String hoTenKH) {
		super();
		this.maKH = maKH;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
		this.ngayHD = ngayHD;
		this.hoTenKH = hoTenKH;
	}

	protected int getMaKH() {
		return maKH;
	}

	protected void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	protected int getSoLuong() {
		return soLuong;
	}

	protected void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	protected double getDonGia() {
		return donGia;
	}

	protected void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	protected double getThanhTien() {
		return thanhTien;
	}

	protected void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	protected String getNgayHD() {
		return ngayHD;
	}

	protected void setNgayHD(String ngayHD) {
		this.ngayHD = ngayHD;
	}

	protected String getHoTenKH() {
		return hoTenKH;
	}

	protected void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}

	@Override
	public String toString() {
		return "Khach Hang" +" "+getMaKH() +" "+ getSoLuong() +" "+ donGia +" "+ thanhTien+" "+
						" "+ ngayHD + " " + hoTenKH;
	}
	
	
	
	
	
	
	
	

	
}
