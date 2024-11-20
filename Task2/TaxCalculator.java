package Task2;

class StandardTaxCalculator implements ExtraChargesOrDiscunts {
    private static final double TAX_RATE = 0.08;
    @Override
    public double reCalculatePrice(double amount) {
        return amount * TAX_RATE;
    }
}