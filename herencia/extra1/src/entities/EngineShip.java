package entities;

public class EngineShip extends Ship {
    

    protected Double horsePower;

    public EngineShip(String registration, Integer fabricationYear, Double length, Double horsePower) {
        super(registration, fabricationYear, length);
        this.horsePower = horsePower;
    }

    public Double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Double horsePower) {
        this.horsePower = horsePower;
    }

    
    
}
