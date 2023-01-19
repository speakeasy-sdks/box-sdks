package .models.shared;


public enum GroupsOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private GroupsOrderDirectionEnum(String value) {
        this.value = value;
    }
}
