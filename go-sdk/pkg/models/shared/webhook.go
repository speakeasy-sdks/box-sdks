package shared

import (
	"time"
)

type WebhookTargetTypeEnum string

const (
	WebhookTargetTypeEnumFile   WebhookTargetTypeEnum = "file"
	WebhookTargetTypeEnumFolder WebhookTargetTypeEnum = "folder"
)

// WebhookTarget
// The item that will trigger the webhook
type WebhookTarget struct {
	ID   *string                `json:"id,omitempty"`
	Type *WebhookTargetTypeEnum `json:"type,omitempty"`
}

type WebhookWebhookTriggerEnum string

const (
	WebhookWebhookTriggerEnumFileUploaded            WebhookWebhookTriggerEnum = "FILE.UPLOADED"
	WebhookWebhookTriggerEnumFilePreviewed           WebhookWebhookTriggerEnum = "FILE.PREVIEWED"
	WebhookWebhookTriggerEnumFileDownloaded          WebhookWebhookTriggerEnum = "FILE.DOWNLOADED"
	WebhookWebhookTriggerEnumFileTrashed             WebhookWebhookTriggerEnum = "FILE.TRASHED"
	WebhookWebhookTriggerEnumFileDeleted             WebhookWebhookTriggerEnum = "FILE.DELETED"
	WebhookWebhookTriggerEnumFileRestored            WebhookWebhookTriggerEnum = "FILE.RESTORED"
	WebhookWebhookTriggerEnumFileCopied              WebhookWebhookTriggerEnum = "FILE.COPIED"
	WebhookWebhookTriggerEnumFileMoved               WebhookWebhookTriggerEnum = "FILE.MOVED"
	WebhookWebhookTriggerEnumFileLocked              WebhookWebhookTriggerEnum = "FILE.LOCKED"
	WebhookWebhookTriggerEnumFileUnlocked            WebhookWebhookTriggerEnum = "FILE.UNLOCKED"
	WebhookWebhookTriggerEnumFileRenamed             WebhookWebhookTriggerEnum = "FILE.RENAMED"
	WebhookWebhookTriggerEnumCommentCreated          WebhookWebhookTriggerEnum = "COMMENT.CREATED"
	WebhookWebhookTriggerEnumCommentUpdated          WebhookWebhookTriggerEnum = "COMMENT.UPDATED"
	WebhookWebhookTriggerEnumCommentDeleted          WebhookWebhookTriggerEnum = "COMMENT.DELETED"
	WebhookWebhookTriggerEnumTaskAssignmentCreated   WebhookWebhookTriggerEnum = "TASK_ASSIGNMENT.CREATED"
	WebhookWebhookTriggerEnumTaskAssignmentUpdated   WebhookWebhookTriggerEnum = "TASK_ASSIGNMENT.UPDATED"
	WebhookWebhookTriggerEnumMetadataInstanceCreated WebhookWebhookTriggerEnum = "METADATA_INSTANCE.CREATED"
	WebhookWebhookTriggerEnumMetadataInstanceUpdated WebhookWebhookTriggerEnum = "METADATA_INSTANCE.UPDATED"
	WebhookWebhookTriggerEnumMetadataInstanceDeleted WebhookWebhookTriggerEnum = "METADATA_INSTANCE.DELETED"
	WebhookWebhookTriggerEnumFolderCreated           WebhookWebhookTriggerEnum = "FOLDER.CREATED"
	WebhookWebhookTriggerEnumFolderRenamed           WebhookWebhookTriggerEnum = "FOLDER.RENAMED"
	WebhookWebhookTriggerEnumFolderDownloaded        WebhookWebhookTriggerEnum = "FOLDER.DOWNLOADED"
	WebhookWebhookTriggerEnumFolderRestored          WebhookWebhookTriggerEnum = "FOLDER.RESTORED"
	WebhookWebhookTriggerEnumFolderDeleted           WebhookWebhookTriggerEnum = "FOLDER.DELETED"
	WebhookWebhookTriggerEnumFolderCopied            WebhookWebhookTriggerEnum = "FOLDER.COPIED"
	WebhookWebhookTriggerEnumFolderMoved             WebhookWebhookTriggerEnum = "FOLDER.MOVED"
	WebhookWebhookTriggerEnumFolderTrashed           WebhookWebhookTriggerEnum = "FOLDER.TRASHED"
	WebhookWebhookTriggerEnumWebhookDeleted          WebhookWebhookTriggerEnum = "WEBHOOK.DELETED"
	WebhookWebhookTriggerEnumCollaborationCreated    WebhookWebhookTriggerEnum = "COLLABORATION.CREATED"
	WebhookWebhookTriggerEnumCollaborationAccepted   WebhookWebhookTriggerEnum = "COLLABORATION.ACCEPTED"
	WebhookWebhookTriggerEnumCollaborationRejected   WebhookWebhookTriggerEnum = "COLLABORATION.REJECTED"
	WebhookWebhookTriggerEnumCollaborationRemoved    WebhookWebhookTriggerEnum = "COLLABORATION.REMOVED"
	WebhookWebhookTriggerEnumCollaborationUpdated    WebhookWebhookTriggerEnum = "COLLABORATION.UPDATED"
	WebhookWebhookTriggerEnumSharedLinkDeleted       WebhookWebhookTriggerEnum = "SHARED_LINK.DELETED"
	WebhookWebhookTriggerEnumSharedLinkCreated       WebhookWebhookTriggerEnum = "SHARED_LINK.CREATED"
	WebhookWebhookTriggerEnumSharedLinkUpdated       WebhookWebhookTriggerEnum = "SHARED_LINK.UPDATED"
	WebhookWebhookTriggerEnumSignRequestCompleted    WebhookWebhookTriggerEnum = "SIGN_REQUEST.COMPLETED"
	WebhookWebhookTriggerEnumSignRequestDeclined     WebhookWebhookTriggerEnum = "SIGN_REQUEST.DECLINED"
	WebhookWebhookTriggerEnumSignRequestExpired      WebhookWebhookTriggerEnum = "SIGN_REQUEST.EXPIRED"
)

type WebhookTypeEnum string

const (
	WebhookTypeEnumWebhook WebhookTypeEnum = "webhook"
)

// Webhook
// Represents a configured webhook.
type Webhook struct {
	Address   *string                     `json:"address,omitempty"`
	CreatedAt *time.Time                  `json:"created_at,omitempty"`
	CreatedBy *UserMini                   `json:"created_by,omitempty"`
	ID        *string                     `json:"id,omitempty"`
	Target    *WebhookTarget              `json:"target,omitempty"`
	Triggers  []WebhookWebhookTriggerEnum `json:"triggers,omitempty"`
	Type      *WebhookTypeEnum            `json:"type,omitempty"`
}
