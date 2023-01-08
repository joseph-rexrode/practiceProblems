function counterGame(n) {
    // Louise goes first
    let player = "Louise";
    
    // if n == 1 Richard auto wins
    if (n == 1) { return "Richard"; }
    
    // until n == 1
    while (n != 1) {
        // find power of 2 that is closest to n; either == or <
        let x = 2, p = 2
        while (p < n) {
            
            // go to next power of 2, and if greater than n:
            // subtract x by 1, redefine p and break loop
            p = Math.pow(2, x);
            if (p > n) { 
                x--;
                p = Math.pow(2, x);
                break; 
            }
            
            // else increase exponent by 1
            x++;
        }
        
        // if p == n it is a power of 2 so divide n by 2
        if (p == n) {
            n = n / 2;
        }
        // if not, subtract next lowest power of 2 from n
        else {
            n = n - p;
        }
        if (n != 1) {
            player = (player == "Louise") ? "Richard": "Louise"; 
        }
    }
    return player;
}

console.log(counterGame(1560834904));