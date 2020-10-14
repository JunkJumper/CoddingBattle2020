import java.util.Scanner;

public class c_tout_le_monde_entend {

	public static int getSeatAmount(String[] s) {
		int ret = 0;
		
		for(int i = 0; i < s.length; i++) {
			ret += Integer.parseInt(s[i]);
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		
		boolean possible = true;
		
		Scanner sc = new Scanner(System.in);

		int rowAmount = Integer.parseInt(sc.nextLine());
		String seatAmount = sc.nextLine();
		int spectatorAmount = Integer.parseInt(sc.nextLine());
		String hearingLevel = sc.nextLine();
		
		int[] specByLevel = new int[rowAmount];
		
		String[] sA = seatAmount.split(" ");
		String[] hL = hearingLevel.split(" ");
		
		if(spectatorAmount > getSeatAmount(sA)) {
			possible = !possible;
		}
		
		
		
		for(int i = 0; i < sA.length;i++) {
			specByLevel[(Integer.parseInt(sA[i])-1)]++;
		}
		
		
		for(int i = 0; i < specByLevel.length;i++) {
			System.out.print(specByLevel[i]+"-");
		}
		//System.out.println(specByLevel);
		
		sc.close();

	}

}
