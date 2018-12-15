//https://www.hackerrank.com/challenges/repeated-string/problem

function repeatedString(s, n) {
    let letterA = 0;
    let i = s.length;
    let nLessThanS = false;

    if (n < i) {
        i = n;
        nLessThanS = true;
    }

    while (i--) {
        if (s.charAt(i) === 'a') {
            letterA++;
        }
    }

    //edge case if n is less than string length
    if (nLessThanS) {
        return letterA;
    }

    let remainingLetters = n % s.length - 1;
    let remainder = 0;

    while (remainingLetters >= 0) {
        if (s.charAt(remainingLetters) === 'a') {
            remainder++;
        }
        remainingLetters--;
    }

    const multiplier = Math.floor(n / s.length);

    return (letterA * multiplier + remainder);

}
