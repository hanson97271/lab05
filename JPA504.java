import java.util.*;
public class JPA504 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
    	System.out.print("Input the number n: ");
    	int n = keyboard.nextInt();
    	
    	System.out.printf("Ans: %d\n", sum2(n));
    }
    
    static int sum2(int n) {
    	if(n == 1)
    		return 2;
    	return sum2(n - 1) + 2 * n;
    }
}
