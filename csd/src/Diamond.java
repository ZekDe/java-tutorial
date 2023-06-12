public class Diamond {
    /*
  |     *      |
  |    ***     |
  |   *****    |
 */
    private static void fillChar(int begin, int end, char ch)
    {
        for(int i = begin; i < end; ++i)
            System.out.print(ch);
    }
    private static void fillStar(int begin, int end)
    {
        for(int i = begin; i < end; ++i)
            System.out.print("*");
    }
    private static void fillLocation(int index_begin, int index_end, int end, char ch)
    {
        fillChar(0, index_begin, ch);
        fillStar(index_begin, index_end );
        fillChar(index_end, end, ch);
    }
    public static void printDiamond(int n)
    {
        int index_begin = 0;
        int index_end = 10;

        for(int i = 1; i < n + 1; ++i){
            index_begin = n - i;
            index_end = index_begin + 2*i-1;
            fillLocation(index_begin, index_end, 2 * n - 1, '.');
            System.out.println();
        }

        for(int i = 1; i < n; ++i){
            index_begin = i;
            index_end = index_begin + 2 * (n - i) - 1;
            fillLocation(index_begin, index_end, 2 * n - 1, '.');
            System.out.println();
        }

       /* for(int i = 0; i < n; ++i){
            for(int j = 0; j < n - i; ++j)
                System.out.print(' ');
            for(int j = 0; j < 2*i-1; ++j)
                System.out.print('*');

            System.out.println();
        }

        for(int i = 0; i < n; ++i){
            for(int j = 0; j < i; ++j)
                System.out.print(' ');
            for(int j = 0; j < 2*(n-i)-1; ++j)
                System.out.print('*');

            System.out.println();
        }*/
    }
}
