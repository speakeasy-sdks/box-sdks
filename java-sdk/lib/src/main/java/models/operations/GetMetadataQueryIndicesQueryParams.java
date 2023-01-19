package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetMetadataQueryIndicesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=scope")
    public GetMetadataQueryIndicesScopeEnum scope;
    public GetMetadataQueryIndicesQueryParams withScope(GetMetadataQueryIndicesScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=template_key")
    public String templateKey;
    public GetMetadataQueryIndicesQueryParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}