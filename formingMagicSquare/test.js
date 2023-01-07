function formingMagicSquare(s) {
    const possibleSolutions = [[[8, 1, 6], [3, 5, 7], [4, 9, 2]],
                            [[6, 1, 8], [7, 5, 3], [2, 9, 4]],
                            [[4, 9, 2], [3, 5, 7], [8, 1, 6]],
                            [[2, 9, 4], [7, 5, 3], [6, 1, 8]], 
                            [[8, 3, 4], [1, 5, 9], [6, 7, 2]], 
                            [[4, 3, 8], [9, 5, 1], [2, 7, 6]], 
                            [[6, 7, 2], [1, 5, 9], [8, 3, 4]], 
                            [[2, 7, 6], [9, 5, 1], [4, 3, 8]]];
    
    function getCost(arr) {
        let cost = 0;
        
        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                cost += Math.abs(arr[i][j] - s[i][j]);
            }
        }
        return cost;
    }
    
    let minCost = Infinity;
    
    possibleSolutions.forEach(e => {
        let currentCost = getCost(e);
        if (currentCost < minCost) {
            minCost = currentCost;
        }
    });
    
    return minCost;
}