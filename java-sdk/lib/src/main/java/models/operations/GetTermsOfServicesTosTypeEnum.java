package .models.operations;


public enum GetTermsOfServicesTosTypeEnum {
    EXTERNAL("external"),
    MANAGED("managed");

    public final String value;

    private GetTermsOfServicesTosTypeEnum(String value) {
        this.value = value;
    }
}
