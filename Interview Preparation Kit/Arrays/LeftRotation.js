//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

function rotLeft(a, d) {
    while (d) {
        a.push(a.shift());
        d--;
    }

    return a;
}
