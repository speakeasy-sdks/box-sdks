package .models.shared;


public enum TermsOfServiceStatusEnum {
    ENABLED("enabled"),
    DISABLED("disabled");

    public final String value;

    private TermsOfServiceStatusEnum(String value) {
        this.value = value;
    }
}
