package .models.shared;


public enum DevicePinnersOrderDirectionEnum {
    ASC("asc"),
    DESC("desc");

    public final String value;

    private DevicePinnersOrderDirectionEnum(String value) {
        this.value = value;
    }
}
