//https://www.hackerrank.com/challenges/sock-merchant/problem

function sockMerchant(n, ar) {
    let sockMap = {};
    ar.forEach((sock) => {
        if (!sockMap[sock]) {
            sockMap[sock] = 0;
        }
        sockMap[sock]++;
    });

    let pairs = 0;
    for (let type of Object.values(sockMap)) {
        pairs += Math.floor(type / 2);
    }
    return pairs;
}
