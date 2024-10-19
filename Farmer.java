class Farmer extends FarmWorker {
    private int coins;

    public Farmer(String name, int initialCoins) {
        super(name);
        this.coins = initialCoins;
    }

    @Override
    public void work() {
        System.out.println(name + " is working on the farm.");
    }

    public void plantCrop(Crop crop) {
        System.out.println(name + " planted " + crop.getName() + " in the farm.");
    }

    public int getCoins() {
        return coins;
    }

    public void earnCoins(int amount) {
        this.coins += amount;
        System.out.println(name + " earned " + amount + " coins. Total coins: " + coins);
    }

    public boolean spendCoins(int amount) {
        if (this.coins >= amount) {
            this.coins -= amount;
            System.out.println(name + " spent " + amount + " coins. Remaining coins: " + coins);
            return true;
        } else {
            System.out.println("Not enough coins! You have " + coins + " coins.");
            return false;
        }
    }
}