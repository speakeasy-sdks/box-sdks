package .models.operations;


public enum PostTermsOfServicesRequestBodyTosTypeEnum {
    EXTERNAL("external"),
    MANAGED("managed");

    public final String value;

    private PostTermsOfServicesRequestBodyTosTypeEnum(String value) {
        this.value = value;
    }
}
