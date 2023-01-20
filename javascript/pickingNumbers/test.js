function pickingNumbers(a) {
    let newA = a.sort((a,b) => a - b);
    let max = 0, current = [];
    for (var i = 0; i < a.length; i++) {
        for (var j = 0; j <= a.length; j++) {
            if (Math.abs(newA[i] - current[j]) > 1) {
                if (current.length > max) {
                    max = current.length;
                }
                current = [];
                break;
            }
        }
        current.push(newA[i]);
    }
    if (current.length > max) { max = current.length; }
    return max;
}

console.log(pickingNumbers([4,6,5,3,3,1]));