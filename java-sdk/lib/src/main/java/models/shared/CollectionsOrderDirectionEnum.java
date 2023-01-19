package .models.shared;


public enum CollectionsOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private CollectionsOrderDirectionEnum(String value) {
        this.value = value;
    }
}
