public class LeapYear {
    public static void main(String[] args) {
        int[] years = new int[] {2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010};
        for(int i = years.length -1;i >= 0; i--) {
            isLeapYear(years[i]);
        }
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
