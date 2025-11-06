public abstract class Site {
    public static double TAX_RATE = 0.13;

    public double getBillableAmount(){
        return 0.0;
    }

    public abstract double getBaseAmount();

    public abstract double getTaxAmount();
}
