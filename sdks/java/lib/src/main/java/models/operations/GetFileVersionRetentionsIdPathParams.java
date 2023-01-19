package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFileVersionRetentionsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_version_retention_id")
    public String fileVersionRetentionId;
    public GetFileVersionRetentionsIdPathParams withFileVersionRetentionId(String fileVersionRetentionId) {
        this.fileVersionRetentionId = fileVersionRetentionId;
        return this;
    }
}