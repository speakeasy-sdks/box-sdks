package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetMetadataCascadePoliciesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=folder_id")
    public String folderId;
    public GetMetadataCascadePoliciesQueryParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetMetadataCascadePoliciesQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetMetadataCascadePoliciesQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=owner_enterprise_id")
    public String ownerEnterpriseId;
    public GetMetadataCascadePoliciesQueryParams withOwnerEnterpriseId(String ownerEnterpriseId) {
        this.ownerEnterpriseId = ownerEnterpriseId;
        return this;
    }
}