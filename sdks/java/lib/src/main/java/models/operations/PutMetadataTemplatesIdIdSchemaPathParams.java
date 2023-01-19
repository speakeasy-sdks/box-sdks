package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutMetadataTemplatesIdIdSchemaPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scope")
    public PutMetadataTemplatesIdIdSchemaScopeEnum scope;
    public PutMetadataTemplatesIdIdSchemaPathParams withScope(PutMetadataTemplatesIdIdSchemaScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_key")
    public String templateKey;
    public PutMetadataTemplatesIdIdSchemaPathParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}