
public class KhacHangNuocNgoai extends KhachHang {
	public String quocTich;

	protected KhacHangNuocNgoai() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected KhacHangNuocNgoai(String quocTich) {
		super();
		this.quocTich = quocTich;
	}

	protected KhacHangNuocNgoai(int maKH, int soLuong, double donGia, double thanhTien, String ngayHD, String hoTenKH) {
		super(maKH, soLuong, donGia, thanhTien, ngayHD, hoTenKH);
		// TODO Auto-generated constructor stub
	}

	protected String getQuocTich() {
		return quocTich;
	}

	protected void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public double thanhTien()
	{
		return this.thanhTien =this.soLuong * this.donGia;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Khach Hang Nuoc Ngoai:"+super.toString()+"Quoc Tich: "+quocTich +"Thanh Tien: "+ thanhTien() ;
	}

	
	
	

	
}
