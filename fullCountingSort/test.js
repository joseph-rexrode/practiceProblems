function countSort(arr) {
    let hash = new Map();
    let max = 0;
    for (var i = 0; i < arr.length; i++) {
        let num = parseInt(arr[i][0]);
        if (num > max) { max = num; }
        // first half is dashes
        if (i < arr.length / 2) {
            // already something in this number?
            if (hash.has(num)) {
                hash.set(num, 
                        hash.get(num) + " -");
            }
            else {
                hash.set(num, "-");
            }
        }
        
        else {
            if (hash.has(num)) {
                hash.set(num, 
                        hash.get(num) + " " + arr[i][1]);
            }
            else {
                hash.set(num, arr[i][1]);
            }
        }
    }
    let answer = "";
    for (var i = 0; i < max + 1; i++) {
        if (hash.has(i)) {
            if (answer == "") { 
                answer = hash.get(i); 
                continue; 
            }
            answer = answer + " " + hash.get(i);
        }
    }
    
    return answer;

}

console.log(countSort([[1, 'a'], [0, 'b'], [1, 'c'], [2, 'd']]));

