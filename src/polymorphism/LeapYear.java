package polymorphism;

public class LeapYear {
    public static void main(String[] args) {
        for (int year = 2000; year <= 2100 ; year++) {
            if(isLeapYear(year)){
                System.out.println(year);
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
