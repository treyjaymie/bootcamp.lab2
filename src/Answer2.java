import java.util.Scanner;

public class Answer2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Download Time Estimator");
		
		ESTIMATOR:
		while (true) {
			System.out.print("\nEnter file size (MB) :	");
			int fileSize = in.nextInt();
			
			System.out.print("Enter download speed (MB/sec) :	");
			int downloadSpeed = in.nextInt();
			
			float downloadTime = fileSize/downloadSpeed;
			
			System.out.println(String.format(
					"This download will take approximately %.0f hours %.0f minutes %.0f seconds",
					downloadTime / 3600,
					downloadTime / 60 ,
					downloadTime % 60
					));
			
			while (true)
			{
				System.out.print("\nContinue? (y/n) : ");
				String ans = in.next().toLowerCase();
				
				if (ans.equals("n"))
					break ESTIMATOR;
				else if (ans.equals("y"))
					continue ESTIMATOR;
			}
		}
		
		
	}
}
