//json objject - java script object notation
//it s stores data is in key &value format
//json is used in restful API

let jsonObj ={
        id:10 , //key can be double or sinngle quote;
        "fname":'sindhu',
        lname :'ja'
    } 
    // (to access)use can two 1.dot operator 2.square operaor 
    console.log(`
        ID    ::${jsonObj.id}
        FirstNAme  ::${jsonObj.fname}
                  `)
    
    //2.square op
    console.log(`
        Id ::${jsonObj["id"]}
        Firstname  ::${jsonObj['fname']}
    `)
    //Array of object
    let arrObj = [
        {
    
        
        id:10 , //key can be double or sinngle quote;
        "fname":'sindhu',
        lname :'ja',
        country:{
            ci:1,
            cname:'india'
    
        },
        month :["jan","feb","ji=uly"],
        result:[
            {
                sub:"mathdada1",
                mark:60
            },
            {
                sub:"mathsddadad3",
                mark:55
            }
        ]
        },
        
        {
            ID :55,
            fname:'sindhuja_20202',
            month :["jukyn","feb","augly"]
        },
    
        {
            id:10 , //key can be double or sinngle quote;
        "fname":'keerthana',
        lname :'devi'
        }
    
    ];
    for(let i =0;i<arrObj.length;i++){
    
        console.log(`
        id ::${arrObj[i].id}
        firstname ::${arrObj[i].fname}
        lnmae ::${arrObj[i].lname}
        country ::${arrObj[i].country?.ci}
        month ::${arrObj[i].month}
        `)
    }

//     for(let  j =0;j<arrObj[i].result?.length;j++){
//         console.log(`
//         Subject :: 
//         `)
//     }

// arrObj[i].result?.forEach((item)=>{
//         console.log(`
//         ID :: ${item.sub}
//         Marks :: ${item.mark}
//         `)

// })


//additional features of typescript 
//class Myclass{int a; String str;}
//file name can be different and class name can be different 
//while creating class level property don't use var const and let
//if we want to create a method inside the class don't use function keyword
//explicitly we need to use this keyword everytime 
//we can't more than one const multiple const is not allowed
//const ovloading is not possible 

export class Myclass{
        public id:number;
        private fname:string;
        lname:string;
//in ts if you want to create a constructor use constructor as a constructor name don't use class name as a const
        constructor(id:number,f:string,l:string){
                this.id=id;
                this.fname=f;
                this.lname=l;
        }

        public display(){
                console.log(`
                ID        :: ${this.id}
                FirstName :: ${this.fname}
                LastName  :: ${this.lname}
                `)
        }

}

// let obj=new Myclass(1,'Dheepa','K');
// obj.display();

//create the obj outside the class with let keyword
//same like java we need to create an obj

//Access Modifier or specifier 
//public - access anywhere
//private - within the class and same package
// prodected - within the class and same package with derived class 
//only 3 available
//we can't declare class as a public 

export class Employee{
    public id:number;
    public name:string;
    public salary:number;
    public role:string;

    constructor(id:number,name:string,salary:number,role:string){
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.role=role;
    }

    public display()
    {
        console.log(`
----------------Employee Details---------------
                Employee Id     :: ${this.id}
                Employee name   :: ${this.name}
                Employee salary :: ${this.salary}
                Emoloyee role   :: ${this.role}
        `);
    }

    public taxCalculation()
    {
        let newSalary=this.salary*12;

        if(newSalary <  250000)
        { 
            console.log("Tax "+0);
        }
        else if(newSalary >250000 && newSalary < 500000)
        {
            let tax=0.05 * (newSalary-250000);
            console.log("Tax "+tax);
        }
        else if(newSalary >500000 && newSalary < 1000000)
        {
            let tax=12500 + (0.20 * (newSalary-500000));
            console.log("Tax "+tax);
        }
        else if(newSalary >1000000)
        {
            let tax=112500 + (0.30 * (newSalary-500000));
            console.log("Tax "+tax);
        }
    }
}

// let obj=new Employee(1,"Keerthi",50000,"Dev");
// obj.display();
// obj.taxCalculation();

export function show(a:string,b:string)
{
    console.log(a+" "+b);
}

export const keyValue=972002;


