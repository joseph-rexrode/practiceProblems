function detonate(grid) {
    // when we detonate, we know the rest of the non-detonated cells will be O
    // because previous step filled everything with O
    let newGrid = [];
    for (var x = 0; x < grid.length; x++) {
        let gridLine = "";
        for (var y = 0; y < grid[0].length; y++) {
            // uses optional chaining to make sure grid cell exists
            if (grid[x + 1]?.[y] === 'O' || grid[x - 1]?.[y] === "O" ||
                grid[x][y + 1] === "O" || grid[x][y - 1] === "O" ||
                grid[x][y] === "O") {
                    gridLine += ".";
                }
            else {
                gridLine += "O";
            }
        }
        newGrid.push(gridLine);
    }
    return newGrid;
}

function bomberMan(n, grid) {
    if (n === 1) { return grid; }
    if (n % 2 === 0) {
        let filled = "";
        for (var i = 0; i < grid[0].length; i++) {
            filled += "O";
        }
        return grid.map(val => filled);
    }
    
    // every other odd second has 1 singular detonation
    if (n % 4 === 3) {
        return detonate(grid);
    }
    
    // the other odd second has 2 detonations
    if (n % 4 === 1) {
        return detonate(detonate(grid));
    }
}

console.log(bomberMan(3,    [".......",
                            "...O...",
                            "....O..",
                            ".......",
                            "OO.....",
                            "OO.....",]))


// console.log(bomberMan(3, ['...',
//                             '.O.',
//                             '...']));