package LatihanCleanCode;

public class Employee {
    private int monthlySalary = 5000;
    private int commission = 1000;
    private int bonus = 1500;
    private EmployeeType type;

    public Employee(EmployeeType type) {
        this.type = type;
    }

    public int getMonthlySalary() { return monthlySalary; }
    public int getCommission() { return commission; }
    public int getBonus() { return bonus; }

    public int calculatePay() {
        return type.payAmount(this);
    }

    public static void main(String[] args) {
        Employee salesman = new Employee(new Salesman());
        Employee manager = new Employee(new Manager());

        System.out.println("Gaji Salesman: " + salesman.calculatePay());
        System.out.println("Gaji Manager: " + manager.calculatePay());
    }
}
