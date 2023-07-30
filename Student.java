public class Student {
    private String name;
    private double feesPaid;

    public Student(String name) {
        this.name = name;
        this.feesPaid = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public void payFees(double amount) {
        feesPaid += amount;
    }

    public double getRemainingFees(double totalFees) {
        return totalFees - feesPaid;
    }

    @Override
    public String toString() {
        return name + " - Paid: $" + feesPaid;
    }
}
