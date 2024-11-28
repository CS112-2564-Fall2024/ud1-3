class Helper extends FarmWorker {

    public Helper(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is assisting on the farm.");
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " is feeding the " + animal.getType() + ".");
    }
}
