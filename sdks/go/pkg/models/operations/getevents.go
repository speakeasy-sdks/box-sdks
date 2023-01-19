package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type GetEventsEventTypeEnum string

const (
	GetEventsEventTypeEnumAccessGranted                                         GetEventsEventTypeEnum = "ACCESS_GRANTED"
	GetEventsEventTypeEnumAccessRevoked                                         GetEventsEventTypeEnum = "ACCESS_REVOKED"
	GetEventsEventTypeEnumAddDeviceAssociation                                  GetEventsEventTypeEnum = "ADD_DEVICE_ASSOCIATION"
	GetEventsEventTypeEnumAddLoginActivityDevice                                GetEventsEventTypeEnum = "ADD_LOGIN_ACTIVITY_DEVICE"
	GetEventsEventTypeEnumAdminLogin                                            GetEventsEventTypeEnum = "ADMIN_LOGIN"
	GetEventsEventTypeEnumApplicationCreated                                    GetEventsEventTypeEnum = "APPLICATION_CREATED"
	GetEventsEventTypeEnumApplicationPublicKeyAdded                             GetEventsEventTypeEnum = "APPLICATION_PUBLIC_KEY_ADDED"
	GetEventsEventTypeEnumApplicationPublicKeyDeleted                           GetEventsEventTypeEnum = "APPLICATION_PUBLIC_KEY_DELETED"
	GetEventsEventTypeEnumChangeAdminRole                                       GetEventsEventTypeEnum = "CHANGE_ADMIN_ROLE"
	GetEventsEventTypeEnumChangeFolderPermission                                GetEventsEventTypeEnum = "CHANGE_FOLDER_PERMISSION"
	GetEventsEventTypeEnumCollaborationAccept                                   GetEventsEventTypeEnum = "COLLABORATION_ACCEPT"
	GetEventsEventTypeEnumCollaborationExpiration                               GetEventsEventTypeEnum = "COLLABORATION_EXPIRATION"
	GetEventsEventTypeEnumCollaborationInvite                                   GetEventsEventTypeEnum = "COLLABORATION_INVITE"
	GetEventsEventTypeEnumCollaborationRemove                                   GetEventsEventTypeEnum = "COLLABORATION_REMOVE"
	GetEventsEventTypeEnumCollaborationRoleChange                               GetEventsEventTypeEnum = "COLLABORATION_ROLE_CHANGE"
	GetEventsEventTypeEnumCommentCreate                                         GetEventsEventTypeEnum = "COMMENT_CREATE"
	GetEventsEventTypeEnumCommentDelete                                         GetEventsEventTypeEnum = "COMMENT_DELETE"
	GetEventsEventTypeEnumContentWorkflowAbnormalDownloadActivity               GetEventsEventTypeEnum = "CONTENT_WORKFLOW_ABNORMAL_DOWNLOAD_ACTIVITY"
	GetEventsEventTypeEnumContentWorkflowAutomationAdd                          GetEventsEventTypeEnum = "CONTENT_WORKFLOW_AUTOMATION_ADD"
	GetEventsEventTypeEnumContentWorkflowAutomationDelete                       GetEventsEventTypeEnum = "CONTENT_WORKFLOW_AUTOMATION_DELETE"
	GetEventsEventTypeEnumContentWorkflowPolicyAdd                              GetEventsEventTypeEnum = "CONTENT_WORKFLOW_POLICY_ADD"
	GetEventsEventTypeEnumContentWorkflowSharingPolicyViolation                 GetEventsEventTypeEnum = "CONTENT_WORKFLOW_SHARING_POLICY_VIOLATION"
	GetEventsEventTypeEnumContentWorkflowUploadPolicyViolation                  GetEventsEventTypeEnum = "CONTENT_WORKFLOW_UPLOAD_POLICY_VIOLATION"
	GetEventsEventTypeEnumCopy                                                  GetEventsEventTypeEnum = "COPY"
	GetEventsEventTypeEnumDataRetentionCreateRetention                          GetEventsEventTypeEnum = "DATA_RETENTION_CREATE_RETENTION"
	GetEventsEventTypeEnumDataRetentionRemoveRetention                          GetEventsEventTypeEnum = "DATA_RETENTION_REMOVE_RETENTION"
	GetEventsEventTypeEnumDelete                                                GetEventsEventTypeEnum = "DELETE"
	GetEventsEventTypeEnumDeleteUser                                            GetEventsEventTypeEnum = "DELETE_USER"
	GetEventsEventTypeEnumDeviceTrustCheckFailed                                GetEventsEventTypeEnum = "DEVICE_TRUST_CHECK_FAILED"
	GetEventsEventTypeEnumDownload                                              GetEventsEventTypeEnum = "DOWNLOAD"
	GetEventsEventTypeEnumEdit                                                  GetEventsEventTypeEnum = "EDIT"
	GetEventsEventTypeEnumEditUser                                              GetEventsEventTypeEnum = "EDIT_USER"
	GetEventsEventTypeEnumEmailAliasConfirm                                     GetEventsEventTypeEnum = "EMAIL_ALIAS_CONFIRM"
	GetEventsEventTypeEnumEmailAliasRemove                                      GetEventsEventTypeEnum = "EMAIL_ALIAS_REMOVE"
	GetEventsEventTypeEnumEnterpriseAppAuthorizationUpdate                      GetEventsEventTypeEnum = "ENTERPRISE_APP_AUTHORIZATION_UPDATE"
	GetEventsEventTypeEnumExternalCollabSecuritySettings                        GetEventsEventTypeEnum = "EXTERNAL_COLLAB_SECURITY_SETTINGS"
	GetEventsEventTypeEnumFailedLogin                                           GetEventsEventTypeEnum = "FAILED_LOGIN"
	GetEventsEventTypeEnumFileMarkedMalicious                                   GetEventsEventTypeEnum = "FILE_MARKED_MALICIOUS"
	GetEventsEventTypeEnumFileWatermarkedDownload                               GetEventsEventTypeEnum = "FILE_WATERMARKED_DOWNLOAD"
	GetEventsEventTypeEnumGroupAddItem                                          GetEventsEventTypeEnum = "GROUP_ADD_ITEM"
	GetEventsEventTypeEnumGroupAddUser                                          GetEventsEventTypeEnum = "GROUP_ADD_USER"
	GetEventsEventTypeEnumGroupCreation                                         GetEventsEventTypeEnum = "GROUP_CREATION"
	GetEventsEventTypeEnumGroupDeletion                                         GetEventsEventTypeEnum = "GROUP_DELETION"
	GetEventsEventTypeEnumGroupEdited                                           GetEventsEventTypeEnum = "GROUP_EDITED"
	GetEventsEventTypeEnumGroupRemoveItem                                       GetEventsEventTypeEnum = "GROUP_REMOVE_ITEM"
	GetEventsEventTypeEnumGroupRemoveUser                                       GetEventsEventTypeEnum = "GROUP_REMOVE_USER"
	GetEventsEventTypeEnumItemModify                                            GetEventsEventTypeEnum = "ITEM_MODIFY"
	GetEventsEventTypeEnumItemOpen                                              GetEventsEventTypeEnum = "ITEM_OPEN"
	GetEventsEventTypeEnumItemSharedUpdate                                      GetEventsEventTypeEnum = "ITEM_SHARED_UPDATE"
	GetEventsEventTypeEnumItemSync                                              GetEventsEventTypeEnum = "ITEM_SYNC"
	GetEventsEventTypeEnumItemUnsync                                            GetEventsEventTypeEnum = "ITEM_UNSYNC"
	GetEventsEventTypeEnumLegalHoldAssignmentCreate                             GetEventsEventTypeEnum = "LEGAL_HOLD_ASSIGNMENT_CREATE"
	GetEventsEventTypeEnumLegalHoldAssignmentDelete                             GetEventsEventTypeEnum = "LEGAL_HOLD_ASSIGNMENT_DELETE"
	GetEventsEventTypeEnumLegalHoldPolicyCreate                                 GetEventsEventTypeEnum = "LEGAL_HOLD_POLICY_CREATE"
	GetEventsEventTypeEnumLegalHoldPolicyDelete                                 GetEventsEventTypeEnum = "LEGAL_HOLD_POLICY_DELETE"
	GetEventsEventTypeEnumLegalHoldPolicyUpdate                                 GetEventsEventTypeEnum = "LEGAL_HOLD_POLICY_UPDATE"
	GetEventsEventTypeEnumLock                                                  GetEventsEventTypeEnum = "LOCK"
	GetEventsEventTypeEnumLogin                                                 GetEventsEventTypeEnum = "LOGIN"
	GetEventsEventTypeEnumMetadataInstanceCreate                                GetEventsEventTypeEnum = "METADATA_INSTANCE_CREATE"
	GetEventsEventTypeEnumMetadataInstanceDelete                                GetEventsEventTypeEnum = "METADATA_INSTANCE_DELETE"
	GetEventsEventTypeEnumMetadataInstanceUpdate                                GetEventsEventTypeEnum = "METADATA_INSTANCE_UPDATE"
	GetEventsEventTypeEnumMetadataTemplateCreate                                GetEventsEventTypeEnum = "METADATA_TEMPLATE_CREATE"
	GetEventsEventTypeEnumMetadataTemplateDelete                                GetEventsEventTypeEnum = "METADATA_TEMPLATE_DELETE"
	GetEventsEventTypeEnumMetadataTemplateUpdate                                GetEventsEventTypeEnum = "METADATA_TEMPLATE_UPDATE"
	GetEventsEventTypeEnumMove                                                  GetEventsEventTypeEnum = "MOVE"
	GetEventsEventTypeEnumNewUser                                               GetEventsEventTypeEnum = "NEW_USER"
	GetEventsEventTypeEnumOauth2AccessTokenRevoke                               GetEventsEventTypeEnum = "OAUTH2_ACCESS_TOKEN_REVOKE"
	GetEventsEventTypeEnumPreview                                               GetEventsEventTypeEnum = "PREVIEW"
	GetEventsEventTypeEnumRemoveDeviceAssociation                               GetEventsEventTypeEnum = "REMOVE_DEVICE_ASSOCIATION"
	GetEventsEventTypeEnumRemoveLoginActivityDevice                             GetEventsEventTypeEnum = "REMOVE_LOGIN_ACTIVITY_DEVICE"
	GetEventsEventTypeEnumRename                                                GetEventsEventTypeEnum = "RENAME"
	GetEventsEventTypeEnumRetentionPolicyAssignmentAdd                          GetEventsEventTypeEnum = "RETENTION_POLICY_ASSIGNMENT_ADD"
	GetEventsEventTypeEnumShare                                                 GetEventsEventTypeEnum = "SHARE"
	GetEventsEventTypeEnumShareExpiration                                       GetEventsEventTypeEnum = "SHARE_EXPIRATION"
	GetEventsEventTypeEnumShieldAlert                                           GetEventsEventTypeEnum = "SHIELD_ALERT"
	GetEventsEventTypeEnumShieldExternalCollabAccessBlocked                     GetEventsEventTypeEnum = "SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED"
	GetEventsEventTypeEnumShieldExternalCollabAccessBlockedMissingJustification GetEventsEventTypeEnum = "SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED_MISSING_JUSTIFICATION"
	GetEventsEventTypeEnumShieldExternalCollabInviteBlocked                     GetEventsEventTypeEnum = "SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED"
	GetEventsEventTypeEnumShieldExternalCollabInviteBlockedMissingJustification GetEventsEventTypeEnum = "SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED_MISSING_JUSTIFICATION"
	GetEventsEventTypeEnumShieldJustificationApproval                           GetEventsEventTypeEnum = "SHIELD_JUSTIFICATION_APPROVAL"
	GetEventsEventTypeEnumSignDocumentAssigned                                  GetEventsEventTypeEnum = "SIGN_DOCUMENT_ASSIGNED"
	GetEventsEventTypeEnumSignDocumentCancelled                                 GetEventsEventTypeEnum = "SIGN_DOCUMENT_CANCELLED"
	GetEventsEventTypeEnumSignDocumentCompleted                                 GetEventsEventTypeEnum = "SIGN_DOCUMENT_COMPLETED"
	GetEventsEventTypeEnumSignDocumentConverted                                 GetEventsEventTypeEnum = "SIGN_DOCUMENT_CONVERTED"
	GetEventsEventTypeEnumSignDocumentCreated                                   GetEventsEventTypeEnum = "SIGN_DOCUMENT_CREATED"
	GetEventsEventTypeEnumSignDocumentDeclined                                  GetEventsEventTypeEnum = "SIGN_DOCUMENT_DECLINED"
	GetEventsEventTypeEnumSignDocumentExpired                                   GetEventsEventTypeEnum = "SIGN_DOCUMENT_EXPIRED"
	GetEventsEventTypeEnumSignDocumentSigned                                    GetEventsEventTypeEnum = "SIGN_DOCUMENT_SIGNED"
	GetEventsEventTypeEnumSignDocumentViewedBySigned                            GetEventsEventTypeEnum = "SIGN_DOCUMENT_VIEWED_BY_SIGNED"
	GetEventsEventTypeEnumSignerDownloaded                                      GetEventsEventTypeEnum = "SIGNER_DOWNLOADED"
	GetEventsEventTypeEnumSignerForwarded                                       GetEventsEventTypeEnum = "SIGNER_FORWARDED"
	GetEventsEventTypeEnumStorageExpiration                                     GetEventsEventTypeEnum = "STORAGE_EXPIRATION"
	GetEventsEventTypeEnumTaskAssignmentCreate                                  GetEventsEventTypeEnum = "TASK_ASSIGNMENT_CREATE"
	GetEventsEventTypeEnumTaskAssignmentDelete                                  GetEventsEventTypeEnum = "TASK_ASSIGNMENT_DELETE"
	GetEventsEventTypeEnumTaskAssignmentUpdate                                  GetEventsEventTypeEnum = "TASK_ASSIGNMENT_UPDATE"
	GetEventsEventTypeEnumTaskCreate                                            GetEventsEventTypeEnum = "TASK_CREATE"
	GetEventsEventTypeEnumTaskUpdate                                            GetEventsEventTypeEnum = "TASK_UPDATE"
	GetEventsEventTypeEnumTermsOfServiceAccept                                  GetEventsEventTypeEnum = "TERMS_OF_SERVICE_ACCEPT"
	GetEventsEventTypeEnumTermsOfServiceReject                                  GetEventsEventTypeEnum = "TERMS_OF_SERVICE_REJECT"
	GetEventsEventTypeEnumUndelete                                              GetEventsEventTypeEnum = "UNDELETE"
	GetEventsEventTypeEnumUnlock                                                GetEventsEventTypeEnum = "UNLOCK"
	GetEventsEventTypeEnumUnshare                                               GetEventsEventTypeEnum = "UNSHARE"
	GetEventsEventTypeEnumUpdateCollaborationExpiration                         GetEventsEventTypeEnum = "UPDATE_COLLABORATION_EXPIRATION"
	GetEventsEventTypeEnumUpdateShareExpiration                                 GetEventsEventTypeEnum = "UPDATE_SHARE_EXPIRATION"
	GetEventsEventTypeEnumUpload                                                GetEventsEventTypeEnum = "UPLOAD"
	GetEventsEventTypeEnumUserAuthenticateOauth2AccessTokenCreate               GetEventsEventTypeEnum = "USER_AUTHENTICATE_OAUTH2_ACCESS_TOKEN_CREATE"
	GetEventsEventTypeEnumWatermarkLabelCreate                                  GetEventsEventTypeEnum = "WATERMARK_LABEL_CREATE"
	GetEventsEventTypeEnumWatermarkLabelDelete                                  GetEventsEventTypeEnum = "WATERMARK_LABEL_DELETE"
)

