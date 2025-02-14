var replaceElements = function(arr) {
    let rightMax = -1;
    for (let i = arr.length - 1; i >= 0; i--) {
        let nextMax = Math.max(rightMax, arr[i]);
        arr[i] = rightMax;
        rightMax = nextMax;
    }
    return arr;
};