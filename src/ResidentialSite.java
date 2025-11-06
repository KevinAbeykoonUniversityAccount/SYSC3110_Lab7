public class ResidentialSite extends Site{
    int _units = 10;
    double _rate = 0.19;

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
