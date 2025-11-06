public class ResidentialSite extends Site{

    public double getBillableAmount(int _units, int _rate){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    public static void main(String[] args) {

    }

    @Override
    public double getBaseAmount() {
        return 0;
    }

    @Override
    public double getTaxAmount() {
        return 0;
    }
}
