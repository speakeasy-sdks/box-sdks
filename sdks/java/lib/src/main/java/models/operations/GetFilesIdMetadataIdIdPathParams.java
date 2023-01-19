package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdMetadataIdIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdMetadataIdIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scope")
    public GetFilesIdMetadataIdIdScopeEnum scope;
    public GetFilesIdMetadataIdIdPathParams withScope(GetFilesIdMetadataIdIdScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_key")
    public String templateKey;
    public GetFilesIdMetadataIdIdPathParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}