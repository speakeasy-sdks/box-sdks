package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetRetentionPoliciesPolicyTypeEnum string

const (
	GetRetentionPoliciesPolicyTypeEnumFinite     GetRetentionPoliciesPolicyTypeEnum = "finite"
	GetRetentionPoliciesPolicyTypeEnumIndefinite GetRetentionPoliciesPolicyTypeEnum = "indefinite"
)

type GetRetentionPoliciesQueryParams struct {
	CreatedByUserID *string                             `queryParam:"style=form,explode=true,name=created_by_user_id"`
	Fields          []string                            `queryParam:"style=form,explode=false,name=fields"`
	Limit           *int64                              `queryParam:"style=form,explode=true,name=limit"`
	Marker          *string                             `queryParam:"style=form,explode=true,name=marker"`
	PolicyName      *string                             `queryParam:"style=form,explode=true,name=policy_name"`
	PolicyType      *GetRetentionPoliciesPolicyTypeEnum `queryParam:"style=form,explode=true,name=policy_type"`
}

type GetRetentionPoliciesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetRetentionPoliciesQueryParams
}

type GetRetentionPoliciesResponse struct {
	ClientError       *shared.ClientError
	ContentType       string
	RetentionPolicies *shared.RetentionPolicies
	StatusCode        int64
}
