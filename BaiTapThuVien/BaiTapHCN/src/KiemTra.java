import java.util.Scanner;

public class KiemTra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin hinh chu nhat");
		
		System.out.println("Nhap chieu dai:");
		int chieudai = sc.nextInt();
		
		System.out.println("Nhap chieu rong");
		int chieurong = sc.nextInt();
		
		HinhChuNhat hinhchunhat = new HinhChuNhat(chieudai,chieurong);
		System.out.println("Chu Vi Hinh Chu Nhat:" + hinhchunhat.ChuVi());
		System.out.println("Dien tich Hinh Chu Nhat:"+hinhchunhat.DienTich());
				
		System.out.println("================================");
		System.out.println("Nhap thong tin hinh vuong:");
		System.out.println("Nhap canh:");
		int canh = sc.nextInt();
		HinhVuong hinhvuong = new HinhVuong(canh);
		System.out.println("Chu Vi Hinh Vuong:"+hinhvuong.ChuVi());
		System.out.println("Dien Tich Hinh Vuong:"+hinhvuong.DienTich());

	}

}
