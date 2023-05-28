public class Test {
    public static void run(){

        System.out.println("Homework-002, Soru 4: ");
        Draw.printBouncePattern(23, 7);

        System.out.println("Homework-002, Soru 5: ");
        NumberUtil.printGoldBach(122);

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
        System.out.println("Homework-003, Soru 3: ");
        System.out.printf("%d%n", NumberUtil.calculateDigitRoot(36987));

    }
}
