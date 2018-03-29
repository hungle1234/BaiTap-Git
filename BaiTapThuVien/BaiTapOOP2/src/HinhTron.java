
public class HinhTron implements iHinh {
	private int banKinh;
	
	
	public HinhTron(int banKinh) {
		super();
		this.banKinh = banKinh;
	}
	
	public int getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(int banKinh) {
		this.banKinh = banKinh;
	}


	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return banKinh*banKinh*3.14;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * banKinh * 3.14;
	}

	@Override
	public String layThongTin() {
		// TODO Auto-generated method stub
		return "*Hinh Tron:\nBan Kinh :"+ banKinh+"\n" +
				"Chu Vi:"+tinhChuVi()+"\n"+
				"Dien Tich" +tinhDienTich();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
