package entities;

public class LuxuryYacht extends Ship {
    

    protected Double horsePower;
    protected Integer cabinAmount;

    public LuxuryYacht(String registration, Integer fabricationYear, Double length, Double horsePower,
            Integer cabinAmount) {
        super(registration, fabricationYear, length);
        this.horsePower = horsePower;
        this.cabinAmount = cabinAmount;
    }

    public Double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Double horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getCabinAmount() {
        return cabinAmount;
    }

    public void setCabinAmount(Integer cabinAmount) {
        this.cabinAmount = cabinAmount;
    }

    
    
}
