package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=boxapi")
    public String boxapi;
    public GetFilesIdHeaders withBoxapi(String boxapi) {
        this.boxapi = boxapi;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-none-match")
    public String ifNoneMatch;
    public GetFilesIdHeaders withIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-rep-hints")
    public String xRepHints;
    public GetFilesIdHeaders withXRepHints(String xRepHints) {
        this.xRepHints = xRepHints;
        return this;
    }
}