package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFolderLocksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_lock_id")
    public String folderLockId;
    public DeleteFolderLocksIdPathParams withFolderLockId(String folderLockId) {
        this.folderLockId = folderLockId;
        return this;
    }
}