package entities;

public enum WebDriverType {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge");

    private String driverName;

    WebDriverType(String getDriverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }
}
