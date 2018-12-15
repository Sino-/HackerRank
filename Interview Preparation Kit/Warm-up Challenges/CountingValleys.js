//https://www.hackerrank.com/challenges/counting-valleys/problem

function countingValleys(n, s) {
    let position = 0;
    let previous = 0;
    let valleys = 0;

    let i = 0;
    while (i < n) {
        previous = position;
        if (s.charAt(i) === 'D') {
            position--;
        }
        if (s.charAt(i) === 'U') {
            position++;
        }

        if (position === 0 && previous < 0) {
            valleys++;
        }
        
        i++;
    }

    return valleys;
}
