package shared

// SkillCardsMetadata
// The metadata assigned to a using for Box skills.
type SkillCardsMetadata struct {
	DollarCanEdit     *bool         `json:"$canEdit,omitempty"`
	DollarID          *string       `json:"$id,omitempty"`
	DollarParent      *string       `json:"$parent,omitempty"`
	DollarScope       *string       `json:"$scope,omitempty"`
	DollarTemplate    *string       `json:"$template,omitempty"`
	DollarType        *string       `json:"$type,omitempty"`
	DollarTypeVersion *int64        `json:"$typeVersion,omitempty"`
	DollarVersion     *int64        `json:"$version,omitempty"`
	Cards             []interface{} `json:"cards,omitempty"`
}
