package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutCollaborationsIDPathParams struct {
	CollaborationID string `pathParam:"style=simple,explode=false,name=collaboration_id"`
}

type PutCollaborationsIDRequestBodyRoleEnum string

const (
	PutCollaborationsIDRequestBodyRoleEnumEditor            PutCollaborationsIDRequestBodyRoleEnum = "editor"
	PutCollaborationsIDRequestBodyRoleEnumViewer            PutCollaborationsIDRequestBodyRoleEnum = "viewer"
	PutCollaborationsIDRequestBodyRoleEnumPreviewer         PutCollaborationsIDRequestBodyRoleEnum = "previewer"
	PutCollaborationsIDRequestBodyRoleEnumUploader          PutCollaborationsIDRequestBodyRoleEnum = "uploader"
	PutCollaborationsIDRequestBodyRoleEnumPreviewerUploader PutCollaborationsIDRequestBodyRoleEnum = "previewer uploader"
	PutCollaborationsIDRequestBodyRoleEnumViewerUploader    PutCollaborationsIDRequestBodyRoleEnum = "viewer uploader"
	PutCollaborationsIDRequestBodyRoleEnumCoOwner           PutCollaborationsIDRequestBodyRoleEnum = "co-owner"
	PutCollaborationsIDRequestBodyRoleEnumOwner             PutCollaborationsIDRequestBodyRoleEnum = "owner"
)

type PutCollaborationsIDRequestBodyStatusEnum string

const (
	PutCollaborationsIDRequestBodyStatusEnumPending  PutCollaborationsIDRequestBodyStatusEnum = "pending"
	PutCollaborationsIDRequestBodyStatusEnumAccepted PutCollaborationsIDRequestBodyStatusEnum = "accepted"
	PutCollaborationsIDRequestBodyStatusEnumRejected PutCollaborationsIDRequestBodyStatusEnum = "rejected"
)

type PutCollaborationsIDRequestBody struct {
	CanViewPath *bool                                     `json:"can_view_path,omitempty"`
	ExpiresAt   *time.Time                                `json:"expires_at,omitempty"`
	Role        PutCollaborationsIDRequestBodyRoleEnum    `json:"role"`
	Status      *PutCollaborationsIDRequestBodyStatusEnum `json:"status,omitempty"`
}

type PutCollaborationsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutCollaborationsIDPathParams
	Request    *PutCollaborationsIDRequestBody `request:"mediaType=application/json"`
}

type PutCollaborationsIDResponse struct {
	ClientError   *shared.ClientError
	Collaboration *shared.Collaboration
	ContentType   string
	StatusCode    int64
}
