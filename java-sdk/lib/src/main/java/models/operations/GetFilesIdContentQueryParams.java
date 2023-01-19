package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdContentQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=access_token")
    public String accessToken;
    public GetFilesIdContentQueryParams withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=version")
    public String version;
    public GetFilesIdContentQueryParams withVersion(String version) {
        this.version = version;
        return this;
    }
}