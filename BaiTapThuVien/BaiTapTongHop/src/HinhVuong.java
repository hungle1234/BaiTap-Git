
public class HinhVuong extends HinhChuNhat {

	public HinhVuong(String mausac, int a) {
		super(mausac, a,a);
	}

	@Override
	public String LayThongTin() {
		// TODO Auto-generated method stub
		return getChieudai() +" "+ getMausac() + " "+ ChuVi() + " "+ DienTich();
	}
	
	
	
}
