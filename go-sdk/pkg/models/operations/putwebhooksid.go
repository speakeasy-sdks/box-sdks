package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutWebhooksIDPathParams struct {
	WebhookID string `pathParam:"style=simple,explode=false,name=webhook_id"`
}

type PutWebhooksIDRequestBodyTargetTypeEnum string

const (
	PutWebhooksIDRequestBodyTargetTypeEnumFile   PutWebhooksIDRequestBodyTargetTypeEnum = "file"
	PutWebhooksIDRequestBodyTargetTypeEnumFolder PutWebhooksIDRequestBodyTargetTypeEnum = "folder"
)

// PutWebhooksIDRequestBodyTarget
// The item that will trigger the webhook
type PutWebhooksIDRequestBodyTarget struct {
	ID   *string                                 `json:"id,omitempty"`
	Type *PutWebhooksIDRequestBodyTargetTypeEnum `json:"type,omitempty"`
}

type PutWebhooksIDRequestBodyWebhookTriggerEnum string

const (
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileUploaded            PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.UPLOADED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFilePreviewed           PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.PREVIEWED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileDownloaded          PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.DOWNLOADED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileTrashed             PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.TRASHED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileDeleted             PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.DELETED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileRestored            PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.RESTORED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileCopied              PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.COPIED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileMoved               PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.MOVED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileLocked              PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.LOCKED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileUnlocked            PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.UNLOCKED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFileRenamed             PutWebhooksIDRequestBodyWebhookTriggerEnum = "FILE.RENAMED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumCommentCreated          PutWebhooksIDRequestBodyWebhookTriggerEnum = "COMMENT.CREATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumCommentUpdated          PutWebhooksIDRequestBodyWebhookTriggerEnum = "COMMENT.UPDATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumCommentDeleted          PutWebhooksIDRequestBodyWebhookTriggerEnum = "COMMENT.DELETED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumTaskAssignmentCreated   PutWebhooksIDRequestBodyWebhookTriggerEnum = "TASK_ASSIGNMENT.CREATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumTaskAssignmentUpdated   PutWebhooksIDRequestBodyWebhookTriggerEnum = "TASK_ASSIGNMENT.UPDATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumMetadataInstanceCreated PutWebhooksIDRequestBodyWebhookTriggerEnum = "METADATA_INSTANCE.CREATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumMetadataInstanceUpdated PutWebhooksIDRequestBodyWebhookTriggerEnum = "METADATA_INSTANCE.UPDATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumMetadataInstanceDeleted PutWebhooksIDRequestBodyWebhookTriggerEnum = "METADATA_INSTANCE.DELETED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFolderCreated           PutWebhooksIDRequestBodyWebhookTriggerEnum = "FOLDER.CREATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFolderRenamed           PutWebhooksIDRequestBodyWebhookTriggerEnum = "FOLDER.RENAMED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFolderDownloaded        PutWebhooksIDRequestBodyWebhookTriggerEnum = "FOLDER.DOWNLOADED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFolderRestored          PutWebhooksIDRequestBodyWebhookTriggerEnum = "FOLDER.RESTORED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFolderDeleted           PutWebhooksIDRequestBodyWebhookTriggerEnum = "FOLDER.DELETED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFolderCopied            PutWebhooksIDRequestBodyWebhookTriggerEnum = "FOLDER.COPIED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFolderMoved             PutWebhooksIDRequestBodyWebhookTriggerEnum = "FOLDER.MOVED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumFolderTrashed           PutWebhooksIDRequestBodyWebhookTriggerEnum = "FOLDER.TRASHED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumWebhookDeleted          PutWebhooksIDRequestBodyWebhookTriggerEnum = "WEBHOOK.DELETED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumCollaborationCreated    PutWebhooksIDRequestBodyWebhookTriggerEnum = "COLLABORATION.CREATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumCollaborationAccepted   PutWebhooksIDRequestBodyWebhookTriggerEnum = "COLLABORATION.ACCEPTED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumCollaborationRejected   PutWebhooksIDRequestBodyWebhookTriggerEnum = "COLLABORATION.REJECTED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumCollaborationRemoved    PutWebhooksIDRequestBodyWebhookTriggerEnum = "COLLABORATION.REMOVED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumCollaborationUpdated    PutWebhooksIDRequestBodyWebhookTriggerEnum = "COLLABORATION.UPDATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumSharedLinkDeleted       PutWebhooksIDRequestBodyWebhookTriggerEnum = "SHARED_LINK.DELETED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumSharedLinkCreated       PutWebhooksIDRequestBodyWebhookTriggerEnum = "SHARED_LINK.CREATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumSharedLinkUpdated       PutWebhooksIDRequestBodyWebhookTriggerEnum = "SHARED_LINK.UPDATED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumSignRequestCompleted    PutWebhooksIDRequestBodyWebhookTriggerEnum = "SIGN_REQUEST.COMPLETED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumSignRequestDeclined     PutWebhooksIDRequestBodyWebhookTriggerEnum = "SIGN_REQUEST.DECLINED"
	PutWebhooksIDRequestBodyWebhookTriggerEnumSignRequestExpired      PutWebhooksIDRequestBodyWebhookTriggerEnum = "SIGN_REQUEST.EXPIRED"
)

type PutWebhooksIDRequestBody struct {
	Address  *string                                      `json:"address,omitempty"`
	Target   *PutWebhooksIDRequestBodyTarget              `json:"target,omitempty"`
	Triggers []PutWebhooksIDRequestBodyWebhookTriggerEnum `json:"triggers,omitempty"`
}

type PutWebhooksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutWebhooksIDPathParams
	Request    *PutWebhooksIDRequestBody `request:"mediaType=application/json"`
}

type PutWebhooksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Webhook     *shared.Webhook
}
