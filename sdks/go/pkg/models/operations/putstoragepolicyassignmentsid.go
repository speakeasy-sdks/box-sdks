package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutStoragePolicyAssignmentsIDPathParams struct {
	StoragePolicyAssignmentID string `pathParam:"style=simple,explode=false,name=storage_policy_assignment_id"`
}

type PutStoragePolicyAssignmentsIDRequestBodyStoragePolicyTypeEnum string

const (
	PutStoragePolicyAssignmentsIDRequestBodyStoragePolicyTypeEnumStoragePolicy PutStoragePolicyAssignmentsIDRequestBodyStoragePolicyTypeEnum = "storage_policy"
)

// PutStoragePolicyAssignmentsIDRequestBodyStoragePolicy
// The storage policy to assign to the user or
// enterprise
type PutStoragePolicyAssignmentsIDRequestBodyStoragePolicy struct {
	ID   string                                                        `json:"id"`
	Type PutStoragePolicyAssignmentsIDRequestBodyStoragePolicyTypeEnum `json:"type"`
}

type PutStoragePolicyAssignmentsIDRequestBody struct {
	StoragePolicy PutStoragePolicyAssignmentsIDRequestBodyStoragePolicy `json:"storage_policy"`
}

type PutStoragePolicyAssignmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutStoragePolicyAssignmentsIDPathParams
	Request    *PutStoragePolicyAssignmentsIDRequestBody `request:"mediaType=application/json"`
}

type PutStoragePolicyAssignmentsIDResponse struct {
	ClientError             *shared.ClientError
	ContentType             string
	StatusCode              int64
	StoragePolicyAssignment *shared.StoragePolicyAssignment
}
