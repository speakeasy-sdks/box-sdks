package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFileVersionRetentionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=disposition_action")
    public GetFileVersionRetentionsDispositionActionEnum dispositionAction;
    public GetFileVersionRetentionsQueryParams withDispositionAction(GetFileVersionRetentionsDispositionActionEnum dispositionAction) {
        this.dispositionAction = dispositionAction;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=disposition_after")
    public String dispositionAfter;
    public GetFileVersionRetentionsQueryParams withDispositionAfter(String dispositionAfter) {
        this.dispositionAfter = dispositionAfter;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=disposition_before")
    public String dispositionBefore;
    public GetFileVersionRetentionsQueryParams withDispositionBefore(String dispositionBefore) {
        this.dispositionBefore = dispositionBefore;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=file_id")
    public String fileId;
    public GetFileVersionRetentionsQueryParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=file_version_id")
    public String fileVersionId;
    public GetFileVersionRetentionsQueryParams withFileVersionId(String fileVersionId) {
        this.fileVersionId = fileVersionId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetFileVersionRetentionsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetFileVersionRetentionsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=policy_id")
    public String policyId;
    public GetFileVersionRetentionsQueryParams withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
}