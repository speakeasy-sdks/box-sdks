package shared

import (
	"time"
)

type ShieldInformationBarrierSegmentTypeEnum string

const (
	ShieldInformationBarrierSegmentTypeEnumShieldInformationBarrierSegment ShieldInformationBarrierSegmentTypeEnum = "shield_information_barrier_segment"
)

// ShieldInformationBarrierSegment
// A shield information barrier segment object
type ShieldInformationBarrierSegment struct {
	CreatedAt                *time.Time                               `json:"created_at,omitempty"`
	CreatedBy                *UserBase                                `json:"created_by,omitempty"`
	Description              *string                                  `json:"description,omitempty"`
	ID                       *string                                  `json:"id,omitempty"`
	Name                     *string                                  `json:"name,omitempty"`
	ShieldInformationBarrier *ShieldInformationBarrierBase            `json:"shield_information_barrier,omitempty"`
	Type                     *ShieldInformationBarrierSegmentTypeEnum `json:"type,omitempty"`
	UpdatedAt                *time.Time                               `json:"updated_at,omitempty"`
	UpdatedBy                *UserBase                                `json:"updated_by,omitempty"`
}
