/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let num = [0,0];
    for(let i = 0 ;i < nums.length; i++){
        for(let j = i + 1; j < nums.length;j++){
            if(nums[i] + nums[j] === target) {
                num[0] = i;
                num[1] = j;
                return num;
            }
        }
    }
    return num
};