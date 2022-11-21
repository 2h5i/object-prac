package cafe;

public class Cafe {

    private int salesMoney;

    public Cafe() {
        this.salesMoney = 0;
    }

    public void earnSalesMoney(int money) {
        this.salesMoney += money;
    }

    public int getSalesMoney() {
        return this.salesMoney;
    }
}
