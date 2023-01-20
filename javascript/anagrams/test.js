function anagram(s) {
    let sub1 = s.substr(0, s.length / 2);
    let sub2 = s.substr(s.length / 2, Math.round(s.length / 2));
    let count = 0;
    let map = new Map();

    if (sub1.length != sub2.length) { return -1; }

    for (var i = 0; i < sub1.length; i++) {
        if (map.has(sub1[i])) {
            map.set(sub1[i], map.get(sub1[i]) + 1);
        }
        else {
            map.set(sub1[i], 1);
        }
    }

    for (var j = 0; j < sub2.length; j++) {
        if (map.has(sub2[j]) && map.get(sub2[j]) != 0) {
            map.set(sub2[j], map.get(sub2[j]) - 1);
            continue;
        }

        else {
            count++;
        }
    }

    return count;
}

console.log(anagram("abcdef"));
console.log(anagram("ab"));
console.log(anagram("abc"));
console.log(anagram("mnop"));
console.log(anagram("xyyx"));
console.log(anagram("xaxbbbxx"));