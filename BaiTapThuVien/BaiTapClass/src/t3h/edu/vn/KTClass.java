package t3h.edu.vn;

public class KTClass {

	public static void main(String[] args) {
		//tinh dong goi 
				HocVien hv = new HocVien(10,"Hùng","15/3/2018","t3h");
				
				//Tinh da hinh
				System.out.println(hv.Laythongtin());
				NhanVien nv = new NhanVien(18,"Hank");
				System.out.println(nv.Laythongtin());
			}
		
	}

