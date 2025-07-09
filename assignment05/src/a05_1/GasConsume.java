package a05_1;

public class GasConsume {

    private double[] liters;
    private double cost;
    private int noDays;
    private float litersConsume;
    private float moneyConsume;

    public GasConsume(double[] liters, double cost, int noDays) {
        this.liters = liters;
        this.cost = cost;
        this.noDays = noDays;
    }

    public double[] getLiters() {
        return liters;
    }

    public void setLiters(double[] liters) {
        this.liters = liters;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNoDays() {
        return noDays;
    }

    public void setNoDays(int noDays) {
        this.noDays = noDays;
    }

    public float getLitersConsume() {
        this.litersConsume = this.calculateLitersConsumed();
        return litersConsume;
    }

    private float calculateLitersConsumed() {
        float consume = 0.0f;
        for (int i = 0; i < this.noDays; i++) {
            consume += liters[i];
        }
        return consume;
    }

    public float getMoneyConsume() {
        this.moneyConsume = this.calculateMoneyConsumed();
        return moneyConsume;
    }

    private float calculateMoneyConsumed() {
        float consume = 0.0f;
        for (int i = 0; i < this.noDays; i++) {
            consume += liters[i] * cost;
        }
        return consume;
    }
}
