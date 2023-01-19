package shared

import (
	"time"
)

type ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnum string

const (
	ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnumShieldInformationBarrierSegment ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnum = "shield_information_barrier_segment"
)

// ShieldInformationBarrierSegmentRestrictionRestrictedSegment
// The `type` and `id` of the
// restricted shield information barrier segment.
type ShieldInformationBarrierSegmentRestrictionRestrictedSegment struct {
	ID   *string                                                              `json:"id,omitempty"`
	Type *ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnum `json:"type,omitempty"`
}

type ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnum string

const (
	ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnumShieldInformationBarrierSegment ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnum = "shield_information_barrier_segment"
)

// ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment
// The `type` and `id` of the
// requested shield information barrier segment.
type ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment struct {
	ID   *string                                                                            `json:"id,omitempty"`
	Type *ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnum `json:"type,omitempty"`
}

type ShieldInformationBarrierSegmentRestrictionTypeEnum string

const (
	ShieldInformationBarrierSegmentRestrictionTypeEnumShieldInformationBarrierSegmentRestriction ShieldInformationBarrierSegmentRestrictionTypeEnum = "shield_information_barrier_segment_restriction"
)

// ShieldInformationBarrierSegmentRestriction
// A base representation of
// a segment restriction object for
// the shield information barrier
type ShieldInformationBarrierSegmentRestriction struct {
	CreatedAt                       *time.Time                                                                `json:"created_at,omitempty"`
	CreatedBy                       *UserBase                                                                 `json:"created_by,omitempty"`
	ID                              *string                                                                   `json:"id,omitempty"`
	RestrictedSegment               ShieldInformationBarrierSegmentRestrictionRestrictedSegment               `json:"restricted_segment"`
	ShieldInformationBarrier        *ShieldInformationBarrierBase                                             `json:"shield_information_barrier,omitempty"`
	ShieldInformationBarrierSegment ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment `json:"shield_information_barrier_segment"`
	Type                            *ShieldInformationBarrierSegmentRestrictionTypeEnum                       `json:"type,omitempty"`
	UpdatedAt                       *time.Time                                                                `json:"updated_at,omitempty"`
	UpdatedBy                       *UserBase                                                                 `json:"updated_by,omitempty"`
}
