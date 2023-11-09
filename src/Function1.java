import java.util.Scanner;

public class Function1 {
//  static   int num1 = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int ans = sum(num1, num2);
        System.out.println(ans);
        {
//            int num1
        }

    }

//    static int sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2 = in.nextInt();
//
//        int sum = num1 + num2;
//
//        return sum;
//    }


    //arguments and paramerters:
    static int sum(int a , int b){
//        num1 = 10;
//        System.out.println(num1);
        int sum = a + b;
        return sum;
    }
}
