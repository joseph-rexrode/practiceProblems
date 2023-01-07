function gridChallenge(grid) {
    // sort rows alphabetically
    for (var i = 0; i < grid.length; i++) {
        grid[i] = grid[i].split('').sort().join('');
    }
    
    // check columns to see if they are alphabetical
    for (var j = 0; j < grid.length - 1; j++) {
        for (var k = 0; k < grid[j].length; k++) {
            // if not, return NO
            if (grid[j].charCodeAt(k) > grid[j + 1].charCodeAt(k)) {
                return "NO";
            }
        }
    }
    
    // if so, return YES
    return "YES"

}

console.log(gridChallenge(['kc', 'iu']));