public class Manager extends Employee {

    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            // 20% of fixed salary + 1% of difference between achieved and target
            double baseBonus = getFixedSalary() * 0.20;
            double extra = (department.getAchievedTargetValue() - department.getTargetValue()) * 0.01;
            return baseBonus + extra;
        }
        return 0.0;
    }
}
