
public class HinhTron {
	private double bankinh;
	private String mausac;

	public HinhTron() {
		super();
	}
	
	public HinhTron(double bankinh, String mausac) {
		super();
		this.bankinh = bankinh;
		this.mausac = mausac;
	}


	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	public String getMausac() {
		return mausac;
	}

	public void setMausac(String mausac) {
		this.mausac = mausac;
	}
	
	public double TinhChuVi()
	{
		return bankinh*2*3.14;
	}
	
	public double TinhDienTich()
	{
		return bankinh*bankinh*3.14;
	}
	
	public String LayThongTin()
	{
		return 	"Ban Kinh:" +bankinh +"\n"+
				"Mau sac:" 	+mausac +"\n"+
				"Chu Vi:" 	+TinhChuVi()+"\n"+
				"Dien Tich:"+ TinhDienTich() + "\n";	
	}
	
		
}

