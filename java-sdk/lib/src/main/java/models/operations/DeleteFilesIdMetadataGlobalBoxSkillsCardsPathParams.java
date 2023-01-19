package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFilesIdMetadataGlobalBoxSkillsCardsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public DeleteFilesIdMetadataGlobalBoxSkillsCardsPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}