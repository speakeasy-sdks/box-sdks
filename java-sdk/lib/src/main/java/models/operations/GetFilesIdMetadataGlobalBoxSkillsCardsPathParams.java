package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdMetadataGlobalBoxSkillsCardsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdMetadataGlobalBoxSkillsCardsPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}