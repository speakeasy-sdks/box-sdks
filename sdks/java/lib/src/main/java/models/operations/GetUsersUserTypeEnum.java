package .models.operations;


public enum GetUsersUserTypeEnum {
    ALL("all"),
    MANAGED("managed"),
    EXTERNAL("external");

    public final String value;

    private GetUsersUserTypeEnum(String value) {
        this.value = value;
    }
}
