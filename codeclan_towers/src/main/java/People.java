public class People {
    private String name;
    private double wallet;

    public People(String name, double wallet){
        this.name = name;
        this.wallet = wallet;

    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
