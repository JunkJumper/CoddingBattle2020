import java.util.Scanner;

public class a_tickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfTickets = Integer.parseInt(sc.nextLine());
		int p1Price = Integer.parseInt(sc.nextLine());
		int p2Price = Integer.parseInt(sc.nextLine());
		int p3Price = Integer.parseInt(sc.nextLine());
		
		int totalPrice = 0;
		
		for (int i = 0; i < numberOfTickets; i++) {
			if(i < 100) {
				totalPrice += p1Price;
			} else if(i < 200) {
				totalPrice += p2Price;
			} else {
				totalPrice += p3Price;
			}
		}
		
		System.out.println(totalPrice);
		
		sc.close();
	}

}
