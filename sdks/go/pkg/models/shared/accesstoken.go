package shared

type AccessTokenIssuedTokenTypeEnum string

const (
	AccessTokenIssuedTokenTypeEnumUrnIetfParamsOauthTokenTypeAccessToken AccessTokenIssuedTokenTypeEnum = "urn:ietf:params:oauth:token-type:access_token"
)

type AccessTokenTokenTypeEnum string

const (
	AccessTokenTokenTypeEnumBearer AccessTokenTokenTypeEnum = "bearer"
)

// AccessToken
// A token that can be used to make authenticated API calls.
type AccessToken struct {
	AccessToken     *string                         `json:"access_token,omitempty"`
	ExpiresIn       *int64                          `json:"expires_in,omitempty"`
	IssuedTokenType *AccessTokenIssuedTokenTypeEnum `json:"issued_token_type,omitempty"`
	RefreshToken    *string                         `json:"refresh_token,omitempty"`
	RestrictedTo    []FileScope                     `json:"restricted_to,omitempty"`
	TokenType       *AccessTokenTokenTypeEnum       `json:"token_type,omitempty"`
}
