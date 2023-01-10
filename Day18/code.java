import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
               if(s.trim().equals("")) {
            System.out.println(0) ;
    } else{
    String[] arrOfStr = s.trim().split("[\\s!,?._'@]+");
    System.out.println(arrOfStr.length);
    for (String a : arrOfStr)
            System.out.println(a);
    }
        scan.close();
    }
}

