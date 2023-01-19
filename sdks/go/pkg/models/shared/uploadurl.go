package shared

// UploadURL
// The details for the upload session for the file.
type UploadURL struct {
	UploadToken *string `json:"upload_token,omitempty"`
	UploadURL   *string `json:"upload_url,omitempty"`
}
