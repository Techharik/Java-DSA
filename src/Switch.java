import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

//        Old

        switch (fruit){
            case "orange":
                System.out.println("The given fruit is orange");
                break;
            case "mango":
                System.out.println("The King of fruits");
                break;
            default:
                System.out.println("Onum Illa poda");

        }

//newer One

//        switch (fruit) {
//            case "orange" -> System.out.println("The given fruit is orange");
//            case "mango" -> System.out.println("The King of fruits");
//            default -> System.out.println("Onum Illa poda");
//        }
    }
}
