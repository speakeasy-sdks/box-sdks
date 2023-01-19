# openapi

<!-- Start SDK Installation -->
## SDK Installation

```bash
pip install openapi
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```python
import boxsdk
from boxsdk.models import operations, shared

s = boxsdk.Boxsdk()
s.config_security(
    security=shared.Security(
        o_auth2_security=shared.SchemeOAuth2Security(
            authorization="Bearer YOUR_ACCESS_TOKEN_HERE",
        ),
    )
)
    
req = operations.GetAuthorizeRequest(
    query_params=operations.GetAuthorizeQueryParams(
        client_id="sit",
        redirect_uri="voluptas",
        response_type="code",
        scope="expedita",
        state="consequuntur",
    ),
)
    
res = s.authorization.get_authorize(req)

if res.get_authorize_200_text_html_html_string is not None:
    # handle response
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations

### Authorization

* `get_authorize` - Authorize user
* `post_oauth2_revoke` - Revoke access token
* `post_oauth2_token` - Request access token
* `post_oauth2_token_number_refresh` - Refresh access token

### Box Sign

* `get_sign_requests` - List sign requests
* `get_sign_requests_id` - Get sign request by ID
* `post_sign_requests` - Create sign request
* `post_sign_requests_id_cancel` - Cancel sign request
* `post_sign_requests_id_resend` - Resend sign request

### Classifications

* `delete_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema` - Delete all classifications
* `get_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema` - List all classifications
* `post_metadata_templates_schema_number_classifications` - Add initial classifications
* `put_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema_number_add` - Add classification
* `put_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema_number_delete` - Delete classification
* `put_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema_number_update` - Update classification

### Classifications on files

* `delete_files_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo` - Remove classification from file
* `get_files_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo` - Get classification on file
* `post_files_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo` - Add classification to file
* `put_files_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo` - Update classification on file

### Classifications on folders

* `delete_folders_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo` - Remove classification from folder
* `get_folders_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo` - Get classification on folder
* `post_folders_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo` - Add classification to folder
* `put_folders_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo` - Update classification on folder

### Collaborations

* `delete_collaborations_id` - Remove collaboration
* `get_collaborations_id` - Get collaboration
* `post_collaborations` - Create collaboration
* `put_collaborations_id` - Update collaboration

### Collaborations (List)

* `get_collaborations` - List pending collaborations
* `get_files_id_collaborations` - List file collaborations
* `get_folders_id_collaborations` - List folder collaborations
* `get_groups_id_collaborations` - List group collaborations

### Collections

* `get_collections` - List all collections
* `get_collections_id_items` - List collection items

### Comments

* `delete_comments_id` - Remove comment
* `get_comments_id` - Get comment
* `get_files_id_comments` - List file comments
* `post_comments` - Create comment
* `put_comments_id` - Update comment

### Device pinners

* `delete_device_pinners_id` - Remove device pin
* `get_device_pinners_id` - Get device pin
* `get_enterprises_id_device_pinners` - List enterprise device pins

### Domain restrictions (User exemptions)

* `delete_collaboration_whitelist_exempt_targets_id` - Remove user from list of users exempt from domain restrictions
* `get_collaboration_whitelist_exempt_targets` - List users exempt from collaboration domain restrictions
* `get_collaboration_whitelist_exempt_targets_id` - Get user exempt from collaboration domain restrictions
* `post_collaboration_whitelist_exempt_targets` - Create user exemption from collaboration domain restrictions

### Domain restrictions for collaborations

* `delete_collaboration_whitelist_entries_id` - Remove domain from list of allowed collaboration domains
* `get_collaboration_whitelist_entries` - List allowed collaboration domains
* `get_collaboration_whitelist_entries_id` - Get allowed collaboration domain
* `post_collaboration_whitelist_entries` - Add domain to list of allowed collaboration domains

### Downloads

* `get_files_id_content` - Download file

### Email aliases

* `delete_users_id_email_aliases_id` - Remove email alias
* `get_users_id_email_aliases` - List user's email aliases
* `post_users_id_email_aliases` - Create email alias

### Events

* `get_events` - List user and enterprise events
* `options_events` - Get events long poll endpoint

### File requests

* `delete_file_requests_id` - Delete file request
* `get_file_requests_id` - Get file request
* `post_file_requests_id_copy` - Copy file request
* `put_file_requests_id` - Update file request

### File version legal holds

* `get_file_version_legal_holds` - List file version legal holds
* `get_file_version_legal_holds_id` - Get file version legal hold

### File version retentions

* `get_file_version_retentions` - List file version retentions
* `get_file_version_retentions_id` - Get retention on file

### File versions

* `delete_files_id_versions_id` - Remove file version
* `get_files_id_versions` - List all file versions
* `get_files_id_versions_id` - Get file version
* `post_files_id_versions_current` - Promote file version
* `put_files_id_versions_id` - Restore file version

### Files

* `delete_files_id` - Delete file
* `get_files_id` - Get file information
* `get_files_id_thumbnail_id` - Get file thumbnail
* `options_files_content` - Preflight check before upload
* `post_files_id_copy` - Copy file
* `put_files_id` - Update file

### Folder Locks

* `delete_folder_locks_id` - Delete folder lock
* `get_folder_locks` - List folder locks
* `post_folder_locks` - Create folder lock

### Folders

* `delete_folders_id` - Delete folder
* `get_folders_id` - Get folder information
* `get_folders_id_items` - List items in folder
* `post_folders` - Create folder
* `post_folders_id_copy` - Copy folder
* `put_folders_id` - Update folder

### Group memberships

* `delete_group_memberships_id` - Remove user from group
* `get_group_memberships_id` - Get group membership
* `get_groups_id_memberships` - List members of group
* `get_users_id_memberships` - List user's groups
* `post_group_memberships` - Add user to group
* `put_group_memberships_id` - Update group membership

### Groups

* `delete_groups_id` - Remove group
* `get_groups` - List groups for enterprise
* `get_groups_id` - Get group
* `post_groups` - Create group
* `post_groups_terminate_sessions` - Create jobs to terminate user group session
* `put_groups_id` - Update group

### Invites

* `get_invites_id` - Get user invite status
* `post_invites` - Create user invite

### Legal hold policies

* `delete_legal_hold_policies_id` - Remove legal hold policy
* `get_legal_hold_policies` - List all legal hold policies
* `get_legal_hold_policies_id` - Get legal hold policy
* `post_legal_hold_policies` - Create legal hold policy
* `put_legal_hold_policies_id` - Update legal hold policy

### Legal hold policy assignments

* `delete_legal_hold_policy_assignments_id` - Unassign legal hold policy
* `get_legal_hold_policy_assignments` - List legal hold policy assignments
* `get_legal_hold_policy_assignments_id` - Get legal hold policy assignment
* `get_legal_hold_policy_assignments_id_file_versions_on_hold` - List previous file versions for legal hold policy assignment
* `get_legal_hold_policy_assignments_id_files_on_hold` - List current file versions for legal hold policy assignment
* `post_legal_hold_policy_assignments` - Assign legal hold policy

### Metadata cascade policies

* `delete_metadata_cascade_policies_id` - Remove metadata cascade policy
* `get_metadata_cascade_policies` - List metadata cascade policies
* `get_metadata_cascade_policies_id` - Get metadata cascade policy
* `post_metadata_cascade_policies` - Create metadata cascade policy
* `post_metadata_cascade_policies_id_apply` - Force-apply metadata cascade policy to folder

### Metadata instances (Files)

* `delete_files_id_metadata_id_id` - Remove metadata instance from file
* `get_files_id_metadata` - List metadata instances on file
* `get_files_id_metadata_id_id` - Get metadata instance on file
* `post_files_id_metadata_id_id` - Create metadata instance on file
* `put_files_id_metadata_id_id` - Update metadata instance on file

### Metadata instances (Folders)

* `delete_folders_id_metadata_id_id` - Remove metadata instance from folder
* `get_folders_id_metadata` - List metadata instances on folder
* `get_folders_id_metadata_id_id` - Get metadata instance on folder
* `post_folders_id_metadata_id_id` - Create metadata instance on folder
* `put_folders_id_metadata_id_id` - Update metadata instance on folder

### Metadata templates

* `delete_metadata_templates_id_id_schema` - Remove metadata template
* `get_metadata_templates` - Find metadata template by instance ID
* `get_metadata_templates_enterprise` - List all metadata templates for enterprise
* `get_metadata_templates_global` - List all global metadata templates
* `get_metadata_templates_id` - Get metadata template by ID
* `get_metadata_templates_id_id_schema` - Get metadata template by name
* `post_metadata_templates_schema` - Create metadata template
* `put_metadata_templates_id_id_schema` - Update metadata template

### Recent items

* `get_recent_items` - List recently accessed items

### Retention policies

* `delete_retention_policies_id` - Delete retention policy
* `get_retention_policies` - List retention policies
* `get_retention_policies_id` - Get retention policy
* `post_retention_policies` - Create retention policy
* `put_retention_policies_id` - Update retention policy

### Retention policy assignments

* `delete_retention_policy_assignments_id` - Remove retention policy assignment
* `get_retention_policies_id_assignments` - List retention policy assignments
* `get_retention_policy_assignments_id` - Get retention policy assignment
* `get_retention_policy_assignments_id_file_versions_under_retention` - Get file versions under retention
* `get_retention_policy_assignments_id_files_under_retention` - Get files under retention
* `post_retention_policy_assignments` - Assign retention policy

### Search

* `get_metadata_query_indices` - List metadata query indices
* `post_metadata_queries_execute_read` - Query files/folders by metadata

### Shared links (Files)

* `get_files_id_number_get_shared_link` - Get shared link for file
* `get_shared_items` - Find file for shared link
* `put_files_id_number_add_shared_link` - Add shared link to file
* `put_files_id_number_remove_shared_link` - Remove shared link from file
* `put_files_id_number_update_shared_link` - Update shared link on file

### Shared links (Folders)

* `get_folders_id_number_get_shared_link` - Get shared link for folder
* `get_shared_items_number_folders` - Find folder for shared link
* `put_folders_id_number_add_shared_link` - Add shared link to folder
* `put_folders_id_number_remove_shared_link` - Remove shared link from folder
* `put_folders_id_number_update_shared_link` - Update shared link on folder

### Shared links (Web Links)

* `get_shared_items_number_web_links` - Find web link for shared link
* `get_web_links_id_number_get_shared_link` - Get shared link for web link
* `put_web_links_id_number_add_shared_link` - Add shared link to web link
* `put_web_links_id_number_remove_shared_link` - Remove shared link from web link
* `put_web_links_id_number_update_shared_link` - Update shared link on web link

### Shield information barrier reports

* `get_shield_information_barrier_reports` - List shield information barrier reports
* `get_shield_information_barrier_reports_id` - Get shield information barrier report by ID
* `post_shield_information_barrier_reports` - Create shield information barrier report

### Shield information barrier segment members

* `delete_shield_information_barrier_segment_members_id` - Delete shield information barrier segment member by ID
* `get_shield_information_barrier_segment_members` - List shield information barrier segment members
* `get_shield_information_barrier_segment_members_id` - Get shield information barrier segment member by ID
* `post_shield_information_barrier_segment_members` - Create shield information barrier segment member

### Shield information barrier segment restrictions

* `delete_shield_information_barrier_segment_restrictions_id` - Delete shield information barrier segment restriction by ID
* `get_shield_information_barrier_segment_restrictions` - List shield information barrier segment restrictions
* `get_shield_information_barrier_segment_restrictions_id` - Get shield information barrier segment restriction by ID
* `post_shield_information_barrier_segment_restrictions` - Create shield information barrier segment restriction

### Shield information barrier segments

* `delete_shield_information_barrier_segments_id` - Delete shield information barrier segment
* `get_shield_information_barrier_segments` - List shield information barrier segments
* `get_shield_information_barrier_segments_id` - Get shield information barrier segment with specified ID
* `post_shield_information_barrier_segments` - Create shield information barrier segment
* `put_shield_information_barrier_segments_id` - Update shield information barrier segment with specified ID

### Shield information barriers

* `get_shield_information_barriers` - List shield information barriers
* `get_shield_information_barriers_id` - Get shield information barrier with specified ID
* `post_shield_information_barriers` - Create shield information barrier
* `post_shield_information_barriers_change_status` - Add changed status of shield information barrier with specified ID

### Skills

* `delete_files_id_metadata_global_box_skills_cards` - Remove Box Skill cards from file
* `get_files_id_metadata_global_box_skills_cards` - List Box Skill cards on file
* `post_files_id_metadata_global_box_skills_cards` - Create Box Skill cards on file
* `put_files_id_metadata_global_box_skills_cards` - Update Box Skill cards on file
* `put_skill_invocations_id` - Update all Box Skill cards on file

