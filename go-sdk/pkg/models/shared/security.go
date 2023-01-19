package shared

type SchemeOAuth2Security struct {
	Authorization string `security:"name=Authorization"`
}

type Security struct {
	OAuth2Security SchemeOAuth2Security `security:"scheme,type=oauth2"`
}
