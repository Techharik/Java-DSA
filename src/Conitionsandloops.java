import java.util.Scanner;

public class Conitionsandloops {
    public static void main(String[] args) {
// Q: Finding the maximum value of the given 3 three numbers;

        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();


        int max = a;

        if(max < b){
            max =b;
        } else if (max <c) {
            max=c;
        }

        System.out.println(max);

    }
}
