
public class TestDate {
    public static void run()
    {
        //dateValidationTest();
        //dayOfYearTest();
        dayOfWeekTest();
    }
    public static void dateValidationTest()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        while(true){
            System.out.print("Enter day month year :");
            int day = kb.nextInt();
            int month = kb.nextInt();
            int year = kb.nextInt();

            if(day == 0 && month == 0 && year == 0)
                break;
            if(DateUtil.isValidDate(day, month, year))
                System.out.printf("%02d/%02d/%04d\n", day, month, year);
            else
                System.out.print("Invalid Date!...\n");
        }
    }

    public static void dayOfYearTest()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        while(true){
            System.out.print("Enter day month year :");
            int day = kb.nextInt();
            int month = kb.nextInt();
            int year = kb.nextInt();
            int day_of_year = DateUtil.getDayOfYear(day, month, year);

            if(day == 0 && month == 0 && year == 0)
                break;
            if(day_of_year != -1)
                System.out.printf("%02d/%02d/%04d = %d\n", day, month, year, day_of_year);
            else
                System.out.print("Invalid Date!...\n");
        }
    }

    public static void dayOfWeekTest()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        while(true){
            System.out.print("Enter day month year :");
            int day = kb.nextInt();
            int month = kb.nextInt();
            int year = kb.nextInt();
            int day_of_week = DateUtil.getDayOfWeek(day, month, year);
            System.out.println(day_of_week);
        }
    }

}
