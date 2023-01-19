package .models.shared;


public enum FileVersionsOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private FileVersionsOrderDirectionEnum(String value) {
        this.value = value;
    }
}
