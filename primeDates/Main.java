package primeDates;
public class Main {

    public static int month[];
    public static void main (String[] args) {
        month = new int[15];

        int result = findPrimeDates(30, 12, 2025, 1, 1, 2026);
        System.out.println(result);

    }

    public static void updateLeapYear(int year) {
        if(year % 400 == 0) {
            month[2] = 28;
        } else if(year % 100 == 0) {
            month[2] = 29;
        } else if(year % 4 == 0) {
            month[2] = 29;
        } else {
            month[2] = 28;
        }
    }
    
    public static void storeMonth() {
        month[1] = 31;
        month[2] = 28;
        month[3] = 31;
        month[4] = 30;
        month[5] = 31;
        month[6] = 30;
        month[7] = 31;
        month[8] = 31;
        month[9] = 30;
        month[10] = 31;
        month[11] = 30;
        month[12] = 31;
    }

    public static int findPrimeDates(int d1, int m1, int y1, int d2, int m2, int y2) {
        storeMonth();
    
        int result = 0;
    
        while(true) {
            int x = d1;
            x = x * 100 + m1;
            int y = Integer.parseInt(String.valueOf(x) + y1);
            if(y % 4 == 0 || y % 7 == 0) {
                result = result + 1;
            }
            if(d1 == d2 && m1 == m2 && y1 == y2) {
                break;
            }
            updateLeapYear(y1);
            d1 = d1 + 1;
            if(d1 > month[m1]) {
                m1 = m1 + 1;
                d1 = 1;
                if(m1 > 12) {
                    y1 =  y1 + 1;
                    m1 = m1 + 1;
                }
            }
        }
        return result;
    }
}
