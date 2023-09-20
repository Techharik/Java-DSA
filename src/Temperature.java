import java.sql.SQLOutput;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("please enter the temp in C");

         float celcius = input.nextFloat();

         float tempF = (celcius * 9/5) +32;
         int result = (int)(tempF);  // type converstion float to int externally.

        System.out.println("The temperature in farenheit is "+ result);
    }
}
