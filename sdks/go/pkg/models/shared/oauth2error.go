package shared

// OAuth2Error
// An OAuth 2.0 error
type OAuth2Error struct {
	Error            *string `json:"error,omitempty"`
	ErrorDescription *string `json:"error_description,omitempty"`
}
