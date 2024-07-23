package Collections.Enums;

public enum Day {
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNEUSDAY("Weekday"),
    THRUSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String type;

    Day(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
