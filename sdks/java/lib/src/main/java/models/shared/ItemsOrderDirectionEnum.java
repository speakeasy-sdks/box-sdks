package .models.shared;


public enum ItemsOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private ItemsOrderDirectionEnum(String value) {
        this.value = value;
    }
}
