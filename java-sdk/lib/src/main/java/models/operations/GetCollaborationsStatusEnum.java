package .models.operations;


public enum GetCollaborationsStatusEnum {
    PENDING("pending");

    public final String value;

    private GetCollaborationsStatusEnum(String value) {
        this.value = value;
    }
}
