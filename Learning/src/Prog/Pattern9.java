package Prog;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
       for(int i=1;i<=n;i++){
    	   char letter='A';
    	 for(int k=1;k<=n-i;k++) {
    		 System.out.print(" ");
    	 }
    	 for(int j=1;j<=i;j++) {
    		 System.out.print(letter+" ");
    		 letter++;
    	 }
    	 System.out.println(" ");
       }
	}

}
