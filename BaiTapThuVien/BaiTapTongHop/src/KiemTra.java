
public class KiemTra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hinhchunhat = new HinhChuNhat("Red", 5, 2);
		HinhTron hinhtron = new HinhTron("Green", 3);
		HinhVuong hinhvuong = new HinhVuong("Blue", 10);
		
		System.out.println(hinhchunhat.LayThongTin());
		System.out.println(hinhtron.LayThongTin());
		System.out.println(hinhvuong.LayThongTin());

	}

}
