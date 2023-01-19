package shared

// PostOAuth2Revoke
// A request to revoke an OAuth 2.0 token
type PostOAuth2Revoke struct {
	ClientID     *string `form:"name=client_id"`
	ClientSecret *string `form:"name=client_secret"`
	Token        *string `form:"name=token"`
}
