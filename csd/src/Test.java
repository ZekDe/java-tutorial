public class Test {
    public static void run(){

        System.out.println("Homework-002, Soru 1: ");
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("enter an integer for diamon: ");
        int ival = kb.nextInt();
        Diamond.printDiamond(ival);

        System.out.println("Homework-002, Soru 2: ");
        System.out.print("enter ms for date-time: ");
        long ms = kb.nextInt();
        PrintSomething.printDuration(ms);

        System.out.println("Homework-002, Soru 3: ");
        System.out.print("enter a number for prime-factors: ");
        ival = kb.nextInt();
        NumberUtil.printPrimeFactors(ival);

        System.out.println("Homework-002, Soru 4: ");
        BallFall.play(23, 7);

        System.out.println("Homework-002, Soru 5: ");
        System.out.print("enter a number for GoldBach: ");
        ival = kb.nextInt();
        NumberUtil.printGoldBach(ival);

        System.out.println("Homework-003, Soru 1: ");
        for(int i = 0; i < 1000; ++i) {
            if(NumberUtil.isSpecialNumber(i))
                System.out.printf("%d%n", i);
        }

        System.out.println("Homework-003, Soru 2: ");
        for(int i = 0, c = 0; i < 1000; ++i) {
            if(NumberUtil.isPrimeX(i))
            {
                System.out.printf("%d ", i);
                if(++c % 10 == 0)
                    System.out.println();
            }
        }
        System.out.println();

        System.out.println("Homework-003, Soru 4: ");
        for(int i = 0; i < 100001; ++i) {
            if(NumberUtil.isFactorian(i))
            {
                System.out.printf("%d ", i);
            }
        }

    }
}
