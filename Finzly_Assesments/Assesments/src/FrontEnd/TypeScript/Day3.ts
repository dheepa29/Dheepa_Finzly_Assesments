//Optional parameter function - we can make the parameter as a optional 

function add0(a:number,b?:number){ //always make the last parameter as optional parameter
    console.log(a); //10
    console.log(b); //undefined
    console.log(a+b!); //mention the non initializer output NAN Not a Number 
}
//add0(10); //not passing the b value


function add1(a?:number,b?:number){ //if you are making the first parameter as optional then you shld make all the other parameters as optional parameter 
    console.log(a); //10
    console.log(b); //undefined
    console.log(a!+b!); //mention the non initializer output NAN Not a Number 
}
// add1(30,2)

//default parameter function internally works as a optional parameter 
//make a default parameter as a last parameter if we make first value as default there is no use 
function add2(a:number=10,b:number){ //if you are passing any value then it will take that value othervise the default value will be taken  
    console.log(a); //10
    console.log(b); //undefined
    console.log(a!+b!); //mention the non initializer output NAN Not a Number 
}
//add2(20,30)//if a is a default parameter we can't pass b value directly before a value 

function add3(a:number=10,b?:number){ //in case of making b optional it is possible   
    console.log(a); //10
    console.log(b); //undefined
    console.log(a!+b!);
}
// add3()

//Array Basics (mentioned type, size of array, we can store the homogenous datatyep)
// Array is dynamically growwable and shrinkable 
// Array can store both homogenous and hetrogenous data types
// creating a array uses squre bracket
let a:number[]=[1,2,3,4];
let a1:number[]=[];//empty array
let a2=[2.3,4,5.5];//without datatype number datatype
let a3=[40,'Dheepa',true];//Literal datatype
let a4:any[]=[5,'dheepa',true,3.3];

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
function display(str:string,...item:number[]){//dot represents the spread operator followed by spread operator we shld have an array 
    console.log(str+","+item)
}
// display(10,20,30,40)//this will be stored in an item and item is an array and array is growable and shrinkable 
// display("dheepa",12)

//push & pop
//LIFO - last in first out 
//this method is only working on array 
//it is used to add a data dynamically in an array
let b:number[]=[];

// b.push(10);//we can't add any particular index data 
// console.log(b)
// b.push(20,30);
// console.log(b)

// b.pop();//pop will remove only one data at a time 
// console.log(b)

// Splice method 
//if e want to add any particular index data splice method is used 

let g:number[]=[10,20,30,40,50]
g.splice(2,0,100)
// console.log(c)
//we can add multiple data 
g.splice(1,0,200,300,400)
// console.log(c)

//delete a particular data 
g.splice(3,2);
// console.log(c)

//replacing the data
g.splice(4,1,500);
// console.log(c)

//replace and add data
g.splice(2,1,600,800)
// console.log(c)


//map method it performs element by element operation 
let s:number[]=[2,3,4,5,6]
let sqr=s.map((value)=>{//right now i'm not doing any operation so it is unknown
    return(value*value)

});
// console.log(d);
// console.log(sqr);

//slice method 
//it copy a section of a data from an array without changing an original value 
let str1:string[]=["core java",'Advance Java','SpringBoot','Angular 12','Docker'];
let copy=str.slice(1,3)//excluding any index data will not be considered 
//Returns a copy of a section of an array. For both start and end, a negative index can be used to indicate an offset from the end of the array. For example, -2 refers to the second to last element of the array.
// console.log(str);
// console.log(copy);

//Traversing the string array
let e:string[]=["Dheepa","Suguna","Then"]
e.forEach((e,i,arr)=>{
    console.log(e)
})