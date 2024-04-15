import java.util.*;
public class JPA502 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
    	int n;
    	do {
    		System.out.print("Input n (0 <= n <= 16):");
    		n = keyboard.nextInt();
    		
    		if(n >= 0 && n <= 16) {
    			System.out.printf("%d 的階乘(尾端遞迴) = %d\n", n,fac(n, 1));
    			System.out.printf("%d 的階乘(迴圈) = %d\n", n,facloop(n));
    		}
    	} while(n != 999);
    }
    
    static int fac(int n, int ans) {
    	if(n == 1)
    		return ans;
    	else
    		return fac(n - 1, n * ans);
    }
    
    static int facloop(int n) {
    	int ans = 1;
    	
    	for(int i = 2;i <= n;i++)
    		ans *= i;
    	
    	return ans;
    }
}
