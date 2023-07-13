public class Main {
    public static void main(String[] args)
    {
        //Test.run();
        //TestDate.run();
        //BallFall.play(7, 27);
        //Diamond.printDiamond(6);
        for(int i = 2; i < 50; ++i)
        {
            if(NumberUtil.isSuperPrime(i))
            {
                System.out.printf("%d ",i);
            }
        }

    }


}
