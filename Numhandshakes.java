import java.util.*;
public class Numhandshakes {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans  =0;
	     for(int i = n ;i>0 ; i--) {
	        ans = ans + (i-1);
	     }
	     System.out.println(ans);
	}

}
