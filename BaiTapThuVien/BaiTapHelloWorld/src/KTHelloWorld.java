import java.util.Scanner;

public class KTHelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hay nhap so:");
		int a = scanner.nextInt();//nhap so 
		System.out.println("So da nhap la :" + a );	
		if(a % 2 == 0)
		{
			System.out.println("So chan");
		}
		else 
		{
			System.out.println("So le");
		}
		if(a == 1 || a == 0)
		{
			System.out.println("ko la snt");
		}
		if(a== 2 || a == 3)
		{
			System.out.println("la snt");
		}
		if(a>3)
		{
			int d = 1;
			for (int i = 2 ; i <= a ; i ++){
				if(a % i ==0 )
				{
					d++;
				}
			}
				
				if (d > 2 )
				{
					System.out.println("ko la snt");
				}
				else {
					System.out.println("la snt");
				}
			
		}
	
		
		
			
	}
	
	
	

}
