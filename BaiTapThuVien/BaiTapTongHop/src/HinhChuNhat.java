
public class HinhChuNhat extends Hinh {
	public int chieudai;
	public int chieurong;
	
	public HinhChuNhat(String mausac, int chieudai, int chieurong) {
		super(mausac);
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	public int getChieudai() {
		return chieudai;
	}

	public void setChieudai(int chieudai) {
		this.chieudai = chieudai;
	}

	public int getChieurong() {
		return chieurong;
	}

	public void setChieurong(int chieurong) {
		this.chieurong = chieurong;
	}

	@Override
	public String getMausac() {
		// TODO Auto-generated method stub
		return super.getMausac();
	}

	@Override
	public void setMausac(String mausac) {
		// TODO Auto-generated method stub
		super.setMausac(mausac);
	}

	@Override
	public double ChuVi() {
		// TODO Auto-generated method stub
		return 2*(chieudai+chieurong);
	}

	@Override
	public double DienTich() {
		// TODO Auto-generated method stub
		return chieudai*chieurong;
	}

	@Override
	public String LayThongTin() {
		// TODO Auto-generated method stub
		return chieudai +" "+ chieurong + " " + getMausac() + " "+ChuVi() + " "+ DienTich();
	}
	
	
	
	
	
	
}

