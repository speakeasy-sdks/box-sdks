package .models.shared;


public enum ClassificationTemplateTypeEnum {
    METADATA_TEMPLATE("metadata_template");

    public final String value;

    private ClassificationTemplateTypeEnum(String value) {
        this.value = value;
    }
}
