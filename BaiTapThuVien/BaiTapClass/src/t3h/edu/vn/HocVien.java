package t3h.edu.vn;

import t3h.edu.lib.Person;

public class HocVien extends Person {
	private int id;
	private String name;
	private String bod;
	private String address;
	// private : pt dong goi 
	
	//Overloading
	//ko doi so 
	public HocVien() {
		super();
	}
	//nhieu doi so
	public HocVien(int id, String name, String bod, String address) {
		super();
		this.id = id;
		this.name = name;
		this.bod = bod;
		this.address = address;
	}

	 //tinh dong goi 
	public int getId() {
		return id;
	}
	
	
	@Override //overiding: phuong thuc ghi dè
	public String Laythongtin() {
		return id + " " + name +" " +bod +" " + address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBod() {
		return bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
