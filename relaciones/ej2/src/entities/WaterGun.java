package entities;

import java.util.Random;

public class WaterGun {
    private Integer currentChamber;
    private Integer waterChamber;
    private final Integer MAX_WATER_CHAMBER = 5;

    Random random = new Random();

    public WaterGun() {

    }
    
    public WaterGun(Integer currentChamber, Integer waterChamber) {
        this.currentChamber = currentChamber;
        this.waterChamber = waterChamber;
    }

    public void load() {
        Integer currentChamber = random.nextInt(this.getMAX_WATER_CHAMBER()) + 1;
        Integer waterChamber = random.nextInt(this.getMAX_WATER_CHAMBER()) + 1;
        this.setCurrentChamber(currentChamber);
        this.setWaterChamber(waterChamber);
    }

    public Boolean isWet() {
        return this.getCurrentChamber() == this.getWaterChamber();
    }

    public void nextChamber() {
        this.setCurrentChamber(this.getCurrentChamber() % this.getMAX_WATER_CHAMBER() + 1);
    }


    public Integer getCurrentChamber() {
        return currentChamber;
    }

    public void setCurrentChamber(Integer currentChamber) {
        this.currentChamber = currentChamber;
    }

    public Integer getWaterChamber() {
        return waterChamber;
    }

    public void setWaterChamber(Integer waterChamber) {
        this.waterChamber = waterChamber;
    }

    public Integer getMAX_WATER_CHAMBER() {
        return MAX_WATER_CHAMBER;
    }

    @Override
    public String toString() {
        return "thisDeAgua [currentChamber=" + currentChamber + ", waterChamber=" + waterChamber + "]";
    }

}
