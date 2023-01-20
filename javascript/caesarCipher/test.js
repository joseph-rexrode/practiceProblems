function caesarCipher(s, k) {
    let str = "";
    for (var c in s) {
        console.log(s[c]);
        if (!(/[a-zA-Z]/).test(s[c])) { continue; }
        let newCode = s.charCodeAt(c) + k;
        while (!([/a-zA-Z/]).test(String.fromCharCode(newCode))) {
            newCode -= 26;
        }
        str += String.fromCharCode(newCode);
    }
    return str;

}

console.log(caesarCipher("middle-Outz"));