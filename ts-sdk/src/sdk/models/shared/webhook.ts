import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";


export enum WebhookTargetTypeEnum {
    File = "file",
    Folder = "folder"
}


// WebhookTarget
/** 
 * The item that will trigger the webhook
**/
export class WebhookTarget extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WebhookTargetTypeEnum;
}

export enum WebhookWebhookTriggerEnum {
    FileUploaded = "FILE.UPLOADED",
    FilePreviewed = "FILE.PREVIEWED",
    FileDownloaded = "FILE.DOWNLOADED",
    FileTrashed = "FILE.TRASHED",
    FileDeleted = "FILE.DELETED",
    FileRestored = "FILE.RESTORED",
    FileCopied = "FILE.COPIED",
    FileMoved = "FILE.MOVED",
    FileLocked = "FILE.LOCKED",
    FileUnlocked = "FILE.UNLOCKED",
    FileRenamed = "FILE.RENAMED",
    CommentCreated = "COMMENT.CREATED",
    CommentUpdated = "COMMENT.UPDATED",
    CommentDeleted = "COMMENT.DELETED",
    TaskAssignmentCreated = "TASK_ASSIGNMENT.CREATED",
    TaskAssignmentUpdated = "TASK_ASSIGNMENT.UPDATED",
    MetadataInstanceCreated = "METADATA_INSTANCE.CREATED",
    MetadataInstanceUpdated = "METADATA_INSTANCE.UPDATED",
    MetadataInstanceDeleted = "METADATA_INSTANCE.DELETED",
    FolderCreated = "FOLDER.CREATED",
    FolderRenamed = "FOLDER.RENAMED",
    FolderDownloaded = "FOLDER.DOWNLOADED",
    FolderRestored = "FOLDER.RESTORED",
    FolderDeleted = "FOLDER.DELETED",
    FolderCopied = "FOLDER.COPIED",
    FolderMoved = "FOLDER.MOVED",
    FolderTrashed = "FOLDER.TRASHED",
    WebhookDeleted = "WEBHOOK.DELETED",
    CollaborationCreated = "COLLABORATION.CREATED",
    CollaborationAccepted = "COLLABORATION.ACCEPTED",
    CollaborationRejected = "COLLABORATION.REJECTED",
    CollaborationRemoved = "COLLABORATION.REMOVED",
    CollaborationUpdated = "COLLABORATION.UPDATED",
    SharedLinkDeleted = "SHARED_LINK.DELETED",
    SharedLinkCreated = "SHARED_LINK.CREATED",
    SharedLinkUpdated = "SHARED_LINK.UPDATED",
    SignRequestCompleted = "SIGN_REQUEST.COMPLETED",
    SignRequestDeclined = "SIGN_REQUEST.DECLINED",
    SignRequestExpired = "SIGN_REQUEST.EXPIRED"
}

export enum WebhookTypeEnum {
    Webhook = "webhook"
}


// Webhook
/** 
 * Represents a configured webhook.
**/
export class Webhook extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=address" })
  address?: string;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=target" })
  target?: WebhookTarget;

  @SpeakeasyMetadata({ data: "json, name=triggers" })
  triggers?: WebhookWebhookTriggerEnum[];

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WebhookTypeEnum;
}
