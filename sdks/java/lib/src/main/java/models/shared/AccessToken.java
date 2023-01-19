package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * AccessToken
 * A token that can be used to make authenticated API calls.
**/
public class AccessToken {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;
    public AccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_in")
    public Long expiresIn;
    public AccessToken withExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("issued_token_type")
    public AccessTokenIssuedTokenTypeEnum issuedTokenType;
    public AccessToken withIssuedTokenType(AccessTokenIssuedTokenTypeEnum issuedTokenType) {
        this.issuedTokenType = issuedTokenType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    public String refreshToken;
    public AccessToken withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("restricted_to")
    public FileScope[] restrictedTo;
    public AccessToken withRestrictedTo(FileScope[] restrictedTo) {
        this.restrictedTo = restrictedTo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token_type")
    public AccessTokenTokenTypeEnum tokenType;
    public AccessToken withTokenType(AccessTokenTokenTypeEnum tokenType) {
        this.tokenType = tokenType;
        return this;
    }
}