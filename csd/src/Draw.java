public class Draw {
    /*
    *   |*   |
    *   | *  |
    *   |  * |
    *   |   *|
    *   |  * |
    *   | *  |
    *   |*   |
    *   | *  |
    *   |  * |
    *
    * */
    public static void printBouncePattern(int height, int width) {
        boolean direction = false;
        --width;

        for(int i = 0; i < height; ++i) {
            if((i % width) == 0)
            {
                direction = !direction;
            }

            for(int j = 0; j < width + 1 ; ++j) {
                if(j == 0) {
                    System.out.print("|");
                }

                putAsterisk(direction, i, j, width);

                if(j == width) {
                    System.out.print("|");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void putAsterisk(boolean direction, int i, int j, int width) {
        if(direction){
            if(j == i % width) {
                System.out.print("*");
            }
        }
        else {
            if(j == (width - i % width)) {
                System.out.print("*");
            }
        }
    }
}
