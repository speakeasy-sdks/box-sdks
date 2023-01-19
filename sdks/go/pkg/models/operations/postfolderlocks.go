package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

// PostFolderLocksRequestBodyFolder
// The folder to apply the lock to.
type PostFolderLocksRequestBodyFolder struct {
	ID   string `json:"id"`
	Type string `json:"type"`
}

// PostFolderLocksRequestBodyLockedOperations
// The operations to lock for the folder. If `locked_operations` is
// included in the request, both `move` and `delete` must also be
// included and both set to `true`.
type PostFolderLocksRequestBodyLockedOperations struct {
	Delete bool `json:"delete"`
	Move   bool `json:"move"`
}

type PostFolderLocksRequestBody struct {
	Folder           PostFolderLocksRequestBodyFolder            `json:"folder"`
	LockedOperations *PostFolderLocksRequestBodyLockedOperations `json:"locked_operations,omitempty"`
}

type PostFolderLocksRequest struct {
	Retries *utils.RetryConfig
	Request *PostFolderLocksRequestBody `request:"mediaType=application/json"`
}

type PostFolderLocksResponse struct {
	ClientError *shared.ClientError
	ContentType string
	FolderLock  *shared.FolderLock
	StatusCode  int64
}
