package .models.shared;


public enum CollaborationStatusEnum {
    ACCEPTED("accepted"),
    PENDING("pending"),
    REJECTED("rejected");

    public final String value;

    private CollaborationStatusEnum(String value) {
        this.value = value;
    }
}
