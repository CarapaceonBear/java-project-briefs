# Employee Registry

## Brief

Develop a command line program which models a directory of employees within a company

The program should have a list of employees. Each employee should be a class, and should be linked to another class which defines their role in the company.

Role should be an abstract class, with each individual role extending it and using different values and methods.

Have a Command class which allows the user to:
- Add an employee, stating their role
- Change the role of an existing employee
- Remove an employee from the list
- List all employees

<details>
  <summary>Possible Component Tree</summary>
  
  ![component tree](https://i.imgur.com/9FMmGoS.png)

  
</details>

---

## Extension

Is there one function which could be used differently within multiple roles? Create an interface and have those roles implement it. (eg. calculateSalaryBonus could employ a different calculation for a manager vs an executive).
