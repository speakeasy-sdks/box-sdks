package shared

import (
	"time"
)

type RecentItemInteractionTypeEnum string

const (
	RecentItemInteractionTypeEnumItemPreview RecentItemInteractionTypeEnum = "item_preview"
	RecentItemInteractionTypeEnumItemUpload  RecentItemInteractionTypeEnum = "item_upload"
	RecentItemInteractionTypeEnumItemComment RecentItemInteractionTypeEnum = "item_comment"
	RecentItemInteractionTypeEnumItemOpen    RecentItemInteractionTypeEnum = "item_open"
	RecentItemInteractionTypeEnumItemModify  RecentItemInteractionTypeEnum = "item_modify"
)

// RecentItem
// A recent item accessed by a user.
type RecentItem struct {
	InteractedAt          *time.Time                     `json:"interacted_at,omitempty"`
	InteractionSharedLink *string                        `json:"interaction_shared_link,omitempty"`
	InteractionType       *RecentItemInteractionTypeEnum `json:"interaction_type,omitempty"`
	Item                  *interface{}                   `json:"item,omitempty"`
	Type                  *string                        `json:"type,omitempty"`
}
