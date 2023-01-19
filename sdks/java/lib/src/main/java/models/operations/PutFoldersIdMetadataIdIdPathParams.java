package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdMetadataIdIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public PutFoldersIdMetadataIdIdPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scope")
    public PutFoldersIdMetadataIdIdScopeEnum scope;
    public PutFoldersIdMetadataIdIdPathParams withScope(PutFoldersIdMetadataIdIdScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_key")
    public String templateKey;
    public PutFoldersIdMetadataIdIdPathParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}