package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetMetadataTemplatesIdIdSchemaPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scope")
    public GetMetadataTemplatesIdIdSchemaScopeEnum scope;
    public GetMetadataTemplatesIdIdSchemaPathParams withScope(GetMetadataTemplatesIdIdSchemaScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_key")
    public String templateKey;
    public GetMetadataTemplatesIdIdSchemaPathParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}