package javaCode.kClosestPoints;

public class KClosest {
    public int[][] kClosest(int[][] points, int k) {
        double[][] distances = new double[points.length][2];
        int[][] answers = new int[k][2];

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            distances[i][0] = distance;
            distances[i][1] = i;
        }

        System.out.println("distance 1: " + distances[0][0] + 
                            "\ndistance 2: " + distances[1][0]);

        for (int j = 1; j < distances.length; j++) {
            while (distances[j][0] < distances[j - 1][0]) {
                double[] temp = {distances[j][0], distances[j][1]};
                distances[j][0] = distances[j - 1][0];
                distances[j][1] = distances[j - 1][1];
                distances[j - 1][0] = temp[0];
                distances[j - 1][1] = temp[1];
                j--;
            }
        }

        System.out.println("new distance 1: " + distances[0][0] + 
                            "\nnew distance 2: " + distances[1][0]);

        for (int l = 0; l < k; l++) {
            int position = (int)distances[l][1];
            answers[l] = points[position];
        }

        return answers;
    }
}
