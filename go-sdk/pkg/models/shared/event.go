package shared

import (
	"time"
)

type EventEventTypeEnum string

const (
	EventEventTypeEnumAccessGranted                                         EventEventTypeEnum = "ACCESS_GRANTED"
	EventEventTypeEnumAccessRevoked                                         EventEventTypeEnum = "ACCESS_REVOKED"
	EventEventTypeEnumAddDeviceAssociation                                  EventEventTypeEnum = "ADD_DEVICE_ASSOCIATION"
	EventEventTypeEnumAddLoginActivityDevice                                EventEventTypeEnum = "ADD_LOGIN_ACTIVITY_DEVICE"
	EventEventTypeEnumAdminLogin                                            EventEventTypeEnum = "ADMIN_LOGIN"
	EventEventTypeEnumApplicationCreated                                    EventEventTypeEnum = "APPLICATION_CREATED"
	EventEventTypeEnumApplicationPublicKeyAdded                             EventEventTypeEnum = "APPLICATION_PUBLIC_KEY_ADDED"
	EventEventTypeEnumApplicationPublicKeyDeleted                           EventEventTypeEnum = "APPLICATION_PUBLIC_KEY_DELETED"
	EventEventTypeEnumChangeAdminRole                                       EventEventTypeEnum = "CHANGE_ADMIN_ROLE"
	EventEventTypeEnumChangeFolderPermission                                EventEventTypeEnum = "CHANGE_FOLDER_PERMISSION"
	EventEventTypeEnumCollaborationAccept                                   EventEventTypeEnum = "COLLABORATION_ACCEPT"
	EventEventTypeEnumCollaborationExpiration                               EventEventTypeEnum = "COLLABORATION_EXPIRATION"
	EventEventTypeEnumCollaborationInvite                                   EventEventTypeEnum = "COLLABORATION_INVITE"
	EventEventTypeEnumCollaborationRemove                                   EventEventTypeEnum = "COLLABORATION_REMOVE"
	EventEventTypeEnumCollaborationRoleChange                               EventEventTypeEnum = "COLLABORATION_ROLE_CHANGE"
	EventEventTypeEnumCollabAddCollaborator                                 EventEventTypeEnum = "COLLAB_ADD_COLLABORATOR"
	EventEventTypeEnumCollabInviteCollaborator                              EventEventTypeEnum = "COLLAB_INVITE_COLLABORATOR"
	EventEventTypeEnumCollabRemoveCollaborator                              EventEventTypeEnum = "COLLAB_REMOVE_COLLABORATOR"
	EventEventTypeEnumCollabRoleChange                                      EventEventTypeEnum = "COLLAB_ROLE_CHANGE"
	EventEventTypeEnumCommentCreate                                         EventEventTypeEnum = "COMMENT_CREATE"
	EventEventTypeEnumCommentDelete                                         EventEventTypeEnum = "COMMENT_DELETE"
	EventEventTypeEnumContentAccess                                         EventEventTypeEnum = "CONTENT_ACCESS"
	EventEventTypeEnumContentWorkflowAbnormalDownloadActivity               EventEventTypeEnum = "CONTENT_WORKFLOW_ABNORMAL_DOWNLOAD_ACTIVITY"
	EventEventTypeEnumContentWorkflowAutomationAdd                          EventEventTypeEnum = "CONTENT_WORKFLOW_AUTOMATION_ADD"
	EventEventTypeEnumContentWorkflowAutomationDelete                       EventEventTypeEnum = "CONTENT_WORKFLOW_AUTOMATION_DELETE"
	EventEventTypeEnumContentWorkflowPolicyAdd                              EventEventTypeEnum = "CONTENT_WORKFLOW_POLICY_ADD"
	EventEventTypeEnumContentWorkflowSharingPolicyViolation                 EventEventTypeEnum = "CONTENT_WORKFLOW_SHARING_POLICY_VIOLATION"
	EventEventTypeEnumContentWorkflowUploadPolicyViolation                  EventEventTypeEnum = "CONTENT_WORKFLOW_UPLOAD_POLICY_VIOLATION"
	EventEventTypeEnumCopy                                                  EventEventTypeEnum = "COPY"
	EventEventTypeEnumDataRetentionCreateRetention                          EventEventTypeEnum = "DATA_RETENTION_CREATE_RETENTION"
	EventEventTypeEnumDataRetentionRemoveRetention                          EventEventTypeEnum = "DATA_RETENTION_REMOVE_RETENTION"
	EventEventTypeEnumDelete                                                EventEventTypeEnum = "DELETE"
	EventEventTypeEnumDeleteUser                                            EventEventTypeEnum = "DELETE_USER"
	EventEventTypeEnumDeviceTrustCheckFailed                                EventEventTypeEnum = "DEVICE_TRUST_CHECK_FAILED"
	EventEventTypeEnumDownload                                              EventEventTypeEnum = "DOWNLOAD"
	EventEventTypeEnumEdit                                                  EventEventTypeEnum = "EDIT"
	EventEventTypeEnumEditUser                                              EventEventTypeEnum = "EDIT_USER"
	EventEventTypeEnumEmailAliasConfirm                                     EventEventTypeEnum = "EMAIL_ALIAS_CONFIRM"
	EventEventTypeEnumEmailAliasRemove                                      EventEventTypeEnum = "EMAIL_ALIAS_REMOVE"
	EventEventTypeEnumEnableTwoFactorAuth                                   EventEventTypeEnum = "ENABLE_TWO_FACTOR_AUTH"
	EventEventTypeEnumEnterpriseAppAuthorizationUpdate                      EventEventTypeEnum = "ENTERPRISE_APP_AUTHORIZATION_UPDATE"
	EventEventTypeEnumFailedLogin                                           EventEventTypeEnum = "FAILED_LOGIN"
	EventEventTypeEnumFileMarkedMalicious                                   EventEventTypeEnum = "FILE_MARKED_MALICIOUS"
	EventEventTypeEnumFileWatermarkedDownload                               EventEventTypeEnum = "FILE_WATERMARKED_DOWNLOAD"
	EventEventTypeEnumGroupAddItem                                          EventEventTypeEnum = "GROUP_ADD_ITEM"
	EventEventTypeEnumGroupAddUser                                          EventEventTypeEnum = "GROUP_ADD_USER"
	EventEventTypeEnumGroupCreation                                         EventEventTypeEnum = "GROUP_CREATION"
	EventEventTypeEnumGroupDeletion                                         EventEventTypeEnum = "GROUP_DELETION"
	EventEventTypeEnumGroupEdited                                           EventEventTypeEnum = "GROUP_EDITED"
	EventEventTypeEnumGroupRemoveItem                                       EventEventTypeEnum = "GROUP_REMOVE_ITEM"
	EventEventTypeEnumGroupRemoveUser                                       EventEventTypeEnum = "GROUP_REMOVE_USER"
	EventEventTypeEnumItemCopy                                              EventEventTypeEnum = "ITEM_COPY"
	EventEventTypeEnumItemCreate                                            EventEventTypeEnum = "ITEM_CREATE"
	EventEventTypeEnumItemDownload                                          EventEventTypeEnum = "ITEM_DOWNLOAD"
	EventEventTypeEnumItemMakeCurrentVersion                                EventEventTypeEnum = "ITEM_MAKE_CURRENT_VERSION"
	EventEventTypeEnumItemModify                                            EventEventTypeEnum = "ITEM_MODIFY"
	EventEventTypeEnumItemMove                                              EventEventTypeEnum = "ITEM_MOVE"
	EventEventTypeEnumItemOpen                                              EventEventTypeEnum = "ITEM_OPEN"
	EventEventTypeEnumItemPreview                                           EventEventTypeEnum = "ITEM_PREVIEW"
	EventEventTypeEnumItemRename                                            EventEventTypeEnum = "ITEM_RENAME"
	EventEventTypeEnumItemShared                                            EventEventTypeEnum = "ITEM_SHARED"
	EventEventTypeEnumItemSharedCreate                                      EventEventTypeEnum = "ITEM_SHARED_CREATE"
	EventEventTypeEnumItemSharedUnshare                                     EventEventTypeEnum = "ITEM_SHARED_UNSHARE"
	EventEventTypeEnumItemSharedUpdate                                      EventEventTypeEnum = "ITEM_SHARED_UPDATE"
	EventEventTypeEnumItemSync                                              EventEventTypeEnum = "ITEM_SYNC"
	EventEventTypeEnumItemTrash                                             EventEventTypeEnum = "ITEM_TRASH"
	EventEventTypeEnumItemUndeleteViaTrash                                  EventEventTypeEnum = "ITEM_UNDELETE_VIA_TRASH"
	EventEventTypeEnumItemUnsync                                            EventEventTypeEnum = "ITEM_UNSYNC"
	EventEventTypeEnumItemUpload                                            EventEventTypeEnum = "ITEM_UPLOAD"
	EventEventTypeEnumLegalHoldAssignmentCreate                             EventEventTypeEnum = "LEGAL_HOLD_ASSIGNMENT_CREATE"
	EventEventTypeEnumLegalHoldAssignmentDelete                             EventEventTypeEnum = "LEGAL_HOLD_ASSIGNMENT_DELETE"
	EventEventTypeEnumLegalHoldPolicyCreate                                 EventEventTypeEnum = "LEGAL_HOLD_POLICY_CREATE"
	EventEventTypeEnumLegalHoldPolicyDelete                                 EventEventTypeEnum = "LEGAL_HOLD_POLICY_DELETE"
	EventEventTypeEnumLegalHoldPolicyUpdate                                 EventEventTypeEnum = "LEGAL_HOLD_POLICY_UPDATE"
	EventEventTypeEnumLock                                                  EventEventTypeEnum = "LOCK"
	EventEventTypeEnumLockCreate                                            EventEventTypeEnum = "LOCK_CREATE"
	EventEventTypeEnumLockDestroy                                           EventEventTypeEnum = "LOCK_DESTROY"
	EventEventTypeEnumLogin                                                 EventEventTypeEnum = "LOGIN"
	EventEventTypeEnumMasterInviteAccept                                    EventEventTypeEnum = "MASTER_INVITE_ACCEPT"
	EventEventTypeEnumMasterInviteReject                                    EventEventTypeEnum = "MASTER_INVITE_REJECT"
	EventEventTypeEnumMetadataInstanceCreate                                EventEventTypeEnum = "METADATA_INSTANCE_CREATE"
	EventEventTypeEnumMetadataInstanceDelete                                EventEventTypeEnum = "METADATA_INSTANCE_DELETE"
	EventEventTypeEnumMetadataInstanceUpdate                                EventEventTypeEnum = "METADATA_INSTANCE_UPDATE"
	EventEventTypeEnumMetadataTemplateCreate                                EventEventTypeEnum = "METADATA_TEMPLATE_CREATE"
	EventEventTypeEnumMetadataTemplateDelete                                EventEventTypeEnum = "METADATA_TEMPLATE_DELETE"
	EventEventTypeEnumMetadataTemplateUpdate                                EventEventTypeEnum = "METADATA_TEMPLATE_UPDATE"
	EventEventTypeEnumMove                                                  EventEventTypeEnum = "MOVE"
	EventEventTypeEnumNewUser                                               EventEventTypeEnum = "NEW_USER"
	EventEventTypeEnumPreview                                               EventEventTypeEnum = "PREVIEW"
	EventEventTypeEnumRemoveDeviceAssociation                               EventEventTypeEnum = "REMOVE_DEVICE_ASSOCIATION"
	EventEventTypeEnumRemoveLoginActivityDevice                             EventEventTypeEnum = "REMOVE_LOGIN_ACTIVITY_DEVICE"
	EventEventTypeEnumRename                                                EventEventTypeEnum = "RENAME"
	EventEventTypeEnumRetentionPolicyAssignmentAdd                          EventEventTypeEnum = "RETENTION_POLICY_ASSIGNMENT_ADD"
	EventEventTypeEnumShare                                                 EventEventTypeEnum = "SHARE"
	EventEventTypeEnumShareExpiration                                       EventEventTypeEnum = "SHARE_EXPIRATION"
	EventEventTypeEnumShieldAlert                                           EventEventTypeEnum = "SHIELD_ALERT"
	EventEventTypeEnumShieldExternalCollabAccessBlocked                     EventEventTypeEnum = "SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED"
	EventEventTypeEnumShieldExternalCollabAccessBlockedMissingJustification EventEventTypeEnum = "SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED_MISSING_JUSTIFICATION"
	EventEventTypeEnumShieldExternalCollabInviteBlocked                     EventEventTypeEnum = "SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED"
	EventEventTypeEnumShieldExternalCollabInviteBlockedMissingJustification EventEventTypeEnum = "SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED_MISSING_JUSTIFICATION"
	EventEventTypeEnumShieldJustificationApproval                           EventEventTypeEnum = "SHIELD_JUSTIFICATION_APPROVAL"
	EventEventTypeEnumSignDocumentAssigned                                  EventEventTypeEnum = "SIGN_DOCUMENT_ASSIGNED"
	EventEventTypeEnumSignDocumentCancelled                                 EventEventTypeEnum = "SIGN_DOCUMENT_CANCELLED"
	EventEventTypeEnumSignDocumentCompleted                                 EventEventTypeEnum = "SIGN_DOCUMENT_COMPLETED"
	EventEventTypeEnumSignDocumentConverted                                 EventEventTypeEnum = "SIGN_DOCUMENT_CONVERTED"
	EventEventTypeEnumSignDocumentCreated                                   EventEventTypeEnum = "SIGN_DOCUMENT_CREATED"
	EventEventTypeEnumSignDocumentDeclined                                  EventEventTypeEnum = "SIGN_DOCUMENT_DECLINED"
	EventEventTypeEnumSignDocumentExpired                                   EventEventTypeEnum = "SIGN_DOCUMENT_EXPIRED"
	EventEventTypeEnumSignDocumentSigned                                    EventEventTypeEnum = "SIGN_DOCUMENT_SIGNED"
	EventEventTypeEnumSignDocumentViewedBySigned                            EventEventTypeEnum = "SIGN_DOCUMENT_VIEWED_BY_SIGNED"
	EventEventTypeEnumSignerDownloaded                                      EventEventTypeEnum = "SIGNER_DOWNLOADED"
	EventEventTypeEnumSignerForwarded                                       EventEventTypeEnum = "SIGNER_FORWARDED"
	EventEventTypeEnumStorageExpiration                                     EventEventTypeEnum = "STORAGE_EXPIRATION"
	EventEventTypeEnumTagItemCreate                                         EventEventTypeEnum = "TAG_ITEM_CREATE"
	EventEventTypeEnumTaskAssignmentCreate                                  EventEventTypeEnum = "TASK_ASSIGNMENT_CREATE"
	EventEventTypeEnumTaskAssignmentDelete                                  EventEventTypeEnum = "TASK_ASSIGNMENT_DELETE"
	EventEventTypeEnumTaskAssignmentUpdate                                  EventEventTypeEnum = "TASK_ASSIGNMENT_UPDATE"
	EventEventTypeEnumTaskCreate                                            EventEventTypeEnum = "TASK_CREATE"
	EventEventTypeEnumTaskUpdate                                            EventEventTypeEnum = "TASK_UPDATE"
	EventEventTypeEnumTermsOfServiceAccept                                  EventEventTypeEnum = "TERMS_OF_SERVICE_ACCEPT"
	EventEventTypeEnumTermsOfServiceReject                                  EventEventTypeEnum = "TERMS_OF_SERVICE_REJECT"
	EventEventTypeEnumUndelete                                              EventEventTypeEnum = "UNDELETE"
	EventEventTypeEnumUnlock                                                EventEventTypeEnum = "UNLOCK"
	EventEventTypeEnumUnshare                                               EventEventTypeEnum = "UNSHARE"
	EventEventTypeEnumUpdateCollaborationExpiration                         EventEventTypeEnum = "UPDATE_COLLABORATION_EXPIRATION"
	EventEventTypeEnumUpdateShareExpiration                                 EventEventTypeEnum = "UPDATE_SHARE_EXPIRATION"
	EventEventTypeEnumUpload                                                EventEventTypeEnum = "UPLOAD"
	EventEventTypeEnumUserAuthenticateOauth2AccessTokenCreate               EventEventTypeEnum = "USER_AUTHENTICATE_OAUTH2_ACCESS_TOKEN_CREATE"
	EventEventTypeEnumWatermarkLabelCreate                                  EventEventTypeEnum = "WATERMARK_LABEL_CREATE"
	EventEventTypeEnumWatermarkLabelDelete                                  EventEventTypeEnum = "WATERMARK_LABEL_DELETE"
)

// Event
// The description of an event that happened within Box
type Event struct {
	AdditionalDetails map[string]interface{} `json:"additional_details,omitempty"`
	CreatedAt         *time.Time             `json:"created_at,omitempty"`
	CreatedBy         *UserMini              `json:"created_by,omitempty"`
	EventID           *string                `json:"event_id,omitempty"`
	EventType         *EventEventTypeEnum    `json:"event_type,omitempty"`
	RecordedAt        *time.Time             `json:"recorded_at,omitempty"`
	SessionID         *string                `json:"session_id,omitempty"`
	Source            *interface{}           `json:"source,omitempty"`
	Type              *string                `json:"type,omitempty"`
}
