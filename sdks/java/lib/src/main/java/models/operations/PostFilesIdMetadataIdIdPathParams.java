package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdMetadataIdIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PostFilesIdMetadataIdIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scope")
    public PostFilesIdMetadataIdIdScopeEnum scope;
    public PostFilesIdMetadataIdIdPathParams withScope(PostFilesIdMetadataIdIdScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_key")
    public String templateKey;
    public PostFilesIdMetadataIdIdPathParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}