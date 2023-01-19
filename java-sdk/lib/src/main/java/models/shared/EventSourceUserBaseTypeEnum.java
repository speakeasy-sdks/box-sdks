package .models.shared;


public enum EventSourceUserBaseTypeEnum {
    USER("user");

    public final String value;

    private EventSourceUserBaseTypeEnum(String value) {
        this.value = value;
    }
}
