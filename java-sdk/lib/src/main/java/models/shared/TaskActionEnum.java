package .models.shared;


public enum TaskActionEnum {
    REVIEW("review"),
    COMPLETE("complete");

    public final String value;

    private TaskActionEnum(String value) {
        this.value = value;
    }
}
