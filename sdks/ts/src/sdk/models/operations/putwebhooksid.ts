import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutWebhooksIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=webhook_id" })
  webhookId: string;
}

export enum PutWebhooksIdRequestBodyTargetTypeEnum {
    File = "file",
    Folder = "folder"
}


// PutWebhooksIdRequestBodyTarget
/** 
 * The item that will trigger the webhook
**/
export class PutWebhooksIdRequestBodyTarget extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PutWebhooksIdRequestBodyTargetTypeEnum;
}

export enum PutWebhooksIdRequestBodyWebhookTriggerEnum {
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


export class PutWebhooksIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=address" })
  address?: string;

  @SpeakeasyMetadata({ data: "json, name=target" })
  target?: PutWebhooksIdRequestBodyTarget;

  @SpeakeasyMetadata({ data: "json, name=triggers" })
  triggers?: PutWebhooksIdRequestBodyWebhookTriggerEnum[];
}


export class PutWebhooksIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutWebhooksIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutWebhooksIdRequestBody;
}


export class PutWebhooksIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  webhook?: shared.Webhook;
}
