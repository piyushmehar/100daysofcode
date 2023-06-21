import java.util.Scanner;

public class Solution {

  public static String getSmallestAndLargest(String s, int k) {
       
        String small= s.substring(0, k);
    String large = s.substring(0, k);
    String temp= " ";
    for(int j=0;j<=s.length()-k;j++) {

        temp = s.substring(j,j+k);
        if(temp.compareTo(small)<0) {
            small=temp;

        }
        if(temp.compareTo(large)>0) {
            large = temp;
        }

    }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return small + "\n" + large;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
