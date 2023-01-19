package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostWebhooksRequestBodyTargetTypeEnum string

const (
	PostWebhooksRequestBodyTargetTypeEnumFile   PostWebhooksRequestBodyTargetTypeEnum = "file"
	PostWebhooksRequestBodyTargetTypeEnumFolder PostWebhooksRequestBodyTargetTypeEnum = "folder"
)

// PostWebhooksRequestBodyTarget
// The item that will trigger the webhook
type PostWebhooksRequestBodyTarget struct {
	ID   *string                                `json:"id,omitempty"`
	Type *PostWebhooksRequestBodyTargetTypeEnum `json:"type,omitempty"`
}

type PostWebhooksRequestBodyWebhookTriggerEnum string

const (
	PostWebhooksRequestBodyWebhookTriggerEnumFileUploaded            PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.UPLOADED"
	PostWebhooksRequestBodyWebhookTriggerEnumFilePreviewed           PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.PREVIEWED"
	PostWebhooksRequestBodyWebhookTriggerEnumFileDownloaded          PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.DOWNLOADED"
	PostWebhooksRequestBodyWebhookTriggerEnumFileTrashed             PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.TRASHED"
	PostWebhooksRequestBodyWebhookTriggerEnumFileDeleted             PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.DELETED"
	PostWebhooksRequestBodyWebhookTriggerEnumFileRestored            PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.RESTORED"
	PostWebhooksRequestBodyWebhookTriggerEnumFileCopied              PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.COPIED"
	PostWebhooksRequestBodyWebhookTriggerEnumFileMoved               PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.MOVED"
	PostWebhooksRequestBodyWebhookTriggerEnumFileLocked              PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.LOCKED"
	PostWebhooksRequestBodyWebhookTriggerEnumFileUnlocked            PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.UNLOCKED"
	PostWebhooksRequestBodyWebhookTriggerEnumFileRenamed             PostWebhooksRequestBodyWebhookTriggerEnum = "FILE.RENAMED"
	PostWebhooksRequestBodyWebhookTriggerEnumCommentCreated          PostWebhooksRequestBodyWebhookTriggerEnum = "COMMENT.CREATED"
	PostWebhooksRequestBodyWebhookTriggerEnumCommentUpdated          PostWebhooksRequestBodyWebhookTriggerEnum = "COMMENT.UPDATED"
	PostWebhooksRequestBodyWebhookTriggerEnumCommentDeleted          PostWebhooksRequestBodyWebhookTriggerEnum = "COMMENT.DELETED"
	PostWebhooksRequestBodyWebhookTriggerEnumTaskAssignmentCreated   PostWebhooksRequestBodyWebhookTriggerEnum = "TASK_ASSIGNMENT.CREATED"
	PostWebhooksRequestBodyWebhookTriggerEnumTaskAssignmentUpdated   PostWebhooksRequestBodyWebhookTriggerEnum = "TASK_ASSIGNMENT.UPDATED"
	PostWebhooksRequestBodyWebhookTriggerEnumMetadataInstanceCreated PostWebhooksRequestBodyWebhookTriggerEnum = "METADATA_INSTANCE.CREATED"
	PostWebhooksRequestBodyWebhookTriggerEnumMetadataInstanceUpdated PostWebhooksRequestBodyWebhookTriggerEnum = "METADATA_INSTANCE.UPDATED"
	PostWebhooksRequestBodyWebhookTriggerEnumMetadataInstanceDeleted PostWebhooksRequestBodyWebhookTriggerEnum = "METADATA_INSTANCE.DELETED"
	PostWebhooksRequestBodyWebhookTriggerEnumFolderCreated           PostWebhooksRequestBodyWebhookTriggerEnum = "FOLDER.CREATED"
	PostWebhooksRequestBodyWebhookTriggerEnumFolderRenamed           PostWebhooksRequestBodyWebhookTriggerEnum = "FOLDER.RENAMED"
	PostWebhooksRequestBodyWebhookTriggerEnumFolderDownloaded        PostWebhooksRequestBodyWebhookTriggerEnum = "FOLDER.DOWNLOADED"
	PostWebhooksRequestBodyWebhookTriggerEnumFolderRestored          PostWebhooksRequestBodyWebhookTriggerEnum = "FOLDER.RESTORED"
	PostWebhooksRequestBodyWebhookTriggerEnumFolderDeleted           PostWebhooksRequestBodyWebhookTriggerEnum = "FOLDER.DELETED"
	PostWebhooksRequestBodyWebhookTriggerEnumFolderCopied            PostWebhooksRequestBodyWebhookTriggerEnum = "FOLDER.COPIED"
	PostWebhooksRequestBodyWebhookTriggerEnumFolderMoved             PostWebhooksRequestBodyWebhookTriggerEnum = "FOLDER.MOVED"
	PostWebhooksRequestBodyWebhookTriggerEnumFolderTrashed           PostWebhooksRequestBodyWebhookTriggerEnum = "FOLDER.TRASHED"
	PostWebhooksRequestBodyWebhookTriggerEnumWebhookDeleted          PostWebhooksRequestBodyWebhookTriggerEnum = "WEBHOOK.DELETED"
	PostWebhooksRequestBodyWebhookTriggerEnumCollaborationCreated    PostWebhooksRequestBodyWebhookTriggerEnum = "COLLABORATION.CREATED"
	PostWebhooksRequestBodyWebhookTriggerEnumCollaborationAccepted   PostWebhooksRequestBodyWebhookTriggerEnum = "COLLABORATION.ACCEPTED"
	PostWebhooksRequestBodyWebhookTriggerEnumCollaborationRejected   PostWebhooksRequestBodyWebhookTriggerEnum = "COLLABORATION.REJECTED"
	PostWebhooksRequestBodyWebhookTriggerEnumCollaborationRemoved    PostWebhooksRequestBodyWebhookTriggerEnum = "COLLABORATION.REMOVED"
	PostWebhooksRequestBodyWebhookTriggerEnumCollaborationUpdated    PostWebhooksRequestBodyWebhookTriggerEnum = "COLLABORATION.UPDATED"
	PostWebhooksRequestBodyWebhookTriggerEnumSharedLinkDeleted       PostWebhooksRequestBodyWebhookTriggerEnum = "SHARED_LINK.DELETED"
	PostWebhooksRequestBodyWebhookTriggerEnumSharedLinkCreated       PostWebhooksRequestBodyWebhookTriggerEnum = "SHARED_LINK.CREATED"
	PostWebhooksRequestBodyWebhookTriggerEnumSharedLinkUpdated       PostWebhooksRequestBodyWebhookTriggerEnum = "SHARED_LINK.UPDATED"
	PostWebhooksRequestBodyWebhookTriggerEnumSignRequestCompleted    PostWebhooksRequestBodyWebhookTriggerEnum = "SIGN_REQUEST.COMPLETED"
	PostWebhooksRequestBodyWebhookTriggerEnumSignRequestDeclined     PostWebhooksRequestBodyWebhookTriggerEnum = "SIGN_REQUEST.DECLINED"
	PostWebhooksRequestBodyWebhookTriggerEnumSignRequestExpired      PostWebhooksRequestBodyWebhookTriggerEnum = "SIGN_REQUEST.EXPIRED"
)

type PostWebhooksRequestBody struct {
	Address  string                                      `json:"address"`
	Target   PostWebhooksRequestBodyTarget               `json:"target"`
	Triggers []PostWebhooksRequestBodyWebhookTriggerEnum `json:"triggers"`
}

type PostWebhooksRequest struct {
	Retries *utils.RetryConfig
	Request *PostWebhooksRequestBody `request:"mediaType=application/json"`
}

type PostWebhooksResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Webhook     *shared.Webhook
}
