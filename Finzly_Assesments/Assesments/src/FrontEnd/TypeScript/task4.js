"use strict";
//Display class  data using advanced features of typescript
//access a class in another class within a package 
Object.defineProperty(exports, "__esModule", { value: true });
var Day4_1 = require("./Day4");
var obj1 = new Day4_1.Employee(2, "dheepa", 80000, "Developer");
obj1.display();
obj1.taxCalculation();
(0, Day4_1.show)("dheepa", "Finzly");
console.log(Day4_1.keyValue);
