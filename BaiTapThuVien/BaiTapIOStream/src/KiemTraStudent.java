import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class KiemTraStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9; 
		int b = 0;
		try {
			int c =a/b;
			System.out.println(c+"");
		}
		catch(Exception ex)
		{
			System.out.println("b=0 roi !!!");
		}
		finally 
		{
			int d = a + b;
			System.out.println(d);
		}
//=============================================================4		
//		ArrayList<Student> arrayList = new ArrayList<>();
//		arrayList.add(new Student(1,"Hung"));
//		arrayList.add(new Student(2,"Viet"));
//		arrayList.add(new Student(3,"Quan"));
//		arrayList.add(new Student(4,"Son"));
//		arrayList.add(new Student(5, "Tin"));
//		
//		try {
//			FileOutputStream fos = new FileOutputStream("D:\\text.txt");
//			BufferedOutputStream bos = new BufferedOutputStream(fos);
//			ObjectOutputStream oos = new ObjectOutputStream(bos);
//			oos.writeObject(arrayList);
//			
//			oos.close();
//			bos.close();
//			fos.close();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//==================================================================3				
//		try {
//			FileOutputStream fileoutputstream = new FileOutputStream("D:\\text.txt");
//			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(fileoutputstream, "UTF-8");
//			
//			BufferedWriter bufferedwriter = new BufferedWriter(outputstreamwriter);
//			for(Student s:arrayList)
//			{
//				bufferedwriter.write(s.getId()+";"+s.getName());
//				bufferedwriter.newLine();
//			}
//								
//			bufferedwriter.close();
//			outputstreamwriter.close();
//			fileoutputstream.close();
//			
//		} catch (Exception e) {
//			
//		}
//====================================================================2
//	try {
//		FileInputStream fileinputstream = new FileInputStream("D:\\text.txt");
//		InputStreamReader inputstreamreader = new InputStreamReader(fileinputstream,"UTF-8");
//		
//		BufferedReader bufferedreader = new BufferedReader(inputstreamreader);//doc file txt
//		String s = bufferedreader.readLine();
//		while(s!=null)
//		{
//			String[] tmp = s.split(";");
//			arrayList.add(new Student(Integer.parseInt(tmp[0]),tmp[1]));
//			s=bufferedreader.readLine();
//			
//		}
//		bufferedreader.close();
//		inputstreamreader.close();
//		fileinputstream.close();
//		
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	for(Student st1:arrayList)
//	{
//		System.out.println(st1.toString());
//	}
//======================================================================1		
//		try {
//			FileInputStream fis = new FileInputStream("D:\\text.txt");
//			BufferedInputStream bis = new BufferedInputStream(fis);
//			ObjectInputStream ois = new ObjectInputStream(bis);
//			arrayList=(ArrayList<Student>) ois.readObject();
//			
//			ois.close();
//			bis.close();
//			fis.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for(Student s:arrayList)
//		{
//			System.out.println(s.toString());
//		}
//		
  }
}

