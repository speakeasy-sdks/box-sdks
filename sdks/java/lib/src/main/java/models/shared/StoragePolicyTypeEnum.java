package .models.shared;


public enum StoragePolicyTypeEnum {
    STORAGE_POLICY("storage_policy");

    public final String value;

    private StoragePolicyTypeEnum(String value) {
        this.value = value;
    }
}
