import java.util.HashMap;

public class KiemTraHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> hashMap = new HashMap<>();
		hashMap.put(1, new Student(12, "abc"));
		hashMap.put(2, new Student(11, "abc"));
		hashMap.put(3, new Student(8, "abc"));
		hashMap.put(4, new Student(4, "abc"));

		//duyet theo key
		for(int i :hashMap.keySet())
		{
			System.out.println(hashMap.get(i));
		}
		//duyet theo value
		for(Student s:hashMap.values())
		{
			System.out.println(s.toString());
			
		}
	}

}
