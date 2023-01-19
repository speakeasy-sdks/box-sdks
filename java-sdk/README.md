# 

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation '::'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import .Boxsdk;
import .models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Boxsdk.Builder builder = Boxsdk.builder();

            builder.setSecurity(
                new Security() {{
                    oAuth2Security = new SchemeOAuth2Security() {{
                        authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                    }};
                }}
            );

            Boxsdk sdk = builder.build();

            GetAuthorizeRequest req = new GetAuthorizeRequest() {{
                queryParams = new GetAuthorizeQueryParams() {{
                    clientId = "sit";
                    redirectUri = "voluptas";
                    responseType = "code";
                    scope = "expedita";
                    state = "consequuntur";
                }};
            }};

            GetAuthorizeResponse res = sdk.authorization.getAuthorize(req);

            if (res.getAuthorize200TextHTMLHTMLString.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations

### Authorization

* `getAuthorize` - Authorize user
* `postOauth2Revoke` - Revoke access token
* `postOauth2Token` - Request access token
* `postOauth2TokenNumberRefresh` - Refresh access token

### Box Sign

* `getSignRequests` - List sign requests
* `getSignRequestsId` - Get sign request by ID
* `postSignRequests` - Create sign request
* `postSignRequestsIdCancel` - Cancel sign request
* `postSignRequestsIdResend` - Resend sign request

### Classifications

* `deleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema` - Delete all classifications
* `getMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema` - List all classifications
* `postMetadataTemplatesSchemaNumberClassifications` - Add initial classifications
* `putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAdd` - Add classification
* `putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDelete` - Delete classification
* `putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdate` - Update classification

### Classifications on files

* `deleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo` - Remove classification from file
* `getFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo` - Get classification on file
* `postFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo` - Add classification to file
* `putFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo` - Update classification on file

### Classifications on folders

* `deleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo` - Remove classification from folder
* `getFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo` - Get classification on folder
* `postFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo` - Add classification to folder
* `putFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo` - Update classification on folder

### Collaborations

* `deleteCollaborationsId` - Remove collaboration
* `getCollaborationsId` - Get collaboration
* `postCollaborations` - Create collaboration
* `putCollaborationsId` - Update collaboration

### Collaborations (List)

* `getCollaborations` - List pending collaborations
* `getFilesIdCollaborations` - List file collaborations
* `getFoldersIdCollaborations` - List folder collaborations
* `getGroupsIdCollaborations` - List group collaborations

### Collections

* `getCollections` - List all collections
* `getCollectionsIdItems` - List collection items

### Comments

* `deleteCommentsId` - Remove comment
* `getCommentsId` - Get comment
* `getFilesIdComments` - List file comments
* `postComments` - Create comment
* `putCommentsId` - Update comment

### Device pinners

* `deleteDevicePinnersId` - Remove device pin
* `getDevicePinnersId` - Get device pin
* `getEnterprisesIdDevicePinners` - List enterprise device pins

### Domain restrictions (User exemptions)

* `deleteCollaborationWhitelistExemptTargetsId` - Remove user from list of users exempt from domain restrictions
* `getCollaborationWhitelistExemptTargets` - List users exempt from collaboration domain restrictions
* `getCollaborationWhitelistExemptTargetsId` - Get user exempt from collaboration domain restrictions
* `postCollaborationWhitelistExemptTargets` - Create user exemption from collaboration domain restrictions

### Domain restrictions for collaborations

* `deleteCollaborationWhitelistEntriesId` - Remove domain from list of allowed collaboration domains
* `getCollaborationWhitelistEntries` - List allowed collaboration domains
* `getCollaborationWhitelistEntriesId` - Get allowed collaboration domain
* `postCollaborationWhitelistEntries` - Add domain to list of allowed collaboration domains

### Downloads

* `getFilesIdContent` - Download file

### Email aliases

* `deleteUsersIdEmailAliasesId` - Remove email alias
* `getUsersIdEmailAliases` - List user's email aliases
* `postUsersIdEmailAliases` - Create email alias

### Events

* `getEvents` - List user and enterprise events
* `optionsEvents` - Get events long poll endpoint

### File requests

* `deleteFileRequestsId` - Delete file request
* `getFileRequestsId` - Get file request
* `postFileRequestsIdCopy` - Copy file request
* `putFileRequestsId` - Update file request

### File version legal holds

* `getFileVersionLegalHolds` - List file version legal holds
* `getFileVersionLegalHoldsId` - Get file version legal hold

### File version retentions

* `getFileVersionRetentions` - List file version retentions
* `getFileVersionRetentionsId` - Get retention on file

### File versions

* `deleteFilesIdVersionsId` - Remove file version
* `getFilesIdVersions` - List all file versions
* `getFilesIdVersionsId` - Get file version
* `postFilesIdVersionsCurrent` - Promote file version
* `putFilesIdVersionsId` - Restore file version

### Files

* `deleteFilesId` - Delete file
* `getFilesId` - Get file information
* `getFilesIdThumbnailId` - Get file thumbnail
* `optionsFilesContent` - Preflight check before upload
* `postFilesIdCopy` - Copy file
* `putFilesId` - Update file

### Folder Locks

* `deleteFolderLocksId` - Delete folder lock
* `getFolderLocks` - List folder locks
* `postFolderLocks` - Create folder lock

### Folders

* `deleteFoldersId` - Delete folder
* `getFoldersId` - Get folder information
* `getFoldersIdItems` - List items in folder
* `postFolders` - Create folder
* `postFoldersIdCopy` - Copy folder
* `putFoldersId` - Update folder

### Group memberships

* `deleteGroupMembershipsId` - Remove user from group
* `getGroupMembershipsId` - Get group membership
* `getGroupsIdMemberships` - List members of group
* `getUsersIdMemberships` - List user's groups
* `postGroupMemberships` - Add user to group
* `putGroupMembershipsId` - Update group membership

### Groups

* `deleteGroupsId` - Remove group
* `getGroups` - List groups for enterprise
* `getGroupsId` - Get group
* `postGroups` - Create group
* `postGroupsTerminateSessions` - Create jobs to terminate user group session
* `putGroupsId` - Update group

### Invites

* `getInvitesId` - Get user invite status
* `postInvites` - Create user invite

### Legal hold policies

* `deleteLegalHoldPoliciesId` - Remove legal hold policy
* `getLegalHoldPolicies` - List all legal hold policies
* `getLegalHoldPoliciesId` - Get legal hold policy
* `postLegalHoldPolicies` - Create legal hold policy
* `putLegalHoldPoliciesId` - Update legal hold policy

### Legal hold policy assignments

* `deleteLegalHoldPolicyAssignmentsId` - Unassign legal hold policy
* `getLegalHoldPolicyAssignments` - List legal hold policy assignments
* `getLegalHoldPolicyAssignmentsId` - Get legal hold policy assignment
* `getLegalHoldPolicyAssignmentsIdFileVersionsOnHold` - List previous file versions for legal hold policy assignment
* `getLegalHoldPolicyAssignmentsIdFilesOnHold` - List current file versions for legal hold policy assignment
* `postLegalHoldPolicyAssignments` - Assign legal hold policy

### Metadata cascade policies

* `deleteMetadataCascadePoliciesId` - Remove metadata cascade policy
* `getMetadataCascadePolicies` - List metadata cascade policies
* `getMetadataCascadePoliciesId` - Get metadata cascade policy
* `postMetadataCascadePolicies` - Create metadata cascade policy
* `postMetadataCascadePoliciesIdApply` - Force-apply metadata cascade policy to folder

### Metadata instances (Files)

* `deleteFilesIdMetadataIdId` - Remove metadata instance from file
* `getFilesIdMetadata` - List metadata instances on file
* `getFilesIdMetadataIdId` - Get metadata instance on file
* `postFilesIdMetadataIdId` - Create metadata instance on file
* `putFilesIdMetadataIdId` - Update metadata instance on file

### Metadata instances (Folders)

* `deleteFoldersIdMetadataIdId` - Remove metadata instance from folder
* `getFoldersIdMetadata` - List metadata instances on folder
* `getFoldersIdMetadataIdId` - Get metadata instance on folder
* `postFoldersIdMetadataIdId` - Create metadata instance on folder
* `putFoldersIdMetadataIdId` - Update metadata instance on folder

### Metadata templates

* `deleteMetadataTemplatesIdIdSchema` - Remove metadata template
* `getMetadataTemplates` - Find metadata template by instance ID
* `getMetadataTemplatesEnterprise` - List all metadata templates for enterprise
* `getMetadataTemplatesGlobal` - List all global metadata templates
* `getMetadataTemplatesId` - Get metadata template by ID
* `getMetadataTemplatesIdIdSchema` - Get metadata template by name
* `postMetadataTemplatesSchema` - Create metadata template
* `putMetadataTemplatesIdIdSchema` - Update metadata template

### Recent items

* `getRecentItems` - List recently accessed items

### Retention policies

* `deleteRetentionPoliciesId` - Delete retention policy
* `getRetentionPolicies` - List retention policies
* `getRetentionPoliciesId` - Get retention policy
* `postRetentionPolicies` - Create retention policy
* `putRetentionPoliciesId` - Update retention policy

### Retention policy assignments

* `deleteRetentionPolicyAssignmentsId` - Remove retention policy assignment
* `getRetentionPoliciesIdAssignments` - List retention policy assignments
* `getRetentionPolicyAssignmentsId` - Get retention policy assignment
* `getRetentionPolicyAssignmentsIdFileVersionsUnderRetention` - Get file versions under retention
* `getRetentionPolicyAssignmentsIdFilesUnderRetention` - Get files under retention
* `postRetentionPolicyAssignments` - Assign retention policy

### Search

* `getMetadataQueryIndices` - List metadata query indices
* `postMetadataQueriesExecuteRead` - Query files/folders by metadata

### Shared links (Files)

* `getFilesIdNumberGetSharedLink` - Get shared link for file
* `getSharedItems` - Find file for shared link
* `putFilesIdNumberAddSharedLink` - Add shared link to file
* `putFilesIdNumberRemoveSharedLink` - Remove shared link from file
* `putFilesIdNumberUpdateSharedLink` - Update shared link on file

### Shared links (Folders)

* `getFoldersIdNumberGetSharedLink` - Get shared link for folder
* `getSharedItemsNumberFolders` - Find folder for shared link
* `putFoldersIdNumberAddSharedLink` - Add shared link to folder
* `putFoldersIdNumberRemoveSharedLink` - Remove shared link from folder
* `putFoldersIdNumberUpdateSharedLink` - Update shared link on folder

### Shared links (Web Links)

* `getSharedItemsNumberWebLinks` - Find web link for shared link
* `getWebLinksIdNumberGetSharedLink` - Get shared link for web link
* `putWebLinksIdNumberAddSharedLink` - Add shared link to web link
* `putWebLinksIdNumberRemoveSharedLink` - Remove shared link from web link
* `putWebLinksIdNumberUpdateSharedLink` - Update shared link on web link

### Shield information barrier reports

* `getShieldInformationBarrierReports` - List shield information barrier reports
* `getShieldInformationBarrierReportsId` - Get shield information barrier report by ID
* `postShieldInformationBarrierReports` - Create shield information barrier report

### Shield information barrier segment members

* `deleteShieldInformationBarrierSegmentMembersId` - Delete shield information barrier segment member by ID
* `getShieldInformationBarrierSegmentMembers` - List shield information barrier segment members
* `getShieldInformationBarrierSegmentMembersId` - Get shield information barrier segment member by ID
* `postShieldInformationBarrierSegmentMembers` - Create shield information barrier segment member

### Shield information barrier segment restrictions

* `deleteShieldInformationBarrierSegmentRestrictionsId` - Delete shield information barrier segment restriction by ID
* `getShieldInformationBarrierSegmentRestrictions` - List shield information barrier segment restrictions
* `getShieldInformationBarrierSegmentRestrictionsId` - Get shield information barrier segment restriction by ID
* `postShieldInformationBarrierSegmentRestrictions` - Create shield information barrier segment restriction

### Shield information barrier segments

* `deleteShieldInformationBarrierSegmentsId` - Delete shield information barrier segment
* `getShieldInformationBarrierSegments` - List shield information barrier segments
* `getShieldInformationBarrierSegmentsId` - Get shield information barrier segment with specified ID
* `postShieldInformationBarrierSegments` - Create shield information barrier segment
* `putShieldInformationBarrierSegmentsId` - Update shield information barrier segment with specified ID

### Shield information barriers

* `getShieldInformationBarriers` - List shield information barriers
* `getShieldInformationBarriersId` - Get shield information barrier with specified ID
* `postShieldInformationBarriers` - Create shield information barrier
* `postShieldInformationBarriersChangeStatus` - Add changed status of shield information barrier with specified ID

### Skills

* `deleteFilesIdMetadataGlobalBoxSkillsCards` - Remove Box Skill cards from file
* `getFilesIdMetadataGlobalBoxSkillsCards` - List Box Skill cards on file
* `postFilesIdMetadataGlobalBoxSkillsCards` - Create Box Skill cards on file
* `putFilesIdMetadataGlobalBoxSkillsCards` - Update Box Skill cards on file
* `putSkillInvocationsId` - Update all Box Skill cards on file

### Storage policies

* `getStoragePolicies` - List storage policies
* `getStoragePoliciesId` - Get storage policy

### Storage policy assignments

* `deleteStoragePolicyAssignmentsId` - Unassign storage policy
* `getStoragePolicyAssignments` - List storage policy assignments
* `getStoragePolicyAssignmentsId` - Get storage policy assignment
* `postStoragePolicyAssignments` - Assign storage policy
* `putStoragePolicyAssignmentsId` - Update storage policy assignment

### Task assignments

* `deleteTaskAssignmentsId` - Unassign task
* `getTaskAssignmentsId` - Get task assignment
* `getTasksIdAssignments` - List task assignments
* `postTaskAssignments` - Assign task
* `putTaskAssignmentsId` - Update task assignment

### Tasks

* `deleteTasksId` - Remove task
* `getFilesIdTasks` - List tasks on file
* `getTasksId` - Get task
* `postTasks` - Create task
* `putTasksId` - Update task

### Terms of service

* `getTermsOfServices` - List terms of services
* `getTermsOfServicesId` - Get terms of service
* `postTermsOfServices` - Create terms of service
* `putTermsOfServicesId` - Update terms of service

### Terms of service user statuses

* `getTermsOfServiceUserStatuses` - List terms of service user statuses
* `postTermsOfServiceUserStatuses` - Create terms of service status for new user
* `putTermsOfServiceUserStatusesId` - Update terms of service status for existing user

### Transfer folders

* `putUsersIdFolders0` - Transfer owned folders

### Trashed files

* `deleteFilesIdTrash` - Permanently remove file
* `getFilesIdTrash` - Get trashed file
* `postFilesId` - Restore file

### Trashed folders

* `deleteFoldersIdTrash` - Permanently remove folder
* `getFoldersIdTrash` - Get trashed folder
* `postFoldersId` - Restore folder

### Trashed items

* `getFoldersTrashItems` - List trashed items

### Trashed web links

* `deleteWebLinksIdTrash` - Permanently remove web link
* `getWebLinksIdTrash` - Get trashed web link
* `postWebLinksId` - Restore web link

### Uploads

* `postFilesContent` - Upload file
* `postFilesIdContent` - Upload file version

### Uploads (Chunked)

* `deleteFilesUploadSessionsId` - Remove upload session
* `getFilesUploadSessionsId` - Get upload session
* `getFilesUploadSessionsIdParts` - List parts
* `postFilesIdUploadSessions` - Create upload session for existing file
* `postFilesUploadSessions` - Create upload session
* `postFilesUploadSessionsIdCommit` - Commit upload session
* `putFilesUploadSessionsId` - Upload part of file

### User avatars

* `deleteUsersIdAvatar` - Delete user avatar
* `getUsersIdAvatar` - Get user avatar
* `postUsersIdAvatar` - Add or update user avatar

### Users

* `deleteUsersId` - Delete user
* `getUsers` - List enterprise users
* `getUsersId` - Get user
* `getUsersMe` - Get current user
* `postUsers` - Create user
* `postUsersTerminateSessions` - Create jobs to terminate users session
* `putUsersId` - Update user

### Watermarks (Files)

* `deleteFilesIdWatermark` - Remove watermark from file
* `getFilesIdWatermark` - Get watermark on file
* `putFilesIdWatermark` - Apply watermark to file

### Watermarks (Folders)

* `deleteFoldersIdWatermark` - Remove watermark from folder
* `getFoldersIdWatermark` - Get watermark for folder
* `putFoldersIdWatermark` - Apply watermark to folder

### Web links

* `deleteWebLinksId` - Remove web link
* `getWebLinksId` - Get web link
* `postWebLinks` - Create web link
* `putWebLinksId` - Update web link

### Webhooks

* `deleteWebhooksId` - Remove webhook
* `getWebhooks` - List all webhooks
* `getWebhooksId` - Get webhook
* `postWebhooks` - Create webhook
* `putWebhooksId` - Update webhook

### Workflows

* `getWorkflows` - List workflows
* `postWorkflowsIdStart` - Starts workflow based on request body

### Zip Downloads

* `getZipDownloadsIdContent` - Download zip archive
* `getZipDownloadsIdStatus` - Get zip download status
* `postZipDownloads` - Create zip download

<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
