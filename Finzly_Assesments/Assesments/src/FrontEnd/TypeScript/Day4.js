"use strict";
//json objject - java script object notation
//it s stores data is in key &value format
//json is used in restful API
var _a;
Object.defineProperty(exports, "__esModule", { value: true });
exports.keyValue = exports.show = exports.Employee = exports.Myclass = void 0;
var jsonObj = {
    id: 10,
    "fname": 'sindhu',
    lname: 'ja'
};
// (to access)use can two 1.dot operator 2.square operaor 
console.log("\n        ID    ::".concat(jsonObj.id, "\n        FirstNAme  ::").concat(jsonObj.fname, "\n                  "));
//2.square op
console.log("\n        Id ::".concat(jsonObj["id"], "\n        Firstname  ::").concat(jsonObj['fname'], "\n    "));
//Array of object
var arrObj = [
    {
        id: 10,
        "fname": 'sindhu',
        lname: 'ja',
        country: {
            ci: 1,
            cname: 'india'
        },
        month: ["jan", "feb", "ji=uly"],
        result: [
            {
                sub: "mathdada1",
                mark: 60
            },
            {
                sub: "mathsddadad3",
                mark: 55
            }
        ]
    },
    {
        ID: 55,
        fname: 'sindhuja_20202',
        month: ["jukyn", "feb", "augly"]
    },
    {
        id: 10,
        "fname": 'keerthana',
        lname: 'devi'
    }
];
for (var i = 0; i < arrObj.length; i++) {
    console.log("\n        id ::".concat(arrObj[i].id, "\n        firstname ::").concat(arrObj[i].fname, "\n        lnmae ::").concat(arrObj[i].lname, "\n        country ::").concat((_a = arrObj[i].country) === null || _a === void 0 ? void 0 : _a.ci, "\n        month ::").concat(arrObj[i].month, "\n        "));
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
var Myclass = /** @class */ (function () {
    //in ts if you want to create a constructor use constructor as a constructor name don't use class name as a const
    function Myclass(id, f, l) {
        this.id = id;
        this.fname = f;
        this.lname = l;
    }
    Myclass.prototype.display = function () {
        console.log("\n                ID        :: ".concat(this.id, "\n                FirstName :: ").concat(this.fname, "\n                LastName  :: ").concat(this.lname, "\n                "));
    };
    return Myclass;
}());
exports.Myclass = Myclass;
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
var Employee = /** @class */ (function () {
    function Employee(id, name, salary, role) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = role;
    }
    Employee.prototype.display = function () {
        console.log("\n----------------Employee Details---------------\n                Employee Id     :: ".concat(this.id, "\n                Employee name   :: ").concat(this.name, "\n                Employee salary :: ").concat(this.salary, "\n                Emoloyee role   :: ").concat(this.role, "\n        "));
    };
    Employee.prototype.taxCalculation = function () {
        var newSalary = this.salary * 12;
        if (newSalary < 250000) {
            console.log("Tax " + 0);
        }
        else if (newSalary > 250000 && newSalary < 500000) {
            var tax = 0.05 * (newSalary - 250000);
            console.log("Tax " + tax);
        }
        else if (newSalary > 500000 && newSalary < 1000000) {
            var tax = 12500 + (0.20 * (newSalary - 500000));
            console.log("Tax " + tax);
        }
        else if (newSalary > 1000000) {
            var tax = 112500 + (0.30 * (newSalary - 500000));
            console.log("Tax " + tax);
        }
    };
    return Employee;
}());
exports.Employee = Employee;
// let obj=new Employee(1,"Keerthi",50000,"Dev");
// obj.display();
// obj.taxCalculation();
function show(a, b) {
    console.log(a + " " + b);
}
exports.show = show;
exports.keyValue = 972002;
