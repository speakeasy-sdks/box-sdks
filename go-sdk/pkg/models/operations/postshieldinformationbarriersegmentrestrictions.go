package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnum string

const (
	PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnumShieldInformationBarrierSegment PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnum = "shield_information_barrier_segment"
)

// PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment
// The `type` and `id` of the restricted
// shield information barrier segment.
type PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment struct {
	ID   *string                                                                              `json:"id,omitempty"`
	Type *PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnum `json:"type,omitempty"`
}

type PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnum string

const (
	PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnumShieldInformationBarrierSegment PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnum = "shield_information_barrier_segment"
)

// PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment
// The `type` and `id` of the requested
// shield information barrier segment.
type PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment struct {
	ID   *string                                                                                            `json:"id,omitempty"`
	Type *PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnum `json:"type,omitempty"`
}

type PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnum string

const (
	PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnumShieldInformationBarrierSegmentRestriction PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnum = "shield_information_barrier_segment_restriction"
)

type PostShieldInformationBarrierSegmentRestrictionsRequestBody struct {
	RestrictedSegment               PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment               `json:"restricted_segment"`
	ShieldInformationBarrier        *shared.ShieldInformationBarrierBase                                                      `json:"shield_information_barrier,omitempty"`
	ShieldInformationBarrierSegment PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment `json:"shield_information_barrier_segment"`
	Type                            PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnum                        `json:"type"`
}

type PostShieldInformationBarrierSegmentRestrictionsRequest struct {
	Retries *utils.RetryConfig
	Request *PostShieldInformationBarrierSegmentRestrictionsRequestBody `request:"mediaType=application/json"`
}

type PostShieldInformationBarrierSegmentRestrictionsResponse struct {
	ClientError                                *shared.ClientError
	ContentType                                string
	ShieldInformationBarrierSegmentRestriction *shared.ShieldInformationBarrierSegmentRestriction
	StatusCode                                 int64
}
