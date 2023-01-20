function dynamicArray(n, queries) {
    let lastAnswer = 0;
    // creates new array of length n
    let arr = Array.from(Array(n), () => []);
    let answers = [];
    
    // iterate through array 
    for (var i = 0; i < queries.length; i++) {
        
        let idx = ((queries[i][1] ^ lastAnswer) % n);
        
        if (queries[i][0] == 1) {
            arr[idx].push(queries[i][2]);
        }
        else {
            lastAnswer = arr[idx][queries[i][2] % arr[idx].length];
            answers.push(lastAnswer);
        }
    }
    
    console.log(answers);
    return answers;

}

console.log(dynamicArray(2, [[1, 0, 5], [1, 1, 7], [1, 0, 3], [2, 1, 0], [2, 1, 1]]));