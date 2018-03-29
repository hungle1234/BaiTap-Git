
public class HinhChuNhat implements iHinh {
	public int chieuDai;
	public int chieuRong;

	
	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return chieuDai*chieuRong;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return (chieuDai+chieuRong)*2;
	}

	@Override
	public String layThongTin() {
		// TODO Auto-generated method stub
		return "*Hinh Chu Nhat:\nChieu Dai:"+chieuDai+"\n"+
				"Chieu Rong:"+chieuRong+ "\n"+
				"Chu Vi:"+tinhChuVi()+ "\n" +
				"Dien Tich "+tinhDienTich();
	}

}
