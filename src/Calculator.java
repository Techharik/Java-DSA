import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));


        int result  = 0;

        while(true){

            System.out.print("Enter the Operator ");
            char op = in.next().trim().charAt(0);

            if( op == '+' || op == '-' ||op == '*' ||op == '/' ||op == '%' ){

                System.out.print("Enter the number ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    result = num1 + num2;
                }
                if(op == '-'){
                    result = num1 - num2;
                }
                if(op == '*'){
                    result = num1 * num2;
                }
                if(op == '/'){
                    result = num1 /num2;
                }
                if(op == '%'){
                    result = num1 % num2;
                }


                System.out.println(result);

            }else if (op == 'x' || op == 'X'){
                System.out.println("bye");
                 break;
            }else{
                System.out.println("Invalid Operations");
            }



        }
    }
}
