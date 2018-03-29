
public class ChuyenXeNgoaiThanh  extends ChuyenXe{
	private String noiden;
	private int songay;
	
	
	public ChuyenXeNgoaiThanh(String masoCX, String hotenTX, String soXe, double doanhThu, String noiden, int songay) {
		super(masoCX, hotenTX, soXe, doanhThu);
		this.noiden = noiden;
		this.songay = songay;
	}


	public String getNoiden() {
		return noiden;
	}


	public void setNoiden(String noiden) {
		this.noiden = noiden;
	}


	public int getSongay() {
		return songay;
	}


	public void setSongay(int songay) {
		this.songay = songay;
	}


	public String LayThongTin() {
		// TODO Auto-generated method stub
		return "Chuyen Xe Ngoai Thanh=" +super.LayThongTin() +  
				"Noi Den="+noiden +
				"So Ngay="+songay;
	}
	

}
