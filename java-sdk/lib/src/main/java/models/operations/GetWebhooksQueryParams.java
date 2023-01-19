package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetWebhooksQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetWebhooksQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetWebhooksQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}