package .models.shared;


public enum RecentItemInteractionTypeEnum {
    ITEM_PREVIEW("item_preview"),
    ITEM_UPLOAD("item_upload"),
    ITEM_COMMENT("item_comment"),
    ITEM_OPEN("item_open"),
    ITEM_MODIFY("item_modify");

    public final String value;

    private RecentItemInteractionTypeEnum(String value) {
        this.value = value;
    }
}
