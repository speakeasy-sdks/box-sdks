package shared

import (
	"time"
)

// TranscriptSkillCardEntriesAppears
// The timestamp for an entry.
type TranscriptSkillCardEntriesAppears struct {
	Start *int64 `json:"start,omitempty"`
}

// TranscriptSkillCardEntries
// An entry in the `entries` attribute of a metadata card
type TranscriptSkillCardEntries struct {
	Appears []TranscriptSkillCardEntriesAppears `json:"appears,omitempty"`
	Text    *string                             `json:"text,omitempty"`
}

type TranscriptSkillCardInvocationTypeEnum string

const (
	TranscriptSkillCardInvocationTypeEnumSkillInvocation TranscriptSkillCardInvocationTypeEnum = "skill_invocation"
)

// TranscriptSkillCardInvocation
// The invocation of this service, used to track
// which instance of a service applied the metadata.
type TranscriptSkillCardInvocation struct {
	ID   string                                `json:"id"`
	Type TranscriptSkillCardInvocationTypeEnum `json:"type"`
}

type TranscriptSkillCardSkillTypeEnum string

const (
	TranscriptSkillCardSkillTypeEnumService TranscriptSkillCardSkillTypeEnum = "service"
)

// TranscriptSkillCardSkill
// The service that applied this metadata.
type TranscriptSkillCardSkill struct {
	ID   string                           `json:"id"`
	Type TranscriptSkillCardSkillTypeEnum `json:"type"`
}

// TranscriptSkillCardSkillCardTitle
// The title of the card.
type TranscriptSkillCardSkillCardTitle struct {
	Code    *string `json:"code,omitempty"`
	Message string  `json:"message"`
}

type TranscriptSkillCardSkillCardTypeEnum string

const (
	TranscriptSkillCardSkillCardTypeEnumTranscript TranscriptSkillCardSkillCardTypeEnum = "transcript"
)

type TranscriptSkillCardTypeEnum string

const (
	TranscriptSkillCardTypeEnumSkillCard TranscriptSkillCardTypeEnum = "skill_card"
)

// TranscriptSkillCard
// A Box Skill metadata card that adds a transcript to a file.
type TranscriptSkillCard struct {
	CreatedAt      *time.Time                           `json:"created_at,omitempty"`
	Duration       *int64                               `json:"duration,omitempty"`
	Entries        []TranscriptSkillCardEntries         `json:"entries"`
	Invocation     TranscriptSkillCardInvocation        `json:"invocation"`
	Skill          TranscriptSkillCardSkill             `json:"skill"`
	SkillCardTitle *TranscriptSkillCardSkillCardTitle   `json:"skill_card_title,omitempty"`
	SkillCardType  TranscriptSkillCardSkillCardTypeEnum `json:"skill_card_type"`
	Type           TranscriptSkillCardTypeEnum          `json:"type"`
}
