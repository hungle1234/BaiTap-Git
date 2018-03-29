
public class HinhChuNhat {
	public int chieudai;
	public int chieurong;
	
	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HinhChuNhat(int chieudai, int chieurong) {
		super();
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
	
	public double ChuVi()
	{
		return (chieudai+chieurong)*2;
	}
	
	public double DienTich()
	{
		return chieudai*chieurong;
	}
	
	public String LayThongTin()
	{
		return chieudai +" " + chieurong;
	}
	
}
