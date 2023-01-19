package .models.operations;


public enum PostTermsOfServicesRequestBodyStatusEnum {
    ENABLED("enabled"),
    DISABLED("disabled");

    public final String value;

    private PostTermsOfServicesRequestBodyStatusEnum(String value) {
        this.value = value;
    }
}
