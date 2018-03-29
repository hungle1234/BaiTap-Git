import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class KiemTraArrayList {

	public static void main(String[] args) {
//		ArrayList arrayList = new ArrayList<>();
//		arrayList.add(1);
//		arrayList.add(2.5);
//		arrayList.add("abc");
//		arrayList.add('c');
//		arrayList.add(true);
//		
//		for(int i = 0 ; i<arrayList.size() ; i ++)
//			System.out.print(arrayList.get(i)+" ");
//		
//		System.out.println("\n");
//		for(Object o : arrayList) {
//			System.err.print(o.toString()+" ");
//		}
	ArrayList<Student> arrayList = new ArrayList<>();
	arrayList.add(new Student(1,"A"));
	arrayList.add(new Student(2,"B"));
	arrayList.add(new Student(3,"C"));
	arrayList.add(new Student(4,"D"));
	arrayList.add(new Student(5,"E"));

	Collections.sort(arrayList);
	
//	for(int i = 0 ; i<arrayList.size(); i++)
//		System.out.println(arrayList.get(i));
	
	arrayList.add(2,new Student(9, "RKO"));//them
	
	arrayList.remove(3);//xoa
	arrayList.set(2, new Student(10, "HHH"));//sua
	
	
	
	for (Student student :arrayList)
		System.out.println(student.toString());

	
	
	}
}
