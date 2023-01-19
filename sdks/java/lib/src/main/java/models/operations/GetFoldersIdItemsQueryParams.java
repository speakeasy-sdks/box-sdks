package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdItemsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=direction")
    public GetFoldersIdItemsDirectionEnum direction;
    public GetFoldersIdItemsQueryParams withDirection(GetFoldersIdItemsDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFoldersIdItemsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetFoldersIdItemsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetFoldersIdItemsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetFoldersIdItemsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public GetFoldersIdItemsSortEnum sort;
    public GetFoldersIdItemsQueryParams withSort(GetFoldersIdItemsSortEnum sort) {
        this.sort = sort;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=usemarker")
    public Boolean usemarker;
    public GetFoldersIdItemsQueryParams withUsemarker(Boolean usemarker) {
        this.usemarker = usemarker;
        return this;
    }
}