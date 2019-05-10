public class Main {

    public static String calcRectArea(/* int a, int b*/){

        /*
        //calculates the area of a rectangle
        int area = a*b;

        //the output you see in the console with the calculated area
        String result = "The area of the rectangle is: " + area + "cm².";
        */

        //the arrays with the width and height values
        int[] widths = {20, 40, 10, 70};
        int[] heights = {30, 50, 10, 100};

        //define the variables once in the beginning to be able to access them later
        int area2 = 0;
        String result2 = "";

        for (int i =0; i < widths.length; i++){
            area2 = widths[i]*heights[i];

            //the output you see in the console with the calculated area
            result2 += "The area of the rectangle is: " + area2 + "cm².\n";

        }

        //returns the result
        return result2;
    }

    public static String calcSquareArea(int a){

        //calculates the area of a square
        double area = Math.pow(a, 2.0);

        //takes the number a times four for the boundary
        int perimeter = a*4;

        //the output you see in the console with the calculated area and the perimeter
        String result = "The area of the square is: " + (int) area + "cm² and the squarePerimeter is: "+ perimeter + " cm.";

        //returns the result
        return result;

    }

    public static void main(String[] args) {

        /*
        //calcRectArea with different values
        System.out.println(calcRectArea(20, 30));
        System.out.println(calcRectArea(40, 50));
        System.out.println(calcRectArea(10, 10));
        System.out.println(calcRectArea(70, 100));
         */

        //calcRectArea with different values
        System.out.println(calcRectArea());

        //calcSquareArea with different values
        System.out.println(calcSquareArea(4));
        System.out.println(calcSquareArea(8));
        System.out.println(calcSquareArea(12));
        System.out.println(calcSquareArea(16));

    }
}
