
public class KiemTra {
	public static void main(String[] args) {
	ChuyenXe cx = new ChuyenXe("001", "Tai", "1001", 1000);
	ChuyenXeNgoaiThanh ngoaithanh = new ChuyenXeNgoaiThanh("001", "Tai", "1001", 1000, "Vung Tau",5);
	ChuyenXeNoiThanh noithanh = new ChuyenXeNoiThanh("001", "Tai", "1001", 1000, 50, 2000);
	
	System.out.println(cx.LayThongTin());
	System.out.println(ngoaithanh.LayThongTin());
	System.out.println(noithanh.LayThongTin());
	}
	
	
	
	
	
}
