public class NumberUtil
{
    public static int sumDigits(int x)
    {
        int sum = 0;

        while(x != 0) {
            sum += x % 10;
            x /= 10;
        }

        return Math.abs(sum);
    }

    public static boolean isOneDigit(int x)
    {
        int cnt = 0;

        if(x == 0)
            return true;

        while(x != 0) {
            x /= 10;
            ++cnt;
        }
        if(cnt == 1)
            return true;

        return false;
    }

    public static int calculateDigitRoot(int x)
    {
        while(!isOneDigit(x)){
            x = sumDigits(x);
        }
        return x;
    }

    public static int factorial(int ival)
    {
        int retval = 1;

        for(int i = 1; i <= ival; ++i) {
            retval *= i;
        }

        return retval;
    }

    public static boolean isPrime(long val)
    {
        if (val % 2 == 0)
            return val == 2;
        if (val % 3 == 0)
            return val == 3;
        if (val % 5 == 0)
            return val == 5;
        if (val % 7 == 0)
            return val == 7;

        for (long i = 11; i * i < val; i += 2) {
            if (val % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeX(int x)
    {
        boolean flag = true;

        while(!isOneDigit(x)){

            if(!isPrime(x))
                flag = false;

            x = sumDigits(x);
        }

        if(!isPrime(x))
            flag = false;

        return flag;
    }

    public static void printGoldBach(int x)
    {
        if((x & 1) != 0 || x == 0) {
            System.out.println("invalid argument!...");
            return;
        }

        for(int i = 2; i < x; ++i) {
            for(int j = 2; j < i; ++j) {
                if(isPrime(j) && isPrime(i) && (i+j == x)) {
                    System.out.printf("%d + %d = %d%n", j, i, i+j);
                }
            }
        }
    }

    public static int getNumberReverse(int x)
    {
        int retval = 0;

        while(x != 0)
        {
            retval = retval * 10 + x % 10;
            x = x / 10;
        }
        return retval;
    }

    public static boolean isSpecialNumber(int abc)
    {
        boolean flag1, flag2, flag3, flag4, flag5, flag6, flag7;

        int _abc = abc;
        int cb = 0, ab = 0;
        int cba = getNumberReverse(abc);
        int _cba = cba;

        for(int i = 0; i < 2; ++i)
        {
            cb = cb * 10 + abc % 10;
            abc /= 10;
        }
        abc = _abc;

        for(int i = 0; i < 2; ++i)
        {
            ab = ab * 10 + cba % 10;
            cba /= 10;
        }
        cba = _cba;

        int bc = getNumberReverse(cb);
        int ba = getNumberReverse(ab);

        flag1 = cba > abc;
        flag2 = isPrime(abc);
        flag3 = isPrime(cba);
        flag4 = isPrime(ab);
        flag5 = isPrime(bc);
        flag6 = isPrime(cb);
        flag7 = isPrime(ba);


        return flag1 && flag2 && flag3 && flag4 && flag5 && flag6 && flag7;
    }
}
