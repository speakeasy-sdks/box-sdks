package .models.shared;


public enum UsersOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private UsersOrderDirectionEnum(String value) {
        this.value = value;
    }
}
