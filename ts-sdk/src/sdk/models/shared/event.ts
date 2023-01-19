import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";
import { User } from "./user";
import { EventSource } from "./eventsource";
import { File } from "./file";
import { Folder } from "./folder";


export enum EventEventTypeEnum {
    AccessGranted = "ACCESS_GRANTED",
    AccessRevoked = "ACCESS_REVOKED",
    AddDeviceAssociation = "ADD_DEVICE_ASSOCIATION",
    AddLoginActivityDevice = "ADD_LOGIN_ACTIVITY_DEVICE",
    AdminLogin = "ADMIN_LOGIN",
    ApplicationCreated = "APPLICATION_CREATED",
    ApplicationPublicKeyAdded = "APPLICATION_PUBLIC_KEY_ADDED",
    ApplicationPublicKeyDeleted = "APPLICATION_PUBLIC_KEY_DELETED",
    ChangeAdminRole = "CHANGE_ADMIN_ROLE",
    ChangeFolderPermission = "CHANGE_FOLDER_PERMISSION",
    CollaborationAccept = "COLLABORATION_ACCEPT",
    CollaborationExpiration = "COLLABORATION_EXPIRATION",
    CollaborationInvite = "COLLABORATION_INVITE",
    CollaborationRemove = "COLLABORATION_REMOVE",
    CollaborationRoleChange = "COLLABORATION_ROLE_CHANGE",
    CollabAddCollaborator = "COLLAB_ADD_COLLABORATOR",
    CollabInviteCollaborator = "COLLAB_INVITE_COLLABORATOR",
    CollabRemoveCollaborator = "COLLAB_REMOVE_COLLABORATOR",
    CollabRoleChange = "COLLAB_ROLE_CHANGE",
    CommentCreate = "COMMENT_CREATE",
    CommentDelete = "COMMENT_DELETE",
    ContentAccess = "CONTENT_ACCESS",
    ContentWorkflowAbnormalDownloadActivity = "CONTENT_WORKFLOW_ABNORMAL_DOWNLOAD_ACTIVITY",
    ContentWorkflowAutomationAdd = "CONTENT_WORKFLOW_AUTOMATION_ADD",
    ContentWorkflowAutomationDelete = "CONTENT_WORKFLOW_AUTOMATION_DELETE",
    ContentWorkflowPolicyAdd = "CONTENT_WORKFLOW_POLICY_ADD",
    ContentWorkflowSharingPolicyViolation = "CONTENT_WORKFLOW_SHARING_POLICY_VIOLATION",
    ContentWorkflowUploadPolicyViolation = "CONTENT_WORKFLOW_UPLOAD_POLICY_VIOLATION",
    Copy = "COPY",
    DataRetentionCreateRetention = "DATA_RETENTION_CREATE_RETENTION",
    DataRetentionRemoveRetention = "DATA_RETENTION_REMOVE_RETENTION",
    Delete = "DELETE",
    DeleteUser = "DELETE_USER",
    DeviceTrustCheckFailed = "DEVICE_TRUST_CHECK_FAILED",
    Download = "DOWNLOAD",
    Edit = "EDIT",
    EditUser = "EDIT_USER",
    EmailAliasConfirm = "EMAIL_ALIAS_CONFIRM",
    EmailAliasRemove = "EMAIL_ALIAS_REMOVE",
    EnableTwoFactorAuth = "ENABLE_TWO_FACTOR_AUTH",
    EnterpriseAppAuthorizationUpdate = "ENTERPRISE_APP_AUTHORIZATION_UPDATE",
    FailedLogin = "FAILED_LOGIN",
    FileMarkedMalicious = "FILE_MARKED_MALICIOUS",
    FileWatermarkedDownload = "FILE_WATERMARKED_DOWNLOAD",
    GroupAddItem = "GROUP_ADD_ITEM",
    GroupAddUser = "GROUP_ADD_USER",
    GroupCreation = "GROUP_CREATION",
    GroupDeletion = "GROUP_DELETION",
    GroupEdited = "GROUP_EDITED",
    GroupRemoveItem = "GROUP_REMOVE_ITEM",
    GroupRemoveUser = "GROUP_REMOVE_USER",
    ItemCopy = "ITEM_COPY",
    ItemCreate = "ITEM_CREATE",
    ItemDownload = "ITEM_DOWNLOAD",
    ItemMakeCurrentVersion = "ITEM_MAKE_CURRENT_VERSION",
    ItemModify = "ITEM_MODIFY",
    ItemMove = "ITEM_MOVE",
    ItemOpen = "ITEM_OPEN",
    ItemPreview = "ITEM_PREVIEW",
    ItemRename = "ITEM_RENAME",
    ItemShared = "ITEM_SHARED",
    ItemSharedCreate = "ITEM_SHARED_CREATE",
    ItemSharedUnshare = "ITEM_SHARED_UNSHARE",
    ItemSharedUpdate = "ITEM_SHARED_UPDATE",
    ItemSync = "ITEM_SYNC",
    ItemTrash = "ITEM_TRASH",
    ItemUndeleteViaTrash = "ITEM_UNDELETE_VIA_TRASH",
    ItemUnsync = "ITEM_UNSYNC",
    ItemUpload = "ITEM_UPLOAD",
    LegalHoldAssignmentCreate = "LEGAL_HOLD_ASSIGNMENT_CREATE",
    LegalHoldAssignmentDelete = "LEGAL_HOLD_ASSIGNMENT_DELETE",
    LegalHoldPolicyCreate = "LEGAL_HOLD_POLICY_CREATE",
    LegalHoldPolicyDelete = "LEGAL_HOLD_POLICY_DELETE",
    LegalHoldPolicyUpdate = "LEGAL_HOLD_POLICY_UPDATE",
    Lock = "LOCK",
    LockCreate = "LOCK_CREATE",
    LockDestroy = "LOCK_DESTROY",
    Login = "LOGIN",
    MasterInviteAccept = "MASTER_INVITE_ACCEPT",
    MasterInviteReject = "MASTER_INVITE_REJECT",
    MetadataInstanceCreate = "METADATA_INSTANCE_CREATE",
    MetadataInstanceDelete = "METADATA_INSTANCE_DELETE",
    MetadataInstanceUpdate = "METADATA_INSTANCE_UPDATE",
    MetadataTemplateCreate = "METADATA_TEMPLATE_CREATE",
    MetadataTemplateDelete = "METADATA_TEMPLATE_DELETE",
    MetadataTemplateUpdate = "METADATA_TEMPLATE_UPDATE",
    Move = "MOVE",
    NewUser = "NEW_USER",
    Preview = "PREVIEW",
    RemoveDeviceAssociation = "REMOVE_DEVICE_ASSOCIATION",
    RemoveLoginActivityDevice = "REMOVE_LOGIN_ACTIVITY_DEVICE",
    Rename = "RENAME",
    RetentionPolicyAssignmentAdd = "RETENTION_POLICY_ASSIGNMENT_ADD",
    Share = "SHARE",
    ShareExpiration = "SHARE_EXPIRATION",
    ShieldAlert = "SHIELD_ALERT",
    ShieldExternalCollabAccessBlocked = "SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED",
    ShieldExternalCollabAccessBlockedMissingJustification = "SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED_MISSING_JUSTIFICATION",
    ShieldExternalCollabInviteBlocked = "SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED",
    ShieldExternalCollabInviteBlockedMissingJustification = "SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED_MISSING_JUSTIFICATION",
    ShieldJustificationApproval = "SHIELD_JUSTIFICATION_APPROVAL",
    SignDocumentAssigned = "SIGN_DOCUMENT_ASSIGNED",
    SignDocumentCancelled = "SIGN_DOCUMENT_CANCELLED",
    SignDocumentCompleted = "SIGN_DOCUMENT_COMPLETED",
    SignDocumentConverted = "SIGN_DOCUMENT_CONVERTED",
    SignDocumentCreated = "SIGN_DOCUMENT_CREATED",
    SignDocumentDeclined = "SIGN_DOCUMENT_DECLINED",
    SignDocumentExpired = "SIGN_DOCUMENT_EXPIRED",
    SignDocumentSigned = "SIGN_DOCUMENT_SIGNED",
    SignDocumentViewedBySigned = "SIGN_DOCUMENT_VIEWED_BY_SIGNED",
    SignerDownloaded = "SIGNER_DOWNLOADED",
    SignerForwarded = "SIGNER_FORWARDED",
    StorageExpiration = "STORAGE_EXPIRATION",
    TagItemCreate = "TAG_ITEM_CREATE",
    TaskAssignmentCreate = "TASK_ASSIGNMENT_CREATE",
    TaskAssignmentDelete = "TASK_ASSIGNMENT_DELETE",
    TaskAssignmentUpdate = "TASK_ASSIGNMENT_UPDATE",
    TaskCreate = "TASK_CREATE",
    TaskUpdate = "TASK_UPDATE",
    TermsOfServiceAccept = "TERMS_OF_SERVICE_ACCEPT",
    TermsOfServiceReject = "TERMS_OF_SERVICE_REJECT",
    Undelete = "UNDELETE",
    Unlock = "UNLOCK",
    Unshare = "UNSHARE",
    UpdateCollaborationExpiration = "UPDATE_COLLABORATION_EXPIRATION",
    UpdateShareExpiration = "UPDATE_SHARE_EXPIRATION",
    Upload = "UPLOAD",
    UserAuthenticateOauth2AccessTokenCreate = "USER_AUTHENTICATE_OAUTH2_ACCESS_TOKEN_CREATE",
    WatermarkLabelCreate = "WATERMARK_LABEL_CREATE",
    WatermarkLabelDelete = "WATERMARK_LABEL_DELETE"
}


// Event
/** 
 * The description of an event that happened within Box
**/
export class Event extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=additional_details" })
  additionalDetails?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=event_id" })
  eventId?: string;

  @SpeakeasyMetadata({ data: "json, name=event_type" })
  eventType?: EventEventTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=recorded_at" })
  recordedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=session_id" })
  sessionId?: string;

  @SpeakeasyMetadata({ data: "json, name=source" })
  source?: any;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: string;
}
