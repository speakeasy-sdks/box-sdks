package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetRetentionPoliciesIDAssignmentsPathParams struct {
	RetentionPolicyID string `pathParam:"style=simple,explode=false,name=retention_policy_id"`
}

type GetRetentionPoliciesIDAssignmentsTypeEnum string

const (
	GetRetentionPoliciesIDAssignmentsTypeEnumFolder           GetRetentionPoliciesIDAssignmentsTypeEnum = "folder"
	GetRetentionPoliciesIDAssignmentsTypeEnumEnterprise       GetRetentionPoliciesIDAssignmentsTypeEnum = "enterprise"
	GetRetentionPoliciesIDAssignmentsTypeEnumMetadataTemplate GetRetentionPoliciesIDAssignmentsTypeEnum = "metadata_template"
)

type GetRetentionPoliciesIDAssignmentsQueryParams struct {
	Fields []string                                   `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64                                     `queryParam:"style=form,explode=true,name=limit"`
	Marker *string                                    `queryParam:"style=form,explode=true,name=marker"`
	Type   *GetRetentionPoliciesIDAssignmentsTypeEnum `queryParam:"style=form,explode=true,name=type"`
}

type GetRetentionPoliciesIDAssignmentsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetRetentionPoliciesIDAssignmentsPathParams
	QueryParams GetRetentionPoliciesIDAssignmentsQueryParams
}

type GetRetentionPoliciesIDAssignmentsResponse struct {
	ClientError                *shared.ClientError
	ContentType                string
	RetentionPolicyAssignments *shared.RetentionPolicyAssignments
	StatusCode                 int64
}
