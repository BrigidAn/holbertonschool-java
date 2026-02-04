public class Employee {
    private double fixedSalary;

    public Employee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public double calculateBonus(Department department) {
        // Non-managers get 10% if department met target
        if (department.reachedTarget()) {
            return fixedSalary * 0.10;
        }
        return 0.0;
    }

    public double calculateTotalSalary(Department department) {
        return fixedSalary + calculateBonus(department);
    }
}
