import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

    Locale IND = new Locale("en","IN");
    String india = NumberFormat.getCurrencyInstance(IND).format(payment);

    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
}

    }
