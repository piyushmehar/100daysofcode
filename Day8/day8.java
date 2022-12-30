import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
      
    int st=0,ed=A.length()-1;
    while(st<ed){
        if(A.charAt(st)==A.charAt(ed)){
            st++;
            ed--;
            continue;
        }
        else{
            System.out.print("No");
            System.exit(0);
        }

    }
    System.out.print("Yes");
    }
}



