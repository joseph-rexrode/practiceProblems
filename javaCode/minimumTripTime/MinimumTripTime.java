package javaCode.minimumTripTime;

public class MinimumTripTime {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long maxTime = 0;

        // gets max time
        for (int i = 0; i < time.length; i++) {
            maxTime = (time[i] > maxTime) ? time[i]: maxTime;
        }

        long right = totalTrips * maxTime;

        while (left < right) {
            long numOfTrips = 0;
            long mid = (right + left) / 2;

            // this gets total number of trips for particular time
            for (int i = 0; i < time.length; i++) {
                numOfTrips += (mid / time[i]);
            }

            // if greater than needed trips, cut in half and search left side
            if (numOfTrips >= totalTrips) {
                right = mid;
                continue;
            }

            // if less than needed trips, cut in half and search right side
            left = mid + 1;
            continue;
        }

        return left;
    }
}
