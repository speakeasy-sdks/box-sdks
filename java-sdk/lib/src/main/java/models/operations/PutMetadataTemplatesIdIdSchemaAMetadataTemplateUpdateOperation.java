package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation
 * A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
 * change to make to the metadata instance.
**/
public class PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public java.util.Map<String, String> data;
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation withData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enumOptionKey")
    public String enumOptionKey;
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation withEnumOptionKey(String enumOptionKey) {
        this.enumOptionKey = enumOptionKey;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enumOptionKeys")
    public String[] enumOptionKeys;
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation withEnumOptionKeys(String[] enumOptionKeys) {
        this.enumOptionKeys = enumOptionKeys;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fieldKey")
    public String fieldKey;
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation withFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fieldKeys")
    public String[] fieldKeys;
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation withFieldKeys(String[] fieldKeys) {
        this.fieldKeys = fieldKeys;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("multiSelectOptionKey")
    public String multiSelectOptionKey;
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation withMultiSelectOptionKey(String multiSelectOptionKey) {
        this.multiSelectOptionKey = multiSelectOptionKey;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("multiSelectOptionKeys")
    public String[] multiSelectOptionKeys;
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation withMultiSelectOptionKeys(String[] multiSelectOptionKeys) {
        this.multiSelectOptionKeys = multiSelectOptionKeys;
        return this;
    }
    @JsonProperty("op")
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperationOpEnum op;
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation withOp(PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperationOpEnum op) {
        this.op = op;
        return this;
    }
}