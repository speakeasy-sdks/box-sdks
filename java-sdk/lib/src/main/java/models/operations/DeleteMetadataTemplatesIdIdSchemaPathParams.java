package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteMetadataTemplatesIdIdSchemaPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scope")
    public DeleteMetadataTemplatesIdIdSchemaScopeEnum scope;
    public DeleteMetadataTemplatesIdIdSchemaPathParams withScope(DeleteMetadataTemplatesIdIdSchemaScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_key")
    public String templateKey;
    public DeleteMetadataTemplatesIdIdSchemaPathParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}