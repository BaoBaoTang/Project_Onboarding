function trackRobot(arr) {
    let pos = [0, 0];
    const dir = [[0, 1], [1, 0], [0, -1], [-1, 0]];
    for (let i=0; i<arr.length; i++) {
        pos[0] += dir[i%4][0] * arr[i];
        pos[1] += dir[i%4][1] * arr[i];
    }
    return pos;
}

console.log(trackRobot([20, 30, 10, 40]));
console.log(trackRobot([-10, 20, 10]));