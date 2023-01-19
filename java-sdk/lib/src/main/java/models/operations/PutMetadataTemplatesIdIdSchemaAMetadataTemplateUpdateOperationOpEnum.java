package .models.operations;


public enum PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperationOpEnum {
    EDIT_TEMPLATE("editTemplate"),
    ADD_FIELD("addField"),
    REORDER_FIELDS("reorderFields"),
    ADD_ENUM_OPTION("addEnumOption"),
    REORDER_ENUM_OPTIONS("reorderEnumOptions"),
    REORDER_MULTI_SELECT_OPTIONS("reorderMultiSelectOptions"),
    ADD_MULTI_SELECT_OPTION("addMultiSelectOption"),
    EDIT_FIELD("editField"),
    REMOVE_FIELD("removeField"),
    EDIT_ENUM_OPTION("editEnumOption"),
    REMOVE_ENUM_OPTION("removeEnumOption"),
    EDIT_MULTI_SELECT_OPTION("editMultiSelectOption"),
    REMOVE_MULTI_SELECT_OPTION("removeMultiSelectOption");

    public final String value;

    private PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperationOpEnum(String value) {
        this.value = value;
    }
}
