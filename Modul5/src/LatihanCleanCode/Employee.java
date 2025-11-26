package LatihanCleanCode;

class Employee{
    int payAmount () {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return _monthlySalary;
            case EmployeeType.SALESMAN:
                return _monthlySalary + commission;
            case EmployeeType.MANAGER:
                return _monthlySalary + bonus;
            default:
                throw new Exception("Incorrect Employee");
        }
    }
}
