package shared

// UploadedPart
// A chunk of a file uploaded as part of
// an upload session, as returned by some endpoints.
type UploadedPart struct {
	Part *UploadPart `json:"part,omitempty"`
}
