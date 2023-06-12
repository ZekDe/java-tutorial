public class PrintSomething {


    public static void printDuration(long ms)
    {
        long h, m, s;
        if(ms == 0)
            return;

        s = ms / 1000;

        h = s / 3600;
        m = s / 60 % 60;
        s = s % 60;

        System.out.printf("%d:%d:%d%n", h, m, s);
    }


}
