package shared

type PostOAuth2TokenActorTokenTypeEnum string

const (
	PostOAuth2TokenActorTokenTypeEnumUrnIetfParamsOauthTokenTypeIDToken PostOAuth2TokenActorTokenTypeEnum = "urn:ietf:params:oauth:token-type:id_token"
)

type PostOAuth2TokenBoxSubjectTypeEnum string

const (
	PostOAuth2TokenBoxSubjectTypeEnumEnterprise PostOAuth2TokenBoxSubjectTypeEnum = "enterprise"
	PostOAuth2TokenBoxSubjectTypeEnumUser       PostOAuth2TokenBoxSubjectTypeEnum = "user"
)

type PostOAuth2TokenGrantTypeEnum string

const (
	PostOAuth2TokenGrantTypeEnumAuthorizationCode                        PostOAuth2TokenGrantTypeEnum = "authorization_code"
	PostOAuth2TokenGrantTypeEnumRefreshToken                             PostOAuth2TokenGrantTypeEnum = "refresh_token"
	PostOAuth2TokenGrantTypeEnumClientCredentials                        PostOAuth2TokenGrantTypeEnum = "client_credentials"
	PostOAuth2TokenGrantTypeEnumUrnIetfParamsOauthGrantTypeJwtBearer     PostOAuth2TokenGrantTypeEnum = "urn:ietf:params:oauth:grant-type:jwt-bearer"
	PostOAuth2TokenGrantTypeEnumUrnIetfParamsOauthGrantTypeTokenExchange PostOAuth2TokenGrantTypeEnum = "urn:ietf:params:oauth:grant-type:token-exchange"
)

type PostOAuth2TokenSubjectTokenTypeEnum string

const (
	PostOAuth2TokenSubjectTokenTypeEnumUrnIetfParamsOauthTokenTypeAccessToken PostOAuth2TokenSubjectTokenTypeEnum = "urn:ietf:params:oauth:token-type:access_token"
)

// PostOAuth2Token
// A request for a new OAuth 2.0 token
type PostOAuth2Token struct {
	ActorToken       *string                              `form:"name=actor_token"`
	ActorTokenType   *PostOAuth2TokenActorTokenTypeEnum   `form:"name=actor_token_type"`
	Assertion        *string                              `form:"name=assertion"`
	BoxSharedLink    *string                              `form:"name=box_shared_link"`
	BoxSubjectID     *string                              `form:"name=box_subject_id"`
	BoxSubjectType   *PostOAuth2TokenBoxSubjectTypeEnum   `form:"name=box_subject_type"`
	ClientID         *string                              `form:"name=client_id"`
	ClientSecret     *string                              `form:"name=client_secret"`
	Code             *string                              `form:"name=code"`
	GrantType        PostOAuth2TokenGrantTypeEnum         `form:"name=grant_type"`
	RefreshToken     *string                              `form:"name=refresh_token"`
	Resource         *string                              `form:"name=resource"`
	Scope            *string                              `form:"name=scope"`
	SubjectToken     *string                              `form:"name=subject_token"`
	SubjectTokenType *PostOAuth2TokenSubjectTokenTypeEnum `form:"name=subject_token_type"`
}
