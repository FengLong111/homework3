package PostBox;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the postal system!");
        System.out.print("Please enter object's length:");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width:");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height:");
        int height = scanner.nextInt();
        Box3 box3 = new Box3(length,width,height);
        Box5 box5 = new Box5(length,width,height);
        if(box3.validate(length,width,height) == true){
            System.out.println("Box3");
        }else if(box5.validate(length,width,height) == true){
            System.out.println("Box5");
        }else{
            System.out.println("No suitable Box size!");
        }

    }
}