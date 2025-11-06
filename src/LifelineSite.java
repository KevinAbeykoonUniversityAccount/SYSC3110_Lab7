public class LifelineSite extends Site{
    int _units = 12;
    double _rate = 0.10;

    public static void main(String[] args) {

    }

    @Override
    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE  * 0.2;
    }
}
