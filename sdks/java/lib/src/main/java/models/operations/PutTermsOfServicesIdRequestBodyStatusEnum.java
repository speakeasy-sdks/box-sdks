package .models.operations;


public enum PutTermsOfServicesIdRequestBodyStatusEnum {
    ENABLED("enabled"),
    DISABLED("disabled");

    public final String value;

    private PutTermsOfServicesIdRequestBodyStatusEnum(String value) {
        this.value = value;
    }
}
