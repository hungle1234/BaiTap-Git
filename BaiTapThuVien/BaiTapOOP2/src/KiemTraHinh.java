
public class KiemTraHinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron hinhtron = new HinhTron(8);
		HinhChuNhat hinhchunhat = new HinhChuNhat(7, 3);
		HinhVuong hinhvuong = new HinhVuong(5);
		
		HinhChuNhat hinhchunhat2 = new HinhVuong(8);
		
		System.out.println(hinhtron.layThongTin());
		System.out.println(hinhchunhat.layThongTin());
		System.out.println(hinhvuong.layThongTin());
		System.out.println(hinhchunhat2.layThongTin());

	}

}
