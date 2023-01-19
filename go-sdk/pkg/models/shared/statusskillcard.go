package shared

import (
	"time"
)

type StatusSkillCardInvocationTypeEnum string

const (
	StatusSkillCardInvocationTypeEnumSkillInvocation StatusSkillCardInvocationTypeEnum = "skill_invocation"
)

// StatusSkillCardInvocation
// The invocation of this service, used to track
// which instance of a service applied the metadata.
type StatusSkillCardInvocation struct {
	ID   string                            `json:"id"`
	Type StatusSkillCardInvocationTypeEnum `json:"type"`
}

type StatusSkillCardSkillTypeEnum string

const (
	StatusSkillCardSkillTypeEnumService StatusSkillCardSkillTypeEnum = "service"
)

// StatusSkillCardSkill
// The service that applied this metadata.
type StatusSkillCardSkill struct {
	ID   string                       `json:"id"`
	Type StatusSkillCardSkillTypeEnum `json:"type"`
}

// StatusSkillCardSkillCardTitle
// The title of the card.
type StatusSkillCardSkillCardTitle struct {
	Code    *string `json:"code,omitempty"`
	Message string  `json:"message"`
}

type StatusSkillCardSkillCardTypeEnum string

const (
	StatusSkillCardSkillCardTypeEnumStatus StatusSkillCardSkillCardTypeEnum = "status"
)

type StatusSkillCardStatusCodeEnum string

const (
	StatusSkillCardStatusCodeEnumInvoked          StatusSkillCardStatusCodeEnum = "invoked"
	StatusSkillCardStatusCodeEnumProcessing       StatusSkillCardStatusCodeEnum = "processing"
	StatusSkillCardStatusCodeEnumSuccess          StatusSkillCardStatusCodeEnum = "success"
	StatusSkillCardStatusCodeEnumTransientFailure StatusSkillCardStatusCodeEnum = "transient_failure"
	StatusSkillCardStatusCodeEnumPermanentFailure StatusSkillCardStatusCodeEnum = "permanent_failure"
)

// StatusSkillCardStatus
// Sets the status of the skill. This can be used to show a message to the user while the Skill is processing the data, or if it was not able to process the file.
type StatusSkillCardStatus struct {
	Code    StatusSkillCardStatusCodeEnum `json:"code"`
	Message *string                       `json:"message,omitempty"`
}

type StatusSkillCardTypeEnum string

const (
	StatusSkillCardTypeEnumSkillCard StatusSkillCardTypeEnum = "skill_card"
)

// StatusSkillCard
// A Box Skill metadata card that puts a status message in the metadata sidebar.
type StatusSkillCard struct {
	CreatedAt      *time.Time                       `json:"created_at,omitempty"`
	Invocation     StatusSkillCardInvocation        `json:"invocation"`
	Skill          StatusSkillCardSkill             `json:"skill"`
	SkillCardTitle *StatusSkillCardSkillCardTitle   `json:"skill_card_title,omitempty"`
	SkillCardType  StatusSkillCardSkillCardTypeEnum `json:"skill_card_type"`
	Status         StatusSkillCardStatus            `json:"status"`
	Type           StatusSkillCardTypeEnum          `json:"type"`
}
