public class LeapYear {
    public static void main(String[] args) {

        boolean result = isLeapYear(1924);
        System.out.println(result);
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2016));


    }

    public static boolean isLeapYear(int year) {

        if (year>1 && year< 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else
                        return false;
                } else
                    return true;
            } else
                return false;
        }
        return  false;
    }
}
