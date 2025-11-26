package LatihanCleanCode;

class Manager extends EmployeeType {
    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}
