//Optional parameter function - we can make the parameter as a optional 
function add0(a, b) {
    console.log(a); //10
    console.log(b); //undefined
    console.log(a + b); //mention the non initializer output NAN Not a Number 
}
//add0(10); //not passing the b value
function add1(a, b) {
    console.log(a); //10
    console.log(b); //undefined
    console.log(a + b); //mention the non initializer output NAN Not a Number 
}
// add1(30,2)
//default parameter function internally works as a optional parameter 
//make a default parameter as a last parameter if we make first value as default there is no use 
function add2(a, b) {
    if (a === void 0) { a = 10; }
    console.log(a); //10
    console.log(b); //undefined
    console.log(a + b); //mention the non initializer output NAN Not a Number 
}
//add2(20,30)//if a is a default parameter we can't pass b value directly before a value 
function add3(a, b) {
    if (a === void 0) { a = 10; }
    console.log(a); //10
    console.log(b); //undefined
    console.log(a + b);
}
// add3()
//Array Basics (mentioned type, size of array, we can store the homogenous datatyep)
// Array is dynamically growwable and shrinkable 
// Array can store both homogenous and hetrogenous data types
// creating a array uses squre bracket
var a = [1, 2, 3, 4];
var a1 = []; //empty array
var a2 = [2.3, 4, 5.5]; //without datatype number datatype
var a3 = [40, 'Dheepa', true]; //Literal datatype
var a4 = [5, 'dheepa', true, 3.3];
// for(let i=0;i<a.length;i++){
//     console.log(a[i])
// }
// console.log(a)// to show the array 
// console.log(a.join(" "));//separator means it will separate the array elements
// console.log(a.join());//it will take the separator as comma ,
//join method takes only string 
//foreach method ther is no increament and decreament operation 
//for each methed iterate element by element 
//we can also iterate in the reverse order but we need to use our own logic 
//fat arrow function returns nothing it is void finction 
// a.forEach((d,i,arr)=>{
// console.log("Data is "+d+" index is "+i+" Array is "+arr)
// });//value contains current array element data 
//Rest parameter function & Spread Operator
//Spread Operator is a feture given by ECMA script
//After rest parameter we can't create any parameter because rest parameter shld be the last parameter before rest parameter is possible
function display(str) {
    var item = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        item[_i - 1] = arguments[_i];
    }
    console.log(str + "," + item);
}
// display(10,20,30,40)//this will be stored in an item and item is an array and array is growable and shrinkable 
// display("dheepa",12)
//push & pop
//LIFO - last in first out 
//this method is only working on array 
//it is used to add a data dynamically in an array
var b = [];
// b.push(10);//we can't add any particular index data 
// console.log(b)
// b.push(20,30);
// console.log(b)
// b.pop();//pop will remove only one data at a time 
// console.log(b)
// Splice method 
//if e want to add any particular index data splice method is used 
var c = [10, 20, 30, 40, 50];
c.splice(2, 0, 100);
// console.log(c)
//we can add multiple data 
c.splice(1, 0, 200, 300, 400);
// console.log(c)
//delete a particular data 
c.splice(3, 2);
// console.log(c)
//replacing the data
c.splice(4, 1, 500);
// console.log(c)
//replace and add data
c.splice(2, 1, 600, 800);
// console.log(c)
//map method it performs element by element operation 
var d = [2, 3, 4, 5, 6];
var sqr = d.map(function (value) {
    return (value * value);
});
// console.log(d);
// console.log(sqr);
//slice method 
//it copy a section of a data from an array without changing an original value 
var str = ["core java", 'Advance Java', 'SpringBoot', 'Angular 12', 'Docker'];
var copy = str.slice(1, 3); //excluding any index data will not be considered 
//Returns a copy of a section of an array. For both start and end, a negative index can be used to indicate an offset from the end of the array. For example, -2 refers to the second to last element of the array.
// console.log(str);
// console.log(copy);
var e = ["Dheepa", "Suguna", "Then"];
e.forEach(function (e, i, arr) {
    console.log(e);
});
