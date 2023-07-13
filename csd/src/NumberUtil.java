public class NumberUtil {
    public static int sumDigits(int x) {
        int sum = 0;

        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }

        return Math.abs(sum);
    }

    public static int factorial(int x) {
        int retval = 1;

        if (x == 0)
            return 1;

        for (int i = 1; i <= x; ++i) {
            retval *= i;
        }

        return retval;
    }

    public static boolean isFactorian(int x) {
        int sum = 0;
        int _x = x;
        if (x == 0)
            return false;

        while (_x != 0) {
            sum += factorial(_x % 10);
            _x /= 10;
        }

        return sum == x;
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

    public static long indexOfPrime(long n) {
        int i = 1;
        long a = 2;

        while(true){
            if(a == n)
                return i;
            if(isPrime(a))
                ++i;
            ++a;
        }
    }


    public static boolean isPrimeX(int x)
    {
        boolean result;
        for(int sum = x; (result = isPrime(sum)) && sum > 9; sum = sumDigits(sum))
            ;
            return result;
    }

    public static void printGoldBach(int x)
    {
        if ((x & 1) != 0 || x == 0) {
            System.out.println("invalid argument!...");
            return;
        }

        for (int a = 2; a <= x - 1; ++a) {
            int b = x - a;
            if (isPrime(a) && isPrime(b) && a <= b) {
                System.out.printf("%d + %d = %d%n", a, b, a + b);
            }
        }
    }

    public static void printPrimeFactors(int x) {
        for (int i = 2; x != 1; i++) {
            if (x % i == 0) {
                System.out.printf("%d ", i);
                x /= i;
                --i;
            }
        }
        System.out.println();
    }

    public static int getNumberReverse(int x) {
        int retval = 0;

        while (x != 0) {
            retval = retval * 10 + x % 10;
            x = x / 10;
        }
        return retval;
    }

    public static int nextClosestFibonacci(int val) {
        if (val < 0)
            return 0;
        int prev1 = 1, prev2 = 0, next;
        while (true) {
            next = prev1 + prev2;
            if (val < next)
                return next;
            prev2 = prev1;
            prev1 = next;
        }
    }

    public static int nextClosestPrimeFibonacci(int val) {
        if (val < 0)
            return 0;
        int prev1 = 1, prev2 = 0, next;
        while (true) {
            next = prev1 + prev2;
            if (val < next && isPrime(next))
                return next;
            prev2 = prev1;
            prev1 = next;
        }
    }

    public static int fibonacciNumber(int n) {
        if (n <= 2)
            return n - 1;
        int prev1 = 1, prev2 = 0, val = prev1 + prev2;
        for (int i = 3; i < n; ++i) {
            prev2 = prev1;
            prev1 = val;
            val = prev1 + prev2;
        }
        return val;
    }

    public static boolean isSuperPrime(int x)
    {
        return isPrime(x) && isPrime(indexOfPrime(x));
    }

    public static int countDigits(int val)
    {
        return val != 0 ? (int)Math.log10(Math.abs(val)) + 1 : 1;
    }
}
