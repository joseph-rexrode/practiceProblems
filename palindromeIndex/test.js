function palindromeIndex(s) {

    function isPalindrome(arr) {
        let reversed = [...arr].reverse().join("");
        if (arr.join("") == reversed) { return true; }
    }

    let strArr = s.split("");

    if (isPalindrome(strArr)) { return -1; }

    for (var i = 0; i < strArr.length; i++) {
        let removed = strArr.splice(i, 1);

        if (isPalindrome(strArr)) { return i; }

        strArr.push(removed);

        let temp = strArr[i];
        strArr[i] = strArr[strArr.length - 1];
        strArr[strArr.length - 1] = temp;

        }
    return -1; 
}

console.log(palindromeIndex("bcbc"));