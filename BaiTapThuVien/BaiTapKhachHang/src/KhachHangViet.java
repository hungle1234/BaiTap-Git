
public class KhachHangViet extends KhachHang {
	public int loaiKH,dinhMuc;

	public KhachHangViet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHangViet(int maKH, int soLuong, double donGia, double thanhTien, String ngayHD, String hoTenKH) {
		super(maKH, soLuong, donGia, thanhTien, ngayHD, hoTenKH);
		// TODO Auto-generated constructor stub
	}
	
	public int getLoaiKH() {
		return loaiKH;
	}

	public void setLoaiKH(int loaiKH) {
		this.loaiKH = loaiKH;
	}

	public int getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Khach Hang Viet Nam"+super.toString();
	}
	
	
	
	
}
