import java.util.Scanner;

public class remdupwithoutcollections {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String k = s.next();
        s.close();

        char[] karr = k.toCharArray();
        int length = karr.length;

        char[] uniqueChars = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (karr[i] == uniqueChars[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueChars[index++] = karr[i];
            }
        }

        System.out.print("The unique characters are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(uniqueChars[i]);
        }
    }
}