### Storage policies

* `get_storage_policies` - List storage policies
* `get_storage_policies_id` - Get storage policy

### Storage policy assignments

* `delete_storage_policy_assignments_id` - Unassign storage policy
* `get_storage_policy_assignments` - List storage policy assignments
* `get_storage_policy_assignments_id` - Get storage policy assignment
* `post_storage_policy_assignments` - Assign storage policy
* `put_storage_policy_assignments_id` - Update storage policy assignment

### Task assignments

* `delete_task_assignments_id` - Unassign task
* `get_task_assignments_id` - Get task assignment
* `get_tasks_id_assignments` - List task assignments
* `post_task_assignments` - Assign task
* `put_task_assignments_id` - Update task assignment

### Tasks

* `delete_tasks_id` - Remove task
* `get_files_id_tasks` - List tasks on file
* `get_tasks_id` - Get task
* `post_tasks` - Create task
* `put_tasks_id` - Update task

### Terms of service

* `get_terms_of_services` - List terms of services
* `get_terms_of_services_id` - Get terms of service
* `post_terms_of_services` - Create terms of service
* `put_terms_of_services_id` - Update terms of service

### Terms of service user statuses

* `get_terms_of_service_user_statuses` - List terms of service user statuses
* `post_terms_of_service_user_statuses` - Create terms of service status for new user
* `put_terms_of_service_user_statuses_id` - Update terms of service status for existing user

### Transfer folders

* `put_users_id_folders_0` - Transfer owned folders

### Trashed files

* `delete_files_id_trash` - Permanently remove file
* `get_files_id_trash` - Get trashed file
* `post_files_id` - Restore file

### Trashed folders

* `delete_folders_id_trash` - Permanently remove folder
* `get_folders_id_trash` - Get trashed folder
* `post_folders_id` - Restore folder

### Trashed items

* `get_folders_trash_items` - List trashed items

### Trashed web links

* `delete_web_links_id_trash` - Permanently remove web link
* `get_web_links_id_trash` - Get trashed web link
* `post_web_links_id` - Restore web link

### Uploads

* `post_files_content` - Upload file
* `post_files_id_content` - Upload file version

### Uploads (Chunked)

* `delete_files_upload_sessions_id` - Remove upload session
* `get_files_upload_sessions_id` - Get upload session
* `get_files_upload_sessions_id_parts` - List parts
* `post_files_id_upload_sessions` - Create upload session for existing file
* `post_files_upload_sessions` - Create upload session
* `post_files_upload_sessions_id_commit` - Commit upload session
* `put_files_upload_sessions_id` - Upload part of file

### User avatars

* `delete_users_id_avatar` - Delete user avatar
* `get_users_id_avatar` - Get user avatar
* `post_users_id_avatar` - Add or update user avatar

### Users

* `delete_users_id` - Delete user
* `get_users` - List enterprise users
* `get_users_id` - Get user
* `get_users_me` - Get current user
* `post_users` - Create user
* `post_users_terminate_sessions` - Create jobs to terminate users session
* `put_users_id` - Update user

### Watermarks (Files)

* `delete_files_id_watermark` - Remove watermark from file
* `get_files_id_watermark` - Get watermark on file
* `put_files_id_watermark` - Apply watermark to file

### Watermarks (Folders)

* `delete_folders_id_watermark` - Remove watermark from folder
* `get_folders_id_watermark` - Get watermark for folder
* `put_folders_id_watermark` - Apply watermark to folder

### Web links

* `delete_web_links_id` - Remove web link
* `get_web_links_id` - Get web link
* `post_web_links` - Create web link
* `put_web_links_id` - Update web link

### Webhooks

* `delete_webhooks_id` - Remove webhook
* `get_webhooks` - List all webhooks
* `get_webhooks_id` - Get webhook
* `post_webhooks` - Create webhook
* `put_webhooks_id` - Update webhook

### Workflows

* `get_workflows` - List workflows
* `post_workflows_id_start` - Starts workflow based on request body

### Zip Downloads

* `get_zip_downloads_id_content` - Download zip archive
* `get_zip_downloads_id_status` - Get zip download status
* `post_zip_downloads` - Create zip download

<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
