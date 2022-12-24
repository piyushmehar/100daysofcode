import java.util.*;
import java.io.*;

class Solution{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();

    for(int i=1; i<=q; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int x = 2;
        for(int j=0; j<n; j++){
            int multiply = (int)Math.pow(x,j); 
            sum = sum + (b * multiply);
            System.out.print((a + sum) + " ");
    }
    System.out.println();
    }
}

}
