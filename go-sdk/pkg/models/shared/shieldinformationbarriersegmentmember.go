package shared

import (
	"time"
)

type ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeEnum string

const (
	ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeEnumShieldInformationBarrierSegment ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeEnum = "shield_information_barrier_segment"
)

// ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment
// The `type` and `id` of the requested
// shield information barrier segment.
type ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment struct {
	ID   *string                                                                       `json:"id,omitempty"`
	Type *ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeEnum `json:"type,omitempty"`
}

type ShieldInformationBarrierSegmentMemberTypeEnum string

const (
	ShieldInformationBarrierSegmentMemberTypeEnumShieldInformationBarrierSegmentMember ShieldInformationBarrierSegmentMemberTypeEnum = "shield_information_barrier_segment_member"
)

// ShieldInformationBarrierSegmentMember
// A base representation of a
// shield information barrier segment member object
type ShieldInformationBarrierSegmentMember struct {
	CreatedAt                       *time.Time                                                            `json:"created_at,omitempty"`
	CreatedBy                       *UserBase                                                             `json:"created_by,omitempty"`
	ID                              *string                                                               `json:"id,omitempty"`
	ShieldInformationBarrier        *ShieldInformationBarrierBase                                         `json:"shield_information_barrier,omitempty"`
	ShieldInformationBarrierSegment *ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment `json:"shield_information_barrier_segment,omitempty"`
	Type                            *ShieldInformationBarrierSegmentMemberTypeEnum                        `json:"type,omitempty"`
	UpdatedAt                       *time.Time                                                            `json:"updated_at,omitempty"`
	UpdatedBy                       *UserBase                                                             `json:"updated_by,omitempty"`
	User                            *UserBase                                                             `json:"user,omitempty"`
}
