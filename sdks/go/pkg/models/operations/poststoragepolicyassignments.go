package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum string

const (
	PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnumUser       PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum = "user"
	PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnumEnterprise PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum = "enterprise"
)

// PostStoragePolicyAssignmentsRequestBodyAssignedTo
// The user or enterprise to assign the storage
// policy to.
type PostStoragePolicyAssignmentsRequestBodyAssignedTo struct {
	ID   string                                                    `json:"id"`
	Type PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum `json:"type"`
}

type PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnum string

const (
	PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnumStoragePolicy PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnum = "storage_policy"
)

// PostStoragePolicyAssignmentsRequestBodyStoragePolicy
// The storage policy to assign to the user or
// enterprise
type PostStoragePolicyAssignmentsRequestBodyStoragePolicy struct {
	ID   string                                                       `json:"id"`
	Type PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnum `json:"type"`
}

type PostStoragePolicyAssignmentsRequestBody struct {
	AssignedTo    PostStoragePolicyAssignmentsRequestBodyAssignedTo    `json:"assigned_to"`
	StoragePolicy PostStoragePolicyAssignmentsRequestBodyStoragePolicy `json:"storage_policy"`
}

type PostStoragePolicyAssignmentsRequest struct {
	Retries *utils.RetryConfig
	Request *PostStoragePolicyAssignmentsRequestBody `request:"mediaType=application/json"`
}

type PostStoragePolicyAssignmentsResponse struct {
	ClientError             *shared.ClientError
	ContentType             string
	StatusCode              int64
	StoragePolicyAssignment *shared.StoragePolicyAssignment
}
