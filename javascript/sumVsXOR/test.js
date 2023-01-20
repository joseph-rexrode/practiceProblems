// brute force, doesn't work with larger numbers

function sumXor(n) {
    let counter = 0;
    
    for (var i = 0; i <= n; i++) {
        if ((i + n) == (i ^ n)) { counter++; }
    }

    return counter;
}

console.log(sumXor(10));


function sumXorBetter(n) {
    let counter = 0;

    while (n > 0) {
        if (n % 2 == 0) {
            counter++;
        }
        n = Math.floor(n / 2);
    }

    return Math.pow(2, counter);
}

console.log(sumXorBetter(10000000000000));