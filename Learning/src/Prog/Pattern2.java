package Prog;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		int n=5;
       
        /*for(int i=1;i<=n;i++) {
        	 char letter='A';  //if it's not inside for loop it will increase
        	for(int j=1;j<=i;j++) {
        		System.out.print(letter+" ");
        		letter++;
        	}
        	System.out.println(" ");
        }*/
		
		for (int i = 1; i <= n; i++) {
			// char letter='A';
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(65+j-1) + " ");

			}
			System.out.println(" ");

		}

	}

}
