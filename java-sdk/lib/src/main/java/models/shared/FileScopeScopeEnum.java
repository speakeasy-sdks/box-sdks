package .models.shared;


public enum FileScopeScopeEnum {
    ANNOTATION_EDIT("annotation_edit"),
    ANNOTATION_VIEW_ALL("annotation_view_all"),
    ANNOTATION_VIEW_SELF("annotation_view_self"),
    BASE_EXPLORER("base_explorer"),
    BASE_PICKER("base_picker"),
    BASE_PREVIEW("base_preview"),
    BASE_UPLOAD("base_upload"),
    ITEM_DELETE("item_delete"),
    ITEM_DOWNLOAD("item_download"),
    ITEM_PREVIEW("item_preview"),
    ITEM_RENAME("item_rename"),
    ITEM_SHARE("item_share");

    public final String value;

    private FileScopeScopeEnum(String value) {
        this.value = value;
    }
}
