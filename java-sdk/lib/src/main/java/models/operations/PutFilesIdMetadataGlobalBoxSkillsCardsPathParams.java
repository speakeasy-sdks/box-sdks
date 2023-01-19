package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdMetadataGlobalBoxSkillsCardsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PutFilesIdMetadataGlobalBoxSkillsCardsPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}