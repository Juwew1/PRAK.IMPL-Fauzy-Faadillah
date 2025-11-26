package LatihanCleanCode;

class Salesman extends EmployeeType {
    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}
