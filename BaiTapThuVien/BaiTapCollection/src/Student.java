
public class Student implements Comparable<Student> {
	public int id;
	public String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		return (-1)*this.name.compareToIgnoreCase(o.name);//sap xep giam dan
		return o.name.compareToIgnoreCase(this.name);//sap xep giam dan(C2)

	}
	
	
	
	
	

}
