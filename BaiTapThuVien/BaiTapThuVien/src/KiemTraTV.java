import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KiemTraTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date date = new Date(System.currentTimeMillis());//lay thong tin ngay gio hien huu,tra ve don vi miligiay
//		
//		System.out.println(date.toString());
//		
//		DateFormat dateFormat= DateFormat.getDateInstance(DateFormat.SHORT);//khoi tao dinh dang
//		
//		System.out.println(dateFormat.format(date));//apply vao thong so
//		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
//		
//		
//		System.out.println(simpleDateFormat.format(date));
//		
//		Calendar ca = Calendar.getInstance();
//		System.out.println(ca.get(ca.DATE)+"/"+(ca.get(ca.MONTH)+1)+"/"+ca.get(ca.YEAR));
//		
//		System.out.println(ca.getTime());//tra ve toan bo 
		
		try {
			FileInputStream fis = new FileInputStream("D:\\text01.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			
			while(line!=null)
			{
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			System.out.println(sb.toString());
			
			br.close();
			isr.close();
			fis.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
