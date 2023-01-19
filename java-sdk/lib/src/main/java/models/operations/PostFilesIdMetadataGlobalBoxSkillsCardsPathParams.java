package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdMetadataGlobalBoxSkillsCardsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PostFilesIdMetadataGlobalBoxSkillsCardsPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}