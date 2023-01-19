package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFoldersIdMetadataIdIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public DeleteFoldersIdMetadataIdIdPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scope")
    public DeleteFoldersIdMetadataIdIdScopeEnum scope;
    public DeleteFoldersIdMetadataIdIdPathParams withScope(DeleteFoldersIdMetadataIdIdScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_key")
    public String templateKey;
    public DeleteFoldersIdMetadataIdIdPathParams withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}