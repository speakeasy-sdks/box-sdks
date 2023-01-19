package shared

// EventSourceClassification
// The object containing classification information for the item that
// triggered the event. This field will not appear if the item does not
// have a classification set.
type EventSourceClassification struct {
	Name *string `json:"name,omitempty"`
}

type EventSourceItemTypeEnum string

const (
	EventSourceItemTypeEnumFile   EventSourceItemTypeEnum = "file"
	EventSourceItemTypeEnumFolder EventSourceItemTypeEnum = "folder"
)

type EventSourceUserBaseTypeEnum string

const (
	EventSourceUserBaseTypeEnumUser EventSourceUserBaseTypeEnum = "user"
)

// EventSourceUserBase
// The user who owns this item.
type EventSourceUserBase struct {
	ID    *string                     `json:"id,omitempty"`
	Login string                      `json:"login"`
	Name  string                      `json:"name"`
	Type  EventSourceUserBaseTypeEnum `json:"type"`
}

type EventSourceFolderBaseTypeEnum string

const (
	EventSourceFolderBaseTypeEnumFolder EventSourceFolderBaseTypeEnum = "folder"
)

// EventSourceFolderBase
// The optional folder that this folder is located within.
//
// This value may be `null` for some folders such as the
// root folder or the trash folder.
type EventSourceFolderBase struct {
	Etag       *string                       `json:"etag,omitempty"`
	ID         string                        `json:"id"`
	Name       *string                       `json:"name,omitempty"`
	SequenceID map[string]interface{}        `json:"sequence_id,omitempty"`
	Type       EventSourceFolderBaseTypeEnum `json:"type"`
}

// EventSource
// The source file or folder that triggered an event in
// the event stream.
type EventSource struct {
	Classification *EventSourceClassification `json:"classification,omitempty"`
	ItemID         string                     `json:"item_id"`
	ItemName       string                     `json:"item_name"`
	ItemType       EventSourceItemTypeEnum    `json:"item_type"`
	OwnedBy        *EventSourceUserBase       `json:"owned_by,omitempty"`
	Parent         *EventSourceFolderBase     `json:"parent,omitempty"`
}
