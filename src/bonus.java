import java.util.Scanner;
public class bonus {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        int width = in.nextInt();

        System.out.print("Enter the height of the rectangle: ");
        int height = in.nextInt();

        int area = width*height;

        System.out.println("The area of your rectangle is: " + area + "cm²");
    }
}
