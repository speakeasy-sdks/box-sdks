package shared

import (
	"time"
)

// KeywordSkillCardEntries
// An entry in the `entries` attribute of a metadata card
type KeywordSkillCardEntries struct {
	Text *string `json:"text,omitempty"`
}

type KeywordSkillCardInvocationTypeEnum string

const (
	KeywordSkillCardInvocationTypeEnumSkillInvocation KeywordSkillCardInvocationTypeEnum = "skill_invocation"
)

// KeywordSkillCardInvocation
// The invocation of this service, used to track
// which instance of a service applied the metadata.
type KeywordSkillCardInvocation struct {
	ID   string                             `json:"id"`
	Type KeywordSkillCardInvocationTypeEnum `json:"type"`
}

type KeywordSkillCardSkillTypeEnum string

const (
	KeywordSkillCardSkillTypeEnumService KeywordSkillCardSkillTypeEnum = "service"
)

// KeywordSkillCardSkill
// The service that applied this metadata.
type KeywordSkillCardSkill struct {
	ID   string                        `json:"id"`
	Type KeywordSkillCardSkillTypeEnum `json:"type"`
}

// KeywordSkillCardSkillCardTitle
// The title of the card.
type KeywordSkillCardSkillCardTitle struct {
	Code    *string `json:"code,omitempty"`
	Message string  `json:"message"`
}

type KeywordSkillCardSkillCardTypeEnum string

const (
	KeywordSkillCardSkillCardTypeEnumKeyword KeywordSkillCardSkillCardTypeEnum = "keyword"
)

type KeywordSkillCardTypeEnum string

const (
	KeywordSkillCardTypeEnumSkillCard KeywordSkillCardTypeEnum = "skill_card"
)

// KeywordSkillCard
// A skill card that contains a set of keywords
type KeywordSkillCard struct {
	CreatedAt      *time.Time                        `json:"created_at,omitempty"`
	Entries        []KeywordSkillCardEntries         `json:"entries"`
	Invocation     KeywordSkillCardInvocation        `json:"invocation"`
	Skill          KeywordSkillCardSkill             `json:"skill"`
	SkillCardTitle *KeywordSkillCardSkillCardTitle   `json:"skill_card_title,omitempty"`
	SkillCardType  KeywordSkillCardSkillCardTypeEnum `json:"skill_card_type"`
	Type           KeywordSkillCardTypeEnum          `json:"type"`
}
