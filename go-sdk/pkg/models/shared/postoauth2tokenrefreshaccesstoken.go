package shared

type PostOAuth2TokenRefreshAccessTokenGrantTypeEnum string

const (
	PostOAuth2TokenRefreshAccessTokenGrantTypeEnumRefreshToken PostOAuth2TokenRefreshAccessTokenGrantTypeEnum = "refresh_token"
)

// PostOAuth2TokenRefreshAccessToken
// A request to refresh an Access Token. Use this API to refresh an expired
// Access Token using a valid Refresh Token.
type PostOAuth2TokenRefreshAccessToken struct {
	ClientID     string                                         `form:"name=client_id"`
	ClientSecret string                                         `form:"name=client_secret"`
	GrantType    PostOAuth2TokenRefreshAccessTokenGrantTypeEnum `form:"name=grant_type"`
	RefreshToken string                                         `form:"name=refresh_token"`
}
