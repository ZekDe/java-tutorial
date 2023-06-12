public class DateUtil {
    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean isValidDate(int day, int month, int year)
    {
        return (1 <= day && day <= 31) && (1 <= month && month <= 12) && (year >= 1900)
                && (day <= getDays(month, year));
    }
    public static int getDays(int month, int year)
    {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> {if (isLeapYear(year)) yield 28; yield 29;}
            default -> 31;
        };
    }
    public static int getDayOfYear(int day, int month, int year)
    {
        if(!isValidDate(day, month, year))
            return -1;
        int day_of_year = day;
        switch (month - 1) {
            case 11:
                day_of_year += 30;
            case 10:
                day_of_year += 31;
            case 9:
                day_of_year += 30;
            case 8:
                day_of_year += 31;
            case 7:
                day_of_year += 31;
            case 6:
                day_of_year += 30;
            case 5:
                day_of_year += 31;
            case 4:
                day_of_year += 30;
            case 3:
                day_of_year += 31;
            case 2:
                day_of_year += 28;
                if (isLeapYear(year))
                    ++day_of_year;
            case 1:
                day_of_year += 31;
        }

        return day_of_year;
    }

    public static  int getDayOfWeek(int day, int month, int year)
    {
        int days = getDayOfYear(day, month, year);

        if(days == -1)
            return -1;

        for(int y = 1900; y < year; ++y){
            days += 365;
            if(isLeapYear(y))
                ++days;
        }

        return days % 7;
    }

    public static boolean isWeekend(int day, int month, int year)
    {
        int days = getDayOfWeek(day, month, year);
        return days == 0 || days == 6;
    }

}
