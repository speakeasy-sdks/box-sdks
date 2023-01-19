# openapi

<!-- Start SDK Installation -->
## SDK Installation

```bash
go get openapi
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```go
package main

import (
    "openapi"
    "openapi/pkg/models/shared"
    "openapi/pkg/models/operations"
)

func main() {
    opts := []boxsdk.SDKOption{
        boxsdk.WithSecurity(
            shared.Security{
                OAuth2Security: shared.SchemeOAuth2Security{
                    Authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
                },
            }
        ),
    }

    s := boxsdk.New(opts...)
    
    req := operations.GetAuthorizeRequest{
        QueryParams: operations.GetAuthorizeQueryParams{
            ClientID: "sit",
            RedirectURI: "voluptas",
            ResponseType: "code",
            Scope: "expedita",
            State: "consequuntur",
        },
    }
    
    res, err := s.Authorization.GetAuthorize(ctx, req)
    if err != nil {
        log.Fatal(err)
    }

    if res.GetAuthorize200TextHTMLHTMLString != nil {
        // handle response
    }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations

### Authorization

* `GetAuthorize` - Authorize user
* `PostOauth2Revoke` - Revoke access token
* `PostOauth2Token` - Request access token
* `PostOauth2TokenNumberRefresh` - Refresh access token

### Box Sign

* `GetSignRequests` - List sign requests
* `GetSignRequestsID` - Get sign request by ID
* `PostSignRequests` - Create sign request
* `PostSignRequestsIDCancel` - Cancel sign request
* `PostSignRequestsIDResend` - Resend sign request

### Classifications

* `DeleteMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchema` - Delete all classifications
* `GetMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchema` - List all classifications
* `PostMetadataTemplatesSchemaNumberClassifications` - Add initial classifications
* `PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAdd` - Add classification
* `PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDelete` - Delete classification
* `PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdate` - Update classification

### Classifications on files

* `DeleteFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWo` - Remove classification from file
* `GetFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWo` - Get classification on file
* `PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWo` - Add classification to file
* `PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWo` - Update classification on file

### Classifications on folders

* `DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWo` - Remove classification from folder
* `GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWo` - Get classification on folder
* `PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWo` - Add classification to folder
* `PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWo` - Update classification on folder

### Collaborations

* `DeleteCollaborationsID` - Remove collaboration
* `GetCollaborationsID` - Get collaboration
* `PostCollaborations` - Create collaboration
* `PutCollaborationsID` - Update collaboration

### Collaborations (List)

* `GetCollaborations` - List pending collaborations
* `GetFilesIDCollaborations` - List file collaborations
* `GetFoldersIDCollaborations` - List folder collaborations
* `GetGroupsIDCollaborations` - List group collaborations

### Collections

* `GetCollections` - List all collections
* `GetCollectionsIDItems` - List collection items

### Comments

* `DeleteCommentsID` - Remove comment
* `GetCommentsID` - Get comment
* `GetFilesIDComments` - List file comments
* `PostComments` - Create comment
* `PutCommentsID` - Update comment

### Device pinners

* `DeleteDevicePinnersID` - Remove device pin
* `GetDevicePinnersID` - Get device pin
* `GetEnterprisesIDDevicePinners` - List enterprise device pins

### Domain restrictions (User exemptions)

* `DeleteCollaborationWhitelistExemptTargetsID` - Remove user from list of users exempt from domain restrictions
* `GetCollaborationWhitelistExemptTargets` - List users exempt from collaboration domain restrictions
* `GetCollaborationWhitelistExemptTargetsID` - Get user exempt from collaboration domain restrictions
* `PostCollaborationWhitelistExemptTargets` - Create user exemption from collaboration domain restrictions

### Domain restrictions for collaborations

* `DeleteCollaborationWhitelistEntriesID` - Remove domain from list of allowed collaboration domains
* `GetCollaborationWhitelistEntries` - List allowed collaboration domains
* `GetCollaborationWhitelistEntriesID` - Get allowed collaboration domain
* `PostCollaborationWhitelistEntries` - Add domain to list of allowed collaboration domains

### Downloads

* `GetFilesIDContent` - Download file

### Email aliases

* `DeleteUsersIDEmailAliasesID` - Remove email alias
* `GetUsersIDEmailAliases` - List user's email aliases
* `PostUsersIDEmailAliases` - Create email alias

### Events

* `GetEvents` - List user and enterprise events
* `OptionsEvents` - Get events long poll endpoint

### File requests

* `DeleteFileRequestsID` - Delete file request
* `GetFileRequestsID` - Get file request
* `PostFileRequestsIDCopy` - Copy file request
* `PutFileRequestsID` - Update file request

### File version legal holds

* `GetFileVersionLegalHolds` - List file version legal holds
* `GetFileVersionLegalHoldsID` - Get file version legal hold

### File version retentions

* `GetFileVersionRetentions` - List file version retentions
* `GetFileVersionRetentionsID` - Get retention on file

### File versions

* `DeleteFilesIDVersionsID` - Remove file version
* `GetFilesIDVersions` - List all file versions
* `GetFilesIDVersionsID` - Get file version
* `PostFilesIDVersionsCurrent` - Promote file version
* `PutFilesIDVersionsID` - Restore file version

### Files

* `DeleteFilesID` - Delete file
* `GetFilesID` - Get file information
* `GetFilesIDThumbnailID` - Get file thumbnail
* `OptionsFilesContent` - Preflight check before upload
* `PostFilesIDCopy` - Copy file
* `PutFilesID` - Update file

### Folder Locks

* `DeleteFolderLocksID` - Delete folder lock
* `GetFolderLocks` - List folder locks
* `PostFolderLocks` - Create folder lock

### Folders

* `DeleteFoldersID` - Delete folder
* `GetFoldersID` - Get folder information
* `GetFoldersIDItems` - List items in folder
* `PostFolders` - Create folder
* `PostFoldersIDCopy` - Copy folder
* `PutFoldersID` - Update folder

### Group memberships

* `DeleteGroupMembershipsID` - Remove user from group
* `GetGroupMembershipsID` - Get group membership
* `GetGroupsIDMemberships` - List members of group
* `GetUsersIDMemberships` - List user's groups
* `PostGroupMemberships` - Add user to group
* `PutGroupMembershipsID` - Update group membership

### Groups

* `DeleteGroupsID` - Remove group
* `GetGroups` - List groups for enterprise
* `GetGroupsID` - Get group
* `PostGroups` - Create group
* `PostGroupsTerminateSessions` - Create jobs to terminate user group session
* `PutGroupsID` - Update group

### Invites

* `GetInvitesID` - Get user invite status
* `PostInvites` - Create user invite

### Legal hold policies

* `DeleteLegalHoldPoliciesID` - Remove legal hold policy
* `GetLegalHoldPolicies` - List all legal hold policies
* `GetLegalHoldPoliciesID` - Get legal hold policy
* `PostLegalHoldPolicies` - Create legal hold policy
* `PutLegalHoldPoliciesID` - Update legal hold policy

### Legal hold policy assignments

* `DeleteLegalHoldPolicyAssignmentsID` - Unassign legal hold policy
* `GetLegalHoldPolicyAssignments` - List legal hold policy assignments
* `GetLegalHoldPolicyAssignmentsID` - Get legal hold policy assignment
* `GetLegalHoldPolicyAssignmentsIDFileVersionsOnHold` - List previous file versions for legal hold policy assignment
* `GetLegalHoldPolicyAssignmentsIDFilesOnHold` - List current file versions for legal hold policy assignment
* `PostLegalHoldPolicyAssignments` - Assign legal hold policy

### Metadata cascade policies

* `DeleteMetadataCascadePoliciesID` - Remove metadata cascade policy
* `GetMetadataCascadePolicies` - List metadata cascade policies
* `GetMetadataCascadePoliciesID` - Get metadata cascade policy
* `PostMetadataCascadePolicies` - Create metadata cascade policy
* `PostMetadataCascadePoliciesIDApply` - Force-apply metadata cascade policy to folder

### Metadata instances (Files)

* `DeleteFilesIDMetadataIDID` - Remove metadata instance from file
* `GetFilesIDMetadata` - List metadata instances on file
* `GetFilesIDMetadataIDID` - Get metadata instance on file
* `PostFilesIDMetadataIDID` - Create metadata instance on file
* `PutFilesIDMetadataIDID` - Update metadata instance on file

### Metadata instances (Folders)

* `DeleteFoldersIDMetadataIDID` - Remove metadata instance from folder
* `GetFoldersIDMetadata` - List metadata instances on folder
* `GetFoldersIDMetadataIDID` - Get metadata instance on folder
* `PostFoldersIDMetadataIDID` - Create metadata instance on folder
* `PutFoldersIDMetadataIDID` - Update metadata instance on folder

### Metadata templates

* `DeleteMetadataTemplatesIDIDSchema` - Remove metadata template
* `GetMetadataTemplates` - Find metadata template by instance ID
* `GetMetadataTemplatesEnterprise` - List all metadata templates for enterprise
* `GetMetadataTemplatesGlobal` - List all global metadata templates
* `GetMetadataTemplatesID` - Get metadata template by ID
* `GetMetadataTemplatesIDIDSchema` - Get metadata template by name
* `PostMetadataTemplatesSchema` - Create metadata template
* `PutMetadataTemplatesIDIDSchema` - Update metadata template

### Recent items

* `GetRecentItems` - List recently accessed items

### Retention policies

* `DeleteRetentionPoliciesID` - Delete retention policy
* `GetRetentionPolicies` - List retention policies
* `GetRetentionPoliciesID` - Get retention policy
* `PostRetentionPolicies` - Create retention policy
* `PutRetentionPoliciesID` - Update retention policy

### Retention policy assignments

* `DeleteRetentionPolicyAssignmentsID` - Remove retention policy assignment
* `GetRetentionPoliciesIDAssignments` - List retention policy assignments
* `GetRetentionPolicyAssignmentsID` - Get retention policy assignment
* `GetRetentionPolicyAssignmentsIDFileVersionsUnderRetention` - Get file versions under retention
* `GetRetentionPolicyAssignmentsIDFilesUnderRetention` - Get files under retention
* `PostRetentionPolicyAssignments` - Assign retention policy

### Search

* `GetMetadataQueryIndices` - List metadata query indices
* `PostMetadataQueriesExecuteRead` - Query files/folders by metadata

### Shared links (Files)

* `GetFilesIDNumberGetSharedLink` - Get shared link for file
* `GetSharedItems` - Find file for shared link
* `PutFilesIDNumberAddSharedLink` - Add shared link to file
* `PutFilesIDNumberRemoveSharedLink` - Remove shared link from file
* `PutFilesIDNumberUpdateSharedLink` - Update shared link on file

### Shared links (Folders)

* `GetFoldersIDNumberGetSharedLink` - Get shared link for folder
* `GetSharedItemsNumberFolders` - Find folder for shared link
* `PutFoldersIDNumberAddSharedLink` - Add shared link to folder
* `PutFoldersIDNumberRemoveSharedLink` - Remove shared link from folder
* `PutFoldersIDNumberUpdateSharedLink` - Update shared link on folder

### Shared links (Web Links)

* `GetSharedItemsNumberWebLinks` - Find web link for shared link
* `GetWebLinksIDNumberGetSharedLink` - Get shared link for web link
* `PutWebLinksIDNumberAddSharedLink` - Add shared link to web link
* `PutWebLinksIDNumberRemoveSharedLink` - Remove shared link from web link
* `PutWebLinksIDNumberUpdateSharedLink` - Update shared link on web link

### Shield information barrier reports

* `GetShieldInformationBarrierReports` - List shield information barrier reports
* `GetShieldInformationBarrierReportsID` - Get shield information barrier report by ID
* `PostShieldInformationBarrierReports` - Create shield information barrier report

### Shield information barrier segment members

* `DeleteShieldInformationBarrierSegmentMembersID` - Delete shield information barrier segment member by ID
* `GetShieldInformationBarrierSegmentMembers` - List shield information barrier segment members
* `GetShieldInformationBarrierSegmentMembersID` - Get shield information barrier segment member by ID
* `PostShieldInformationBarrierSegmentMembers` - Create shield information barrier segment member

### Shield information barrier segment restrictions

* `DeleteShieldInformationBarrierSegmentRestrictionsID` - Delete shield information barrier segment restriction by ID
* `GetShieldInformationBarrierSegmentRestrictions` - List shield information barrier segment restrictions
* `GetShieldInformationBarrierSegmentRestrictionsID` - Get shield information barrier segment restriction by ID
* `PostShieldInformationBarrierSegmentRestrictions` - Create shield information barrier segment restriction

### Shield information barrier segments

* `DeleteShieldInformationBarrierSegmentsID` - Delete shield information barrier segment
* `GetShieldInformationBarrierSegments` - List shield information barrier segments
* `GetShieldInformationBarrierSegmentsID` - Get shield information barrier segment with specified ID
* `PostShieldInformationBarrierSegments` - Create shield information barrier segment
* `PutShieldInformationBarrierSegmentsID` - Update shield information barrier segment with specified ID

### Shield information barriers

* `GetShieldInformationBarriers` - List shield information barriers
* `GetShieldInformationBarriersID` - Get shield information barrier with specified ID
* `PostShieldInformationBarriers` - Create shield information barrier
* `PostShieldInformationBarriersChangeStatus` - Add changed status of shield information barrier with specified ID

### Skills

* `DeleteFilesIDMetadataGlobalBoxSkillsCards` - Remove Box Skill cards from file
* `GetFilesIDMetadataGlobalBoxSkillsCards` - List Box Skill cards on file
* `PostFilesIDMetadataGlobalBoxSkillsCards` - Create Box Skill cards on file
* `PutFilesIDMetadataGlobalBoxSkillsCards` - Update Box Skill cards on file
* `PutSkillInvocationsID` - Update all Box Skill cards on file

### Storage policies

* `GetStoragePolicies` - List storage policies
* `GetStoragePoliciesID` - Get storage policy

### Storage policy assignments

* `DeleteStoragePolicyAssignmentsID` - Unassign storage policy
* `GetStoragePolicyAssignments` - List storage policy assignments
* `GetStoragePolicyAssignmentsID` - Get storage policy assignment
* `PostStoragePolicyAssignments` - Assign storage policy
* `PutStoragePolicyAssignmentsID` - Update storage policy assignment

### Task assignments

* `DeleteTaskAssignmentsID` - Unassign task
* `GetTaskAssignmentsID` - Get task assignment
* `GetTasksIDAssignments` - List task assignments
* `PostTaskAssignments` - Assign task
* `PutTaskAssignmentsID` - Update task assignment

### Tasks

* `DeleteTasksID` - Remove task
* `GetFilesIDTasks` - List tasks on file
* `GetTasksID` - Get task
* `PostTasks` - Create task
* `PutTasksID` - Update task

### Terms of service

* `GetTermsOfServices` - List terms of services
* `GetTermsOfServicesID` - Get terms of service
* `PostTermsOfServices` - Create terms of service
* `PutTermsOfServicesID` - Update terms of service

### Terms of service user statuses

* `GetTermsOfServiceUserStatuses` - List terms of service user statuses
* `PostTermsOfServiceUserStatuses` - Create terms of service status for new user
* `PutTermsOfServiceUserStatusesID` - Update terms of service status for existing user

### Transfer folders

* `PutUsersIDFolders0` - Transfer owned folders

### Trashed files

* `DeleteFilesIDTrash` - Permanently remove file
* `GetFilesIDTrash` - Get trashed file
* `PostFilesID` - Restore file

### Trashed folders

* `DeleteFoldersIDTrash` - Permanently remove folder
* `GetFoldersIDTrash` - Get trashed folder
* `PostFoldersID` - Restore folder

### Trashed items

* `GetFoldersTrashItems` - List trashed items

### Trashed web links

* `DeleteWebLinksIDTrash` - Permanently remove web link
* `GetWebLinksIDTrash` - Get trashed web link
* `PostWebLinksID` - Restore web link

### Uploads

* `PostFilesContent` - Upload file
* `PostFilesIDContent` - Upload file version

### Uploads (Chunked)

* `DeleteFilesUploadSessionsID` - Remove upload session
* `GetFilesUploadSessionsID` - Get upload session
* `GetFilesUploadSessionsIDParts` - List parts
* `PostFilesIDUploadSessions` - Create upload session for existing file
* `PostFilesUploadSessions` - Create upload session
* `PostFilesUploadSessionsIDCommit` - Commit upload session
* `PutFilesUploadSessionsID` - Upload part of file

### User avatars

* `DeleteUsersIDAvatar` - Delete user avatar
* `GetUsersIDAvatar` - Get user avatar
* `PostUsersIDAvatar` - Add or update user avatar

### Users

* `DeleteUsersID` - Delete user
* `GetUsers` - List enterprise users
* `GetUsersID` - Get user
* `GetUsersMe` - Get current user
* `PostUsers` - Create user
* `PostUsersTerminateSessions` - Create jobs to terminate users session
* `PutUsersID` - Update user

### Watermarks (Files)

* `DeleteFilesIDWatermark` - Remove watermark from file
* `GetFilesIDWatermark` - Get watermark on file
* `PutFilesIDWatermark` - Apply watermark to file

### Watermarks (Folders)

* `DeleteFoldersIDWatermark` - Remove watermark from folder
* `GetFoldersIDWatermark` - Get watermark for folder
* `PutFoldersIDWatermark` - Apply watermark to folder

### Web links

* `DeleteWebLinksID` - Remove web link
* `GetWebLinksID` - Get web link
* `PostWebLinks` - Create web link
* `PutWebLinksID` - Update web link

### Webhooks

* `DeleteWebhooksID` - Remove webhook
* `GetWebhooks` - List all webhooks
* `GetWebhooksID` - Get webhook
* `PostWebhooks` - Create webhook
* `PutWebhooksID` - Update webhook

### Workflows

* `GetWorkflows` - List workflows
* `PostWorkflowsIDStart` - Starts workflow based on request body

### Zip Downloads

* `GetZipDownloadsIDContent` - Download zip archive
* `GetZipDownloadsIDStatus` - Get zip download status
* `PostZipDownloads` - Create zip download

<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
