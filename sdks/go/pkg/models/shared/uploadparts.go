package shared

type UploadPartsOrderDirectionEnum string

const (
	UploadPartsOrderDirectionEnumAsc  UploadPartsOrderDirectionEnum = "ASC"
	UploadPartsOrderDirectionEnumDesc UploadPartsOrderDirectionEnum = "DESC"
)

// UploadPartsOrder
// The order in which a pagination is ordered
type UploadPartsOrder struct {
	By        *string                        `json:"by,omitempty"`
	Direction *UploadPartsOrderDirectionEnum `json:"direction,omitempty"`
}

// UploadParts
// The part of an API response that describes pagination
type UploadParts struct {
	Entries    []UploadPart       `json:"entries,omitempty"`
	Limit      *int64             `json:"limit,omitempty"`
	Offset     *int64             `json:"offset,omitempty"`
	Order      []UploadPartsOrder `json:"order,omitempty"`
	TotalCount *int64             `json:"total_count,omitempty"`
}
