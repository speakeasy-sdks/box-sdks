package shared

// Metadata
// The base representation of a metadata instance.
type Metadata struct {
	DollarParent   *string `json:"$parent,omitempty"`
	DollarScope    *string `json:"$scope,omitempty"`
	DollarTemplate *string `json:"$template,omitempty"`
	DollarVersion  *int64  `json:"$version,omitempty"`
}
