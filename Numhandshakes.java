import java.util.*;
public class Numhandshakes {

	public static void main(String[] args) {
		/* 1   2  3  4    5    6 
		 * 0   1  3  6    10   15 => 0 2 6 12 14
		 */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans  =0;
	     for(int i = n ;i>0 ; i--) {
	        ans = ans + (i-1);
	     }
	     System.out.println(ans);
	}

}
