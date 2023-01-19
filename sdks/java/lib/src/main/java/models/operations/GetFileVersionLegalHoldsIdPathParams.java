package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFileVersionLegalHoldsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_version_legal_hold_id")
    public String fileVersionLegalHoldId;
    public GetFileVersionLegalHoldsIdPathParams withFileVersionLegalHoldId(String fileVersionLegalHoldId) {
        this.fileVersionLegalHoldId = fileVersionLegalHoldId;
        return this;
    }
}