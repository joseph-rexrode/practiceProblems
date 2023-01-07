function isPangram(pangram) {
    let answer = "";
    // iterate through list of strings
    for (var i = 0; i < pangram.length; i++) {
        // declare new hash map for string
        let alphabet = new Map();
        // iterate through string
        for (var j = 0; j < pangram[i].length; j++) {
            // if letter exists already, continue
            if (alphabet.has(pangram[i].charAt(j))) {
                continue;
            }
            // otherwise put letter in map
            else {
                alphabet.set(pangram[i].charAt(j), 1);
            }
        }
        // if all 26 letters are in map, add 1 to answer, else add 0
        if (alphabet.size == 26) {
            answer = answer + "1";
        }
        else {
            answer = answer + "0";
        }
    }
    return answer;
}


console.log(isPangram(["we promptly judged antique ivory buckles for the next prize",
                        "we promptly judged antique ivory buckles for the prizes",
                        "the quick brown fox jumps over the lazy dog",
                        "the quick brown fox jump over the lazy dog"]));