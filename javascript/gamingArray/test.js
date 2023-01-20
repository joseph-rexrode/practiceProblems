function gamingArray(arr) {
    let turn = "BOB";
    // copy array
    let sorted = [...arr];
    // sort copy to find max value easier
    sorted.sort((a,b) => a - b);
    
    // do this until no more values in array
    while (arr.length != 0) {
        
        while (!arr.includes(sorted[sorted.length - 1])) {
            sorted.pop();
        }
        
        let index = arr.indexOf(sorted.pop());
        // splice array from max value onward
        arr.splice(index);
        if (arr.length == 0) { break; }
        
        if (turn == "BOB") {
            turn = "ANDY";
        }
        else {
            turn = "BOB";
        }
    }
    return turn;
}

console.log(gamingArray([7,4,6,5,9]));