function shiftToRight(num, power) {
    while (power-- > 0) num = Math.floor(num/2);
    return num;
}

console.log(shiftToRight(80, 3));
console.log(shiftToRight(-24, 2));
console.log(shiftToRight(-5, 1));
console.log(shiftToRight(4666, 6));
console.log(shiftToRight(3777, 6));
console.log(shiftToRight(-512, 10));
