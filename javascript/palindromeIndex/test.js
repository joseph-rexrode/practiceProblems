function palindromeIndex(s) {

    function isPalindrome(str, i , j) {
        let iStr = str.split("");
        iStr.splice(i, 1);

        let ireversed = [...iStr].reverse();

        if (iStr.join("") == ireversed.join("")) { return i; }

        else {
            let jStr = str.split("");
            jStr.splice(j, 1);

            let jreversed = jStr.reverse();

            if (jStr.join("") == jreversed.join("")) { return j; }

            return -1;
        }
    }

    for (var i = 0; i < Math.floor(s.length / 2); i++) {
        if (s[i] != s[s.length - 1 - i]) {
            return isPalindrome(s, i, s.length - 1 - i);
        }
    }

    return -1;
}

console.log(palindromeIndex("bbbbcbbbc"));