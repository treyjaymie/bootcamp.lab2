import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the Invoice Total Calculator\n");
		
		int invoiceCount = 0;
		float averageInvoice = 0.0f;
		float averageDiscount = 0.0f;
		
		INVOICE:
		while (true) 
		{	
			System.out.print("\nEnter subtotal:		");
			invoiceCount++;
			int subtotal = in.nextInt();
			
			
			System.out.print("Discount percent:	");
			float discPer = in.nextFloat();
			float discAmt = subtotal * discPer;
			float invoiceTotal = subtotal - discAmt;
			averageDiscount += discAmt;
			
			System.out.println(String.format(
					"Discount amount:	%.01f", discAmt
					));
			System.out.println(String.format(
					"Invoice total:		%.01f", invoiceTotal
					));
			averageInvoice += invoiceTotal;
			
			while (true)
			{
				System.out.print("\nContinue? (y/n) : ");
				String ans = in.next().toLowerCase();
				
				if (ans.equals("n"))
					break INVOICE;
				else if (ans.equals("y"))
					continue INVOICE;
			}
		}
		
		System.out.println("\nNumber of invoices:	" + invoiceCount);
		System.out.println("Average invoice:	" +
				averageInvoice/invoiceCount);
		System.out.println("Average discount:	" +
				averageDiscount/invoiceCount);
	}

}
