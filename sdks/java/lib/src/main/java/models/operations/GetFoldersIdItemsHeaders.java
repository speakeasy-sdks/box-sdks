package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdItemsHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=boxapi")
    public String boxapi;
    public GetFoldersIdItemsHeaders withBoxapi(String boxapi) {
        this.boxapi = boxapi;
        return this;
    }
}