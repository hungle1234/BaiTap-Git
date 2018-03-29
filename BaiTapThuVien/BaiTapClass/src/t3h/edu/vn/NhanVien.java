package t3h.edu.vn;

import t3h.edu.lib.Person;

public class NhanVien extends Person
{
	private int id;
	private String name;
	
	
	public NhanVien() 
	{
		super();
	}

	public NhanVien(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	@Override
	public String Laythongtin() 
	{
		return id +" " +name;
	}
	
	
	
}
