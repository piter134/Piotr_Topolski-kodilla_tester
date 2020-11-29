public class LeapYear {
    public static void main(String[] args) {

        isLeapYear(2009);
    }
    private static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            System.out.println("Rok " + year + " jest przystępny");
            return true;
        }else {
            System.out.println("Rok " + year + " jest nieprzystępny");
            return false;
        }

    }
}
