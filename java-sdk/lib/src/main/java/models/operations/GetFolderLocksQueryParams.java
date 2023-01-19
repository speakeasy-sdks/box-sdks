package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFolderLocksQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=folder_id")
    public String folderId;
    public GetFolderLocksQueryParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}