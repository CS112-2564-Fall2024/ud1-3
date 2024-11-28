class Crop {
    private String name;
    private boolean isHarvested;

    public Crop(String name) {
        this.name = name;
        this.isHarvested = false;
    }

    public String getName() {
        return name;
    }

    public void harvest() throws CropNotAvailableException {
        if (!isHarvested) {
            isHarvested = true;
            System.out.println(name + " has been harvested.");
        } else {
            throw new CropNotAvailableException(name + " is already harvested or not ready.");
        }
    }
