package shared

import (
	"time"
)

// TimelineSkillCardEntriesAppears
// The timestamp for an entry.
type TimelineSkillCardEntriesAppears struct {
	End   *int64 `json:"end,omitempty"`
	Start *int64 `json:"start,omitempty"`
}

// TimelineSkillCardEntries
// An single item that's placed on multiple items on the timeline.
type TimelineSkillCardEntries struct {
	Appears  []TimelineSkillCardEntriesAppears `json:"appears,omitempty"`
	ImageURL *string                           `json:"image_url,omitempty"`
	Text     *string                           `json:"text,omitempty"`
}

type TimelineSkillCardInvocationTypeEnum string

const (
	TimelineSkillCardInvocationTypeEnumSkillInvocation TimelineSkillCardInvocationTypeEnum = "skill_invocation"
)

// TimelineSkillCardInvocation
// The invocation of this service, used to track
// which instance of a service applied the metadata.
type TimelineSkillCardInvocation struct {
	ID   string                              `json:"id"`
	Type TimelineSkillCardInvocationTypeEnum `json:"type"`
}

type TimelineSkillCardSkillTypeEnum string

const (
	TimelineSkillCardSkillTypeEnumService TimelineSkillCardSkillTypeEnum = "service"
)

// TimelineSkillCardSkill
// The service that applied this metadata.
type TimelineSkillCardSkill struct {
	ID   string                         `json:"id"`
	Type TimelineSkillCardSkillTypeEnum `json:"type"`
}

// TimelineSkillCardSkillCardTitle
// The title of the card.
type TimelineSkillCardSkillCardTitle struct {
	Code    *string `json:"code,omitempty"`
	Message string  `json:"message"`
}

type TimelineSkillCardSkillCardTypeEnum string

const (
	TimelineSkillCardSkillCardTypeEnumTimeline TimelineSkillCardSkillCardTypeEnum = "timeline"
)

type TimelineSkillCardTypeEnum string

const (
	TimelineSkillCardTypeEnumSkillCard TimelineSkillCardTypeEnum = "skill_card"
)

// TimelineSkillCard
// A Box Skill metadata card that places a list of images on a
// timeline.
type TimelineSkillCard struct {
	CreatedAt      *time.Time                         `json:"created_at,omitempty"`
	Duration       *int64                             `json:"duration,omitempty"`
	Entries        []TimelineSkillCardEntries         `json:"entries"`
	Invocation     TimelineSkillCardInvocation        `json:"invocation"`
	Skill          TimelineSkillCardSkill             `json:"skill"`
	SkillCardTitle *TimelineSkillCardSkillCardTitle   `json:"skill_card_title,omitempty"`
	SkillCardType  TimelineSkillCardSkillCardTypeEnum `json:"skill_card_type"`
	Type           TimelineSkillCardTypeEnum          `json:"type"`
}
