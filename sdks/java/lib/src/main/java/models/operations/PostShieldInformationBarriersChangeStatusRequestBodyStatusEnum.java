package .models.operations;


public enum PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum {
    PENDING("pending"),
    DISABLED("disabled");

    public final String value;

    private PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum(String value) {
        this.value = value;
    }
}
