package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdTrashPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public GetFoldersIdTrashPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}