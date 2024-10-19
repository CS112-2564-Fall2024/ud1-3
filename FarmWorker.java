
abstract class FarmWorker {
    protected String name;

    public FarmWorker(String name) {
        this.name = name;
    }

    public abstract void work();

    public void rest() {
        System.out.println(name + " is resting.");
    }

    public String getName() {
        return name;
    }
}
