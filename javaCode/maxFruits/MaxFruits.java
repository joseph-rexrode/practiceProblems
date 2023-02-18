package javaCode.maxFruits;

import java.util.ArrayList;
import java.util.List;

public class MaxFruits {
    public int totalFruit(int[] fruits) {
        // this question is basically asking for longest subarray
        // containing only two numbers

        List<Integer> numFruits = new ArrayList<Integer>();
        int maxFruits = 0;
        int currentFruits = 0;

        for (int i = 0; i < fruits.length; i++) {
            // only add to current fruits number if:
                // numFruits has the fruit in the array
                // if not, numFruits is size 1 or less
            if (numFruits.indexOf(fruits[i]) != -1) {
                currentFruits++;
                if (currentFruits > maxFruits) {
                    maxFruits = currentFruits;
                }
            }

            else {
                if (numFruits.size() < 2) {
                    currentFruits++;
                    numFruits.add(fruits[i]);
                    if (currentFruits > maxFruits) {
                        maxFruits = currentFruits;
                    }
                }

                else {
                    currentFruits = 0;
                    numFruits.clear();
                    i--;
                }
            }
        }
        return maxFruits;
    }
}
