package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnum string

const (
	PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnumShieldInformationBarrierSegment PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnum = "shield_information_barrier_segment"
)

// PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment
// The `type` and `id` of the
// requested shield information barrier segment.
type PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment struct {
	ID   *string                                                                                       `json:"id,omitempty"`
	Type *PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnum `json:"type,omitempty"`
}

type PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnum string

const (
	PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnumShieldInformationBarrierSegmentMember PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnum = "shield_information_barrier_segment_member"
)

type PostShieldInformationBarrierSegmentMembersRequestBody struct {
	ShieldInformationBarrier        *shared.ShieldInformationBarrierBase                                                 `json:"shield_information_barrier,omitempty"`
	ShieldInformationBarrierSegment PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment `json:"shield_information_barrier_segment"`
	Type                            *PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnum                       `json:"type,omitempty"`
	User                            shared.UserBase                                                                      `json:"user"`
}

type PostShieldInformationBarrierSegmentMembersRequest struct {
	Retries *utils.RetryConfig
	Request *PostShieldInformationBarrierSegmentMembersRequestBody `request:"mediaType=application/json"`
}

type PostShieldInformationBarrierSegmentMembersResponse struct {
	ClientError                           *shared.ClientError
	ContentType                           string
	ShieldInformationBarrierSegmentMember *shared.ShieldInformationBarrierSegmentMember
	StatusCode                            int64
}
