function minimumNumber(n, password) {
    let minimum = 0;
    const lower = /[a-z]+/, upper = /[A-Z]+/;
    const digit = /[0-9]+/, special = /[!@#$%^&*()+-]+/;
    
    if (!lower.test(password)) { minimum++; }
    if (!upper.test(password)) { minimum++; }
    if (!digit.test(password)) { minimum++; }
    if (!special.test(password)) { minimum++; }
    
    return n + minimum >= 6 ? minimum: 6 - n;

}

console.log(minimumNumber(7, "AUzs-nV"));