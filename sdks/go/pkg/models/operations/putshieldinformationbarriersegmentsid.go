package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutShieldInformationBarrierSegmentsIDPathParams struct {
	ShieldInformationBarrierSegmentID string `pathParam:"style=simple,explode=false,name=shield_information_barrier_segment_id"`
}

// PutShieldInformationBarrierSegmentsIDRequestBody
// An object containing update(s) to be made on the Shield
// Information Barrier Segment. Possible properties include
// 'name' and 'description', the value in object is the update.
type PutShieldInformationBarrierSegmentsIDRequestBody struct {
	Description *string `json:"description,omitempty"`
	Name        *string `json:"name,omitempty"`
}

type PutShieldInformationBarrierSegmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutShieldInformationBarrierSegmentsIDPathParams
	Request    *PutShieldInformationBarrierSegmentsIDRequestBody `request:"mediaType=application/json"`
}

type PutShieldInformationBarrierSegmentsIDResponse struct {
	ClientError                     *shared.ClientError
	ContentType                     string
	ShieldInformationBarrierSegment *shared.ShieldInformationBarrierSegment
	StatusCode                      int64
}
