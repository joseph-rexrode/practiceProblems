package javaCode.minimumTripTime;

public class MinimumTripTimeTest {
    public static void main(String[] args) {
        MinimumTripTime test = new MinimumTripTime();

        int[] times = {5,10,10};

        int testTrips = 9;

        int[] timestwo = {1,2,3};

        int testTriptwo = 5;

        System.out.println(test.minimumTime(timestwo, testTriptwo));

        System.out.println(test.minimumTime(times, testTrips));
    }
}
