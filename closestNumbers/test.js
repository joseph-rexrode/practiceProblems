function closestNumbers(arr) {
    // sort arr
    
    // iterate through arr
    
        // if diff obj doesn't exist or difference is lower
            // add both ints to new diff obj
        // if difference is same
            // add both ints to current diff obj
        // else continue
    
    let sorted = arr.sort((a,b) => a - b);
    let diff = new Map();
    
    
    for (var i = 0; i < sorted.length - 1; i++) {
        let difference = Math.abs(sorted[i] - sorted[i + 1]);
        
        if (diff.size == 0 || !diff.has(difference)) {
            diff.set(difference, new Array());
            diff.get(difference).push(sorted[i], sorted[i + 1]);
            continue;
        }

        if (diff.has(difference)) {
            diff.get(difference).push(sorted[i], sorted[i + 1]);
        }
    }

    const keys = diff.keys();
    let lowest;
    for (var element of keys) {
        if (!lowest || element < lowest) {
            lowest = element;
        }
    }

    return diff.get(lowest);

}

console.log(closestNumbers([1,2,3,4,5]));