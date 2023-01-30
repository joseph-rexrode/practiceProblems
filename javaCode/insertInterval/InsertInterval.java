package javaCode.insertInterval;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // base case
        if (intervals.length == 0) {
            int[][] ans = new int[1][2];
            ans[0] = newInterval;
            return ans;
        }

        // to find where to insert we need to find where overlap is, if anywhere
        // declare answer variable to follow along as we go
        int[][] answer = new int[intervals.length + 1][2];
        boolean lowerTaken = false, upperTaken = false;
        int newArrayLength = 0;

        // iterate through intervals
        for (int i = 0, j = 0; i < answer.length && j < intervals.length; i++, j++) {
            // if upper value taken, overlap has been accounted for
            if (upperTaken) {
                answer[i][0] = intervals[j][0];
                answer[i][1] = intervals[j][1];
                newArrayLength++;
                continue;
            }

            // if lower value isn't taken yet and first new value less than int[j][0]
                // -> change lowertaken to true
                // -> set answer[i][0] to newInterval[0]
            if (!lowerTaken) {
                if (newInterval[0] < intervals[j][0]) {
                    lowerTaken = true;
                    answer[i][0] = newInterval[0];
                }
                // else if first new value is greater than int[j][0] AND less than int[j][1]
                    // change lowerTaken to true
                    // set answer[i][0] to intervals[j][0]
                else if ((newInterval[0] >= intervals[j][0]) && 
                        (newInterval[0] <= intervals[j][1])) {
                    lowerTaken = true;
                    answer[i][0] = intervals[j][0];
                    
                    if (newInterval[1] <= intervals[j][1]) {
                        answer[i][1] = intervals[j][1];
                        upperTaken = true;
                        newArrayLength++;
                        continue;
                    }
                }

                else {
                    answer[i][0] = intervals[j][0];
                    answer[i][1] = intervals[j][1];
                    newArrayLength++;
                    continue;
                }
            }

            // anything that gets here will have lowerTaken = true
            while (j < intervals.length) {
                if (intervals[j][0] > newInterval[1]) {
                    answer[i][1] = newInterval[1];
                    j--;
                    upperTaken = true;
                    break;
                }
                else if (intervals[j][0] == newInterval[1] || 
                        intervals[j][1] > newInterval[1]) {
                    answer[i][1] = intervals[j][1];
                    upperTaken = true;
                    break;
                }
                else {
                    j++;
                }
            }

            // if upperTaken still not true here, means newInterval[1] is largest value
            if (!upperTaken) {
                answer[i][1] = newInterval[1];
                upperTaken = true;
            }
            newArrayLength++;
        }

        if (!lowerTaken) {
            newArrayLength++;
        }

        int[][] realAnswer = new int[newArrayLength][2];

        for (int k = 0; k < realAnswer.length; k++) {
            realAnswer[k] = answer[k];
        }

        if ((realAnswer[newArrayLength - 1][0] == 0) && (realAnswer[newArrayLength][1] == 0)) {
            realAnswer[newArrayLength - 1] = newInterval;
        }

        return realAnswer;
    }
}
