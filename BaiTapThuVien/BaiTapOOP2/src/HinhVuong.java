
public class HinhVuong extends HinhChuNhat {
	private int canh;
	
	public HinhVuong(int canh)
	{
		super(canh, canh);
		this.canh=canh;
	}

	public int getCanh() {
		return canh;
	}

	public void setCanh(int canh) {
		this.canh = canh;
	}

	@Override
	public String layThongTin() {
		// TODO Auto-generated method stub
		return "*Hinh Vuong:\nCanh:"+ canh +"\n"+
				"Chu Vi:" + tinhChuVi()+"\n"+
				"Dien Tich:"+tinhDienTich();
	}
	
	
}
