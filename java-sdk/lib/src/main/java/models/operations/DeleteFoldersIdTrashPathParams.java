package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFoldersIdTrashPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public DeleteFoldersIdTrashPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}