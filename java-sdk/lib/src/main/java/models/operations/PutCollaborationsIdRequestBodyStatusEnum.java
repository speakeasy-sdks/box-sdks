package .models.operations;


public enum PutCollaborationsIdRequestBodyStatusEnum {
    PENDING("pending"),
    ACCEPTED("accepted"),
    REJECTED("rejected");

    public final String value;

    private PutCollaborationsIdRequestBodyStatusEnum(String value) {
        this.value = value;
    }
}
