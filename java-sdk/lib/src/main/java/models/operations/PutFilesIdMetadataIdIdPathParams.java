package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdMetadataIdIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PutFilesIdMetadataIdIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scope")
    public PutFilesIdMetadataIdIdScopeEnum scope;
    public PutFilesIdMetadataIdIdPathParams withScope(PutFilesIdMetadataIdIdScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_key")
    public String templateKey;
    public PutFilesIdMetadataIdIdPathParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}