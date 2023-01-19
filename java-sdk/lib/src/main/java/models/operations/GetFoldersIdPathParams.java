package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public GetFoldersIdPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}