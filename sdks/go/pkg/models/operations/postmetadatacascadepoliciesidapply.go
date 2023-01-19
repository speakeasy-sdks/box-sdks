package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostMetadataCascadePoliciesIDApplyPathParams struct {
	MetadataCascadePolicyID string `pathParam:"style=simple,explode=false,name=metadata_cascade_policy_id"`
}

type PostMetadataCascadePoliciesIDApplyRequestBodyConflictResolutionEnum string

const (
	PostMetadataCascadePoliciesIDApplyRequestBodyConflictResolutionEnumNone      PostMetadataCascadePoliciesIDApplyRequestBodyConflictResolutionEnum = "none"
	PostMetadataCascadePoliciesIDApplyRequestBodyConflictResolutionEnumOverwrite PostMetadataCascadePoliciesIDApplyRequestBodyConflictResolutionEnum = "overwrite"
)

type PostMetadataCascadePoliciesIDApplyRequestBody struct {
	ConflictResolution PostMetadataCascadePoliciesIDApplyRequestBodyConflictResolutionEnum `json:"conflict_resolution"`
}

type PostMetadataCascadePoliciesIDApplyRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostMetadataCascadePoliciesIDApplyPathParams
	Request    *PostMetadataCascadePoliciesIDApplyRequestBody `request:"mediaType=application/json"`
}

type PostMetadataCascadePoliciesIDApplyResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
