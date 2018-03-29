
public class ChuyenXeNoiThanh extends ChuyenXe {
	private int sotuyen;
	private int sokm;
	
	
	public ChuyenXeNoiThanh(String masoCX, String hotenTX, String soXe, double doanhThu, int sotuyen, int sokm) {
		super(masoCX, hotenTX, soXe, doanhThu);
		this.sotuyen = sotuyen;
		this.sokm = sokm;
	}


	public int getSotuyen() {
		return sotuyen;
	}


	public void setSotuyen(int sotuyen) {
		this.sotuyen = sotuyen;
	}


	public int getSokm() {
		return sokm;
	}


	public void setSokm(int sokm) {
		this.sokm = sokm;
	}


	@Override
	public String LayThongTin() {
		// TODO Auto-generated method stub
		return "Chuyen Xe Noi Thanh=" + super.LayThongTin() +"\nSo Tuyen="+sotuyen +
				"\nSo Km="+sokm;
	}
				
}
	
	
