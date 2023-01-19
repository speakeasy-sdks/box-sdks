package .models.shared;

import .utils.SpeakeasyMetadata;

/**
 * PostOAuth2Token
 * A request for a new OAuth 2.0 token
**/
public class PostOAuth2Token {
    @SpeakeasyMetadata("form:name=actor_token")
    public String actorToken;
    public PostOAuth2Token withActorToken(String actorToken) {
        this.actorToken = actorToken;
        return this;
    }
    @SpeakeasyMetadata("form:name=actor_token_type")
    public PostOAuth2TokenActorTokenTypeEnum actorTokenType;
    public PostOAuth2Token withActorTokenType(PostOAuth2TokenActorTokenTypeEnum actorTokenType) {
        this.actorTokenType = actorTokenType;
        return this;
    }
    @SpeakeasyMetadata("form:name=assertion")
    public String assertion;
    public PostOAuth2Token withAssertion(String assertion) {
        this.assertion = assertion;
        return this;
    }
    @SpeakeasyMetadata("form:name=box_shared_link")
    public String boxSharedLink;
    public PostOAuth2Token withBoxSharedLink(String boxSharedLink) {
        this.boxSharedLink = boxSharedLink;
        return this;
    }
    @SpeakeasyMetadata("form:name=box_subject_id")
    public String boxSubjectId;
    public PostOAuth2Token withBoxSubjectId(String boxSubjectId) {
        this.boxSubjectId = boxSubjectId;
        return this;
    }
    @SpeakeasyMetadata("form:name=box_subject_type")
    public PostOAuth2TokenBoxSubjectTypeEnum boxSubjectType;
    public PostOAuth2Token withBoxSubjectType(PostOAuth2TokenBoxSubjectTypeEnum boxSubjectType) {
        this.boxSubjectType = boxSubjectType;
        return this;
    }
    @SpeakeasyMetadata("form:name=client_id")
    public String clientId;
    public PostOAuth2Token withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    @SpeakeasyMetadata("form:name=client_secret")
    public String clientSecret;
    public PostOAuth2Token withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    @SpeakeasyMetadata("form:name=code")
    public String code;
    public PostOAuth2Token withCode(String code) {
        this.code = code;
        return this;
    }
    @SpeakeasyMetadata("form:name=grant_type")
    public PostOAuth2TokenGrantTypeEnum grantType;
    public PostOAuth2Token withGrantType(PostOAuth2TokenGrantTypeEnum grantType) {
        this.grantType = grantType;
        return this;
    }
    @SpeakeasyMetadata("form:name=refresh_token")
    public String refreshToken;
    public PostOAuth2Token withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    @SpeakeasyMetadata("form:name=resource")
    public String resource;
    public PostOAuth2Token withResource(String resource) {
        this.resource = resource;
        return this;
    }
    @SpeakeasyMetadata("form:name=scope")
    public String scope;
    public PostOAuth2Token withScope(String scope) {
        this.scope = scope;
        return this;
    }
    @SpeakeasyMetadata("form:name=subject_token")
    public String subjectToken;
    public PostOAuth2Token withSubjectToken(String subjectToken) {
        this.subjectToken = subjectToken;
        return this;
    }
    @SpeakeasyMetadata("form:name=subject_token_type")
    public PostOAuth2TokenSubjectTokenTypeEnum subjectTokenType;
    public PostOAuth2Token withSubjectTokenType(PostOAuth2TokenSubjectTokenTypeEnum subjectTokenType) {
        this.subjectTokenType = subjectTokenType;
        return this;
    }
}