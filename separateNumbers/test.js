function separateNumbers(s) {
    // multiple iterations for different starting numbers
    for (var p = 1; p <= s.length / 2; p++) {
        let places = p, newPlaces = 0, count = 0;
        for (var i = 0; i < s.length - places; i += places) {
            if (newPlaces != 0) {
                places += newPlaces;
                newPlaces = 0;
            }
            
            if (!s.charAt(i + places)) {
                break;
            }
            
            let element = s.substr(i, places);
            console.log((BigInt(element) + BigInt(1).toString()));
            if (((BigInt(element) + BigInt(1)).toString()).length > places) {
                newPlaces++;
            }
            
            if (BigInt(element) + BigInt(1) != 
                BigInt(s.substr(i + places, places + newPlaces)) ||
                s.charAt(i) == "0") {
                    count++;
                    break;
                }
        } 
        
        if (count == 0) {
            console.log("YES " + s.substr(0, p));
            return;
        }
    }
    console.log("NO"); return;

}

console.log(separateNumbers("96589218797811259658921879781126"));