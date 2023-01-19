package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetStoragePolicyAssignmentsResolvedForTypeEnum string

const (
	GetStoragePolicyAssignmentsResolvedForTypeEnumUser       GetStoragePolicyAssignmentsResolvedForTypeEnum = "user"
	GetStoragePolicyAssignmentsResolvedForTypeEnumEnterprise GetStoragePolicyAssignmentsResolvedForTypeEnum = "enterprise"
)

type GetStoragePolicyAssignmentsQueryParams struct {
	Marker          *string                                        `queryParam:"style=form,explode=true,name=marker"`
	ResolvedForID   string                                         `queryParam:"style=form,explode=true,name=resolved_for_id"`
	ResolvedForType GetStoragePolicyAssignmentsResolvedForTypeEnum `queryParam:"style=form,explode=true,name=resolved_for_type"`
}

type GetStoragePolicyAssignmentsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetStoragePolicyAssignmentsQueryParams
}

type GetStoragePolicyAssignmentsResponse struct {
	ClientError              *shared.ClientError
	ContentType              string
	StatusCode               int64
	StoragePolicyAssignments *shared.StoragePolicyAssignments
}
