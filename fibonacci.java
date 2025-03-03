
public class fibonacci {

	public static void main(String[] args) {
		int n = 10;
		int a=0;
		int b = 1;
		int c =0;
		System.out.println(a+ " "+ b);
		for(int i=2;i<n;i++) {
			c= a+b;
			a = b;
			b =c;
			System.out.println(c);
		}
	}

}
