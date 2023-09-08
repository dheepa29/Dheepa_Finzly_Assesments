var cnt=3;
if(cnt<2){
    console.log("True")
}else {
    console.log("False")
}

var cnt=2
switch(cnt){
    case 1:
        console.log("case 1")
        break;
    case 2:
        console.log("case 2")
        break;
    case 3:
        console.log("case 3")
        break;
    default:
        console.log("default")
}

function add(a:number,b:number){
    return(a+b)
}
let res=add(2,3)
console.log(res)

let dheep=function (){
    console.log("Anonymous")
}
dheep();

// with parameter and without return type
let dheep1=function (a:number,b:number){
    console.log(a+b)
}
dheep1(2,4);

// without parameter and with return type
let dheep2=function (){
    return(8+9)
}
let res1=dheep2();
console.log(res1)

//without parameter without return type
let dheep3=()=>{
    console.log("Arrow Function")
}
dheep3()

//with parameter without return type
let dheep4=(a:number,b:number)=>{
    console.log(a+b)
}
dheep4(3,7)

//without parameter with return type
let dheep5=():number=>{
    return(3)
}
let res2=dheep5()
console.log(res2)

