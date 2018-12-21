//https://www.hackerrank.com/challenges/ctci-ransom-note

function checkMagazine(magazine, note) {
    let wordMap = {};

    for (let i = 0; i < magazine.length; i++) {
        if (!wordMap[magazine[i]]) {
            wordMap[magazine[i]] = 0;            
        }
        wordMap[magazine[i]]++;
    }

    for (let i = 0; i < note.length; i++) {
        if (!wordMap[note[i]]) {
            return console.log('No');
        }
        wordMap[note[i]]--;
    }
    return console.log('Yes');
}
