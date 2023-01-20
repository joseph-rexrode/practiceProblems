function sansaXor(arr) {
    let answer;
    // iterate through subarray lengths
    for (var i = 1; i <= arr.length; i++) {
        // iterate through array for each subarray length
        for (var j = 0; j < arr.length; j++) {
            let subsubarray;
            for (var k = 0; k < i; k++) {
                if (arr[j + i - 1] == null) {
                    continue;
                }
                if (subsubarray) {
                    subsubarray = subsubarray ^ arr[j + k];
                }
                else {
                    subsubarray = arr[j + k];
                }
            }
            if (answer != null) {
                answer = answer ^ subsubarray;
            }
            else {
                answer = subsubarray;
            }
        }
    }
    return answer;

}


console.log(sansaXor([1,2,3]));