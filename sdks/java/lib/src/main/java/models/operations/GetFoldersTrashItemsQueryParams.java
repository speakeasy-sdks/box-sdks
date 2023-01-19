package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersTrashItemsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=direction")
    public GetFoldersTrashItemsDirectionEnum direction;
    public GetFoldersTrashItemsQueryParams withDirection(GetFoldersTrashItemsDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFoldersTrashItemsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetFoldersTrashItemsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetFoldersTrashItemsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetFoldersTrashItemsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public GetFoldersTrashItemsSortEnum sort;
    public GetFoldersTrashItemsQueryParams withSort(GetFoldersTrashItemsSortEnum sort) {
        this.sort = sort;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=usemarker")
    public Boolean usemarker;
    public GetFoldersTrashItemsQueryParams withUsemarker(Boolean usemarker) {
        this.usemarker = usemarker;
        return this;
    }
}