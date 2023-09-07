package entities;

public class SaleBoat extends Ship {

    protected Integer shipMast;

    public SaleBoat(String registration, Integer fabricationYear, Double length, Integer shipMast) {
        super(registration, fabricationYear, length);
        this.shipMast = shipMast;
    }

    public Integer getShipMast() {
        return shipMast;
    }

    public void setShipMast(Integer shipMast) {
        this.shipMast = shipMast;
    }

    
}
