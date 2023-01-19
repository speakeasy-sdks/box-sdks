package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetStoragePoliciesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetStoragePoliciesQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetStoragePoliciesQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetStoragePoliciesQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}