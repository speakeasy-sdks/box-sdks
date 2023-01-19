package .models.shared;


public enum UploadPartsOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private UploadPartsOrderDirectionEnum(String value) {
        this.value = value;
    }
}
