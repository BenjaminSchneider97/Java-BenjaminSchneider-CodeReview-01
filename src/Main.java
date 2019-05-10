public class Main {

    private static String calcRectArea(int width, int height) {
        //calculates the area of a rectangle
        return "The area of the rectangle is: " + width * height + "cm²";
    }

    private static String calcSquareArea(int width) {
        //calculates the area of a square
        return "The area of the square is: " + width*width + "cm²";
    }

    private static String calcSquarePerimeter(int width) {
        //calculate the Periemter of a Square
        return "The perimeter of the square is: " + width*4 + "cm";
    }

    //1
    public static void main(String[] args) {

        //2
        System.out.println("\n2.");
        int width = 5;
        int height = 2;
        int area = width*height;
        System.out.println(area);

        //3
        System.out.println("\n3.");

        int width1 = 20;
        int height1 = 30;
        System.out.println(calcRectArea(width1, height1));

        int width2 = 40;
        int height2 = 50;
        System.out.println(calcRectArea(width2, height2));

        //4
        System.out.println("\n4.");

        int width3 = 4;
        System.out.println(calcSquareArea(width3));

        int width4 = 4;
        System.out.println(calcSquarePerimeter(width4));

        int width5 = 2;
        System.out.println(calcSquarePerimeter(width5));

        //5
        System.out.println("\n5.");

        System.out.println(calcRectArea(1, 1));
        System.out.println(calcRectArea(2, 2));
        System.out.println(calcRectArea(3, 3));
        System.out.println(calcRectArea(4, 4));

        System.out.println(calcSquareArea(1));
        System.out.println(calcSquareArea(2));
        System.out.println(calcSquareArea(3));
        System.out.println(calcSquareArea(4));

        System.out.println(calcSquarePerimeter(1));
        System.out.println(calcSquarePerimeter(2));
        System.out.println(calcSquarePerimeter(3));
        System.out.println(calcSquarePerimeter(4));

        //Bonus 1
        System.out.println("\nBonus 1");

        int[] widths = {14, 8, 11, 13};
        int[] heights = {16, 14, 18, 19};

        for(int i = 0; i < widths.length; i++){
            System.out.println(calcRectArea(widths[i], heights[i]));
        }

        //Bonus 2


    }
}
