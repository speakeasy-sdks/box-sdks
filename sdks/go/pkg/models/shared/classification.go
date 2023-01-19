package shared

type ClassificationDollarTemplateEnum string

const (
	ClassificationDollarTemplateEnumSecurityClassification6VMVochwUWo ClassificationDollarTemplateEnum = "securityClassification-6VMVochwUWo"
)

// Classification
// An instance of the classification metadata template, containing
// the classification applied to the file or folder.
//
// To get more details about the classification applied to an item,
// request the classification metadata template.
type Classification struct {
	DollarCanEdit                *bool                             `json:"$canEdit,omitempty"`
	DollarParent                 *string                           `json:"$parent,omitempty"`
	DollarScope                  *string                           `json:"$scope,omitempty"`
	DollarTemplate               *ClassificationDollarTemplateEnum `json:"$template,omitempty"`
	DollarType                   *string                           `json:"$type,omitempty"`
	DollarTypeVersion            *float64                          `json:"$typeVersion,omitempty"`
	DollarVersion                *int64                            `json:"$version,omitempty"`
	BoxSecurityClassificationKey *string                           `json:"Box__Security__Classification__Key,omitempty"`
}
