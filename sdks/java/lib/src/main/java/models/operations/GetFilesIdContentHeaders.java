package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdContentHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=boxapi")
    public String boxapi;
    public GetFilesIdContentHeaders withBoxapi(String boxapi) {
        this.boxapi = boxapi;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=range")
    public String range;
    public GetFilesIdContentHeaders withRange(String range) {
        this.range = range;
        return this;
    }
}