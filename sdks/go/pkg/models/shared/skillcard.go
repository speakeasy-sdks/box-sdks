package shared

import (
	"time"
)

// SkillCardEntriesAppears
// The timestamp for an entry.
type SkillCardEntriesAppears struct {
	End   *int64 `json:"end,omitempty"`
	Start *int64 `json:"start,omitempty"`
}

// SkillCardEntries
// An entry in the `entries` attribute of a metadata card
type SkillCardEntries struct {
	Appears  []SkillCardEntriesAppears `json:"appears,omitempty"`
	ImageURL *string                   `json:"image_url,omitempty"`
	Text     *string                   `json:"text,omitempty"`
}

type SkillCardInvocationTypeEnum string

const (
	SkillCardInvocationTypeEnumSkillInvocation SkillCardInvocationTypeEnum = "skill_invocation"
)

// SkillCardInvocation
// The invocation of this service, used to track
// which instance of a service applied the metadata.
type SkillCardInvocation struct {
	ID   string                      `json:"id"`
	Type SkillCardInvocationTypeEnum `json:"type"`
}

type SkillCardSkillTypeEnum string

const (
	SkillCardSkillTypeEnumService SkillCardSkillTypeEnum = "service"
)

// SkillCardSkill
// The service that applied this metadata.
type SkillCardSkill struct {
	ID   string                 `json:"id"`
	Type SkillCardSkillTypeEnum `json:"type"`
}

// SkillCardSkillCardTitle
// The title of the card.
type SkillCardSkillCardTitle struct {
	Code    *string `json:"code,omitempty"`
	Message string  `json:"message"`
}

type SkillCardSkillCardTypeEnum string

const (
	SkillCardSkillCardTypeEnumTranscript SkillCardSkillCardTypeEnum = "transcript"
	SkillCardSkillCardTypeEnumKeyword    SkillCardSkillCardTypeEnum = "keyword"
	SkillCardSkillCardTypeEnumTimeline   SkillCardSkillCardTypeEnum = "timeline"
	SkillCardSkillCardTypeEnumStatus     SkillCardSkillCardTypeEnum = "status"
)

type SkillCardStatusCodeEnum string

const (
	SkillCardStatusCodeEnumInvoked          SkillCardStatusCodeEnum = "invoked"
	SkillCardStatusCodeEnumProcessing       SkillCardStatusCodeEnum = "processing"
	SkillCardStatusCodeEnumSuccess          SkillCardStatusCodeEnum = "success"
	SkillCardStatusCodeEnumTransientFailure SkillCardStatusCodeEnum = "transient_failure"
	SkillCardStatusCodeEnumPermanentFailure SkillCardStatusCodeEnum = "permanent_failure"
)

// SkillCardStatus
// Used with a card of type `status` to set the status of the skill. This can be used to show a message to the user while the Skill is processing the data.
type SkillCardStatus struct {
	Code    SkillCardStatusCodeEnum `json:"code"`
	Message *string                 `json:"message,omitempty"`
}

type SkillCardTypeEnum string

const (
	SkillCardTypeEnumSkillCard SkillCardTypeEnum = "skill_card"
)

// SkillCard
// A generic Box Skill metadata card.
type SkillCard struct {
	CreatedAt      *time.Time                 `json:"created_at,omitempty"`
	Duration       *int64                     `json:"duration,omitempty"`
	Entries        []SkillCardEntries         `json:"entries,omitempty"`
	Invocation     SkillCardInvocation        `json:"invocation"`
	Skill          SkillCardSkill             `json:"skill"`
	SkillCardTitle *SkillCardSkillCardTitle   `json:"skill_card_title,omitempty"`
	SkillCardType  SkillCardSkillCardTypeEnum `json:"skill_card_type"`
	Status         *SkillCardStatus           `json:"status,omitempty"`
	Type           SkillCardTypeEnum          `json:"type"`
}
