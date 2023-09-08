var cnt = 3;
if (cnt < 2) {
    console.log("True");
}
else {
    console.log("False");
}
var cnt = 2;
switch (cnt) {
    case 1:
        console.log("case 1");
        break;
    case 2:
        console.log("case 2");
        break;
    case 3:
        console.log("case 3");
        break;
    default:
        console.log("default");
}
function add(a, b) {
    return (a + b);
}
var res = add(2, 3);
console.log(res);
var dheep = function () {
    console.log("Anonymous");
};
dheep();
// with parameter and without return type
var dheep1 = function (a, b) {
    console.log(a + b);
};
dheep1(2, 4);
// without parameter and with return type
var dheep2 = function () {
    return (8 + 9);
};
var res1 = dheep2();
console.log(res1);
var dheep3 = function () {
    console.log("Arrow Function");
};
dheep3();
var dheep4 = function (a, b) {
    console.log(a + b);
};
dheep4(3, 7);
var dheep5 = function () {
    return (3);
};
var res2 = dheep5();
console.log(res2);
