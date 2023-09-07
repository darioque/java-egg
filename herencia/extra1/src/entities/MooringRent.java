package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MooringRent {
    protected String customerName;
    protected String customerId;
    protected LocalDate startDate;
    protected LocalDate returnDate;
    protected Integer position;
    protected Ship ship;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public MooringRent() {
    }

    private Double calculateRent() {
        LocalDate earlierDate = startDate.isBefore(returnDate) ? startDate : returnDate;
        LocalDate laterDate = startDate.isBefore(returnDate) ? returnDate : startDate;

        long daysDifference = earlierDate.until(laterDate, ChronoUnit.DAYS);

        if (ship instanceof SaleBoat) {
            return daysDifference * (ship.getLength() + ((SaleBoat) ship).getShipMast());
        } else if (ship instanceof EngineShip) {
            return daysDifference + (ship.getLength() + ((EngineShip) ship).getHorsePower());
        } else {
            return daysDifference + (ship.getLength() + ((LuxuryYacht) ship).getHorsePower() + ((LuxuryYacht) ship).getCabinAmount());
        }
    }

    public void createRentAgreement() {
        System.out.println("Enter your name");
        customerName = System.console().readLine();
        System.out.println("Enter your ID");
        customerId = System.console().readLine();
        startDate = LocalDate.now();
        System.out.println("Enter the date of return");
        returnDate = LocalDate.parse(System.console().readLine());
        System.out.println("Enter the position of your ship");
        position = Integer.parseInt(System.console().readLine());
        System.out.println("Enter the type of your ship");
        String shipChoice = System.console().readLine();

        switch (shipChoice.toLowerCase()) {
            case "sale boat":
                ship = new SaleBoat(System.console().readLine(), Integer.parseInt(System.console().readLine()),
                        Double.parseDouble(System.console().readLine()), Integer.parseInt(System.console().readLine()));
                break;
            case "luxury yacht":
                ship = new LuxuryYacht(System.console().readLine(), Integer.parseInt(System.console().readLine()),
                        Double.parseDouble(System.console().readLine()),
                        Double.parseDouble(System.console().readLine()), Integer.parseInt(System.console().readLine()));
                break;
            case "engine ship":
                ship = new EngineShip(System.console().readLine(), Integer.parseInt(System.console().readLine()),
                        Double.parseDouble(System.console().readLine()),
                        Double.parseDouble(System.console().readLine()));
                break;
            default:
                break;
        }

        System.out.println("Your total to pay on the " + returnDate + " is " + calculateRent());
    }

}
