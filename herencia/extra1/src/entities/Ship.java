package entities;


public abstract class Ship {
    protected String registration;
    protected Integer fabricationYear;
    protected Double length;

    

    public Ship(String registration, Integer fabricationYear, Double length) {
        this.registration = registration;
        this.fabricationYear = fabricationYear;
        this.length = length;
    }
    public String getRegistration() {
        return registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public Integer getFabricationYear() {
        return fabricationYear;
    }
    public void setFabricationYear(Integer fabricationYear) {
        this.fabricationYear = fabricationYear;
    }
    public Double getLength() {
        return length;
    }
    public void setLength(Double length) {
        this.length = length;
    }

    

}
