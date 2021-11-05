public class MyPyramid {
    public void printPyramid(){
        int rows = 5;

        for (int i = 1; i <= rows; ++i) { //Outer loop

            for (int j = 1; j <= i; ++j) { //Inner Loop

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
