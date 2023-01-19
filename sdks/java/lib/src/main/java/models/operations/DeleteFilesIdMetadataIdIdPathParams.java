package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFilesIdMetadataIdIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public DeleteFilesIdMetadataIdIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scope")
    public DeleteFilesIdMetadataIdIdScopeEnum scope;
    public DeleteFilesIdMetadataIdIdPathParams withScope(DeleteFilesIdMetadataIdIdScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_key")
    public String templateKey;
    public DeleteFilesIdMetadataIdIdPathParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}