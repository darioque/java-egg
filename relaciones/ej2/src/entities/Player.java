package entities;


public class Player {
    private Integer id;
    private String name;
    private Boolean isWet = false;
    

    public Player() {
    }

    public Player(Integer id) {
        this.id = id;
        String name = "Player " + id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsWet() {
        return isWet;
    }

    public void setIsWet(Boolean isWet) {
        this.isWet = isWet;
    }

    public Boolean shoot(WaterGun wg) {
        
        Boolean wasShot = wg.isWet();
        this.setIsWet(wasShot);
        wg.nextChamber();

        return wasShot;
    }

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", isWet=" + isWet + "]";
    }

}
