package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetAuthorizeQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;
    public GetAuthorizeQueryParams withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=redirect_uri")
    public String redirectUri;
    public GetAuthorizeQueryParams withRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=response_type")
    public GetAuthorizeResponseTypeEnum responseType;
    public GetAuthorizeQueryParams withResponseType(GetAuthorizeResponseTypeEnum responseType) {
        this.responseType = responseType;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=scope")
    public String scope;
    public GetAuthorizeQueryParams withScope(String scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=state")
    public String state;
    public GetAuthorizeQueryParams withState(String state) {
        this.state = state;
        return this;
    }
}