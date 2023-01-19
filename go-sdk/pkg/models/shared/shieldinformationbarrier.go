package shared

import (
	"time"
)

type ShieldInformationBarrierStatusEnum string

const (
	ShieldInformationBarrierStatusEnumDraft    ShieldInformationBarrierStatusEnum = "draft"
	ShieldInformationBarrierStatusEnumPending  ShieldInformationBarrierStatusEnum = "pending"
	ShieldInformationBarrierStatusEnumDisabled ShieldInformationBarrierStatusEnum = "disabled"
	ShieldInformationBarrierStatusEnumEnabled  ShieldInformationBarrierStatusEnum = "enabled"
	ShieldInformationBarrierStatusEnumInvalid  ShieldInformationBarrierStatusEnum = "invalid"
)

type ShieldInformationBarrierTypeEnum string

const (
	ShieldInformationBarrierTypeEnumShieldInformationBarrier ShieldInformationBarrierTypeEnum = "shield_information_barrier"
)

// ShieldInformationBarrier
// A standard representation of a
// shield information barrier object
type ShieldInformationBarrier struct {
	CreatedAt  *time.Time                          `json:"created_at,omitempty"`
	CreatedBy  *UserBase                           `json:"created_by,omitempty"`
	EnabledAt  *time.Time                          `json:"enabled_at,omitempty"`
	EnabledBy  *UserBase                           `json:"enabled_by,omitempty"`
	Enterprise *EnterpriseBase                     `json:"enterprise,omitempty"`
	ID         *string                             `json:"id,omitempty"`
	Status     *ShieldInformationBarrierStatusEnum `json:"status,omitempty"`
	Type       *ShieldInformationBarrierTypeEnum   `json:"type,omitempty"`
	UpdatedAt  *time.Time                          `json:"updated_at,omitempty"`
	UpdatedBy  *UserBase                           `json:"updated_by,omitempty"`
}
