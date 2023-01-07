class Result {

    public int pageCount(int n, int p) {
        // if page is in the middle and book even
        // or earlier in the book => start from beginning
        if ((n - p) >= ((double) n / 2)) {
            int count = 0;
            for (int i = 1; i < n; i += 2, count++) {
                if (p == i || p + 1 == i) {
                    return count;
                }
                else {
                    continue;
                }
            }
        }
        
        // else start at end
        else {
            int count = 0;
            for (int i = n; i > 0; i -= 2, count++) {
                if (n % 2 != 0) {
                    if (p == i || p + 1 == i) {
                        return count;
                    }
                    else {
                        continue;
                    }
                }
                else {
                    if (p == i || p - 1 == i) {
                        return count;
                    }
                    else {
                        continue;
                    }
                }
            }
        }
    return 0;
    }
}

