
public class HinhTron extends Hinh {
	public double bankinh;

	public HinhTron(String mausac, double bankinh) {
		super(mausac);
		this.bankinh = bankinh;
	}

	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	@Override
	public double ChuVi() {
		// TODO Auto-generated method stub
		return 2*bankinh*3.14;
	}

	@Override
	public double DienTich() {
		// TODO Auto-generated method stub
		return bankinh*bankinh*3.14;
	}

	@Override
	public String LayThongTin() {
		// TODO Auto-generated method stub
		return bankinh + " "+ this.getMausac() + " "+ ChuVi()+ " "+ DienTich();
	}

	
	
}
