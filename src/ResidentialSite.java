public class ResidentialSite extends Site{
    int _units = 10;
    double _rate = 0.19;

    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    public static void main(String[] args) {

    }

    @Override
    public double getBaseAmount() {
        return _units * _rate;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}
