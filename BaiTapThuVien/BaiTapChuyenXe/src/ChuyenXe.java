
public class ChuyenXe {
	private String masoCX;
	private String hotenTX;
	private String SoXe;
	private double DoanhThu;
	
	
	public ChuyenXe(String masoCX, String hotenTX, String soXe, double doanhThu) {
		super();
		this.masoCX = masoCX;
		this.hotenTX = hotenTX;
		SoXe = soXe;
		DoanhThu = doanhThu;
	}


	public String LayThongTin() {
		return "Ma so chuyen xe="+masoCX+
				",Ho ten tai xe="+hotenTX+
				",So xe="+SoXe+
				",Doanh thu="+DoanhThu;
	}
}
