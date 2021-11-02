function zeroesToEnd(arr) {
    let q = 0;
    for (let p=0; p<arr.length; p++) 
        if (arr[p] != 0) arr[q++] = arr[p];
    for (; q<arr.length; q++) arr[q] = 0;
    return arr;
}

console.log(zeroesToEnd([1, 2, 0, 0, 4, 0, 5]));
console.log(zeroesToEnd([0, 0, 2, 0, 5]));
console.log(zeroesToEnd([4, 4, 5]));
console.log(zeroesToEnd([0, 0]));