type GetEventsStreamTypeEnum string

const (
	GetEventsStreamTypeEnumAll                GetEventsStreamTypeEnum = "all"
	GetEventsStreamTypeEnumChanges            GetEventsStreamTypeEnum = "changes"
	GetEventsStreamTypeEnumSync               GetEventsStreamTypeEnum = "sync"
	GetEventsStreamTypeEnumAdminLogs          GetEventsStreamTypeEnum = "admin_logs"
	GetEventsStreamTypeEnumAdminLogsStreaming GetEventsStreamTypeEnum = "admin_logs_streaming"
)

type GetEventsQueryParams struct {
	CreatedAfter   *time.Time               `queryParam:"style=form,explode=true,name=created_after"`
	CreatedBefore  *time.Time               `queryParam:"style=form,explode=true,name=created_before"`
	EventType      []GetEventsEventTypeEnum `queryParam:"style=form,explode=false,name=event_type"`
	Limit          *int64                   `queryParam:"style=form,explode=true,name=limit"`
	StreamPosition *string                  `queryParam:"style=form,explode=true,name=stream_position"`
	StreamType     *GetEventsStreamTypeEnum `queryParam:"style=form,explode=true,name=stream_type"`
}

type GetEventsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetEventsQueryParams
}

type GetEventsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Events      *shared.Events
	StatusCode  int64
}
