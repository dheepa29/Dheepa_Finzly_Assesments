//Display class  data using advanced features of typescript
//access a class in another class within a package 

import {Employee,show,keyValue} from './Day4'
let obj1=new Employee(2,"dheepa",80000,"Developer");
obj1.display();
obj1.taxCalculation();

show("dheepa","Finzly");
console.log(keyValue);