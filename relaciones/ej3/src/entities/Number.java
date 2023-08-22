package entities;

public enum Number {
    N1(1), N2(2), N3(3), N4(4), N5(5), N6(6), N7(7), N10(10), N11(11), N12(12);

    private Integer value;

    Number(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public String toString() {
        return value.toString();
    }
}
