package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetMetadataTemplatesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=metadata_instance_id")
    public String metadataInstanceId;
    public GetMetadataTemplatesQueryParams withMetadataInstanceId(String metadataInstanceId) {
        this.metadataInstanceId = metadataInstanceId;
        return this;
    }
}