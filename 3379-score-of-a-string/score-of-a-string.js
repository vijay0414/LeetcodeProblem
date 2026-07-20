/**
 * @param {string} s
 * @return {number}
 */
var scoreOfString = function(s) {
    let num = 0;
    for(let i = 0 ;i < s.length - 1;i++){
        let c = s.charCodeAt(i);
        let ch = s.charCodeAt(i+1);
        num += Math.abs(c - ch);
    }
    return num;
};