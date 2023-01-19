package .models.shared;


public enum CollaborationsOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private CollaborationsOrderDirectionEnum(String value) {
        this.value = value;
    }
}
