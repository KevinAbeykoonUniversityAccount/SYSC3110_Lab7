public class LifelineSite extends Site{
    int _units = 100;
    double _rate = 0.50;

    public static void main(String[] args) {
        LifelineSite var = new LifelineSite();
        System.out.println(var.getBillableAmount());
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
