public class Draw {

    /*
      |     *      |
      |    ***     |
      |   *****    |
     */
    public static void printDiamond(int ival)
    {
        int star_cnt = 1;
        int space_cnt = ival;
        for(int i = 0; i < ival; ++i) {
            for(int k = 0; k < space_cnt - 1; ++k)
                System.out.print(" ");
            for(int k = 0; k < star_cnt; ++k)
                System.out.print("*");

            star_cnt += 2;
            --space_cnt;
            System.out.println();
        }

        star_cnt -= 4;
        space_cnt += 2;

        for(int i = 0; i < ival; ++i) {
            for(int k = 0; k < space_cnt - 1; ++k)
                System.out.print(" ");
            for(int k = 0; k < star_cnt; ++k)
                System.out.print("*");

            star_cnt -= 2;
            ++space_cnt;
            System.out.println();
        }
    }

    public static void printDuration(long ms)
    {
        long h, m, s;
        if(ms == 0)
            return;

        s = ms / 1000;
        h = s / 3600;
        m = s / 60;

        s = s - m * 60;
        m = m - h * 60;

        System.out.printf("%d:%d:%d%n", h, m, s);
    }



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
