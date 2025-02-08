var getConcatenation = function(nums) {
    const newArr = [];
    for (let i = 0; i < nums.length; i++) {
        newArr[i] = nums[i];
        newArr[i + nums.length] = nums[i];
    }
    return newArr;
};