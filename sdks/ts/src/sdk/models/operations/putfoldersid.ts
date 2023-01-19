import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFoldersIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;
}


export class PutFoldersIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class PutFoldersIdHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=if-match" })
  ifMatch?: string;
}


// PutFoldersIdRequestBodyReference
/** 
 * The bare basic reference for an object
**/
export class PutFoldersIdRequestBodyReference extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: string;
}

export enum PutFoldersIdRequestBodyFolderUploadEmailAccessEnum {
    Open = "open",
    Collaborators = "collaborators"
}


// PutFoldersIdRequestBodyFolderUploadEmail
/** 
 * The Write Folder Upload Email object
**/
export class PutFoldersIdRequestBodyFolderUploadEmail extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PutFoldersIdRequestBodyFolderUploadEmailAccessEnum;
}


// PutFoldersIdRequestBodyParent
/** 
 * The parent folder for this folder. Use this to move
 * the folder or to restore it out of the trash.
**/
export class PutFoldersIdRequestBodyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;
}

export enum PutFoldersIdRequestBodySharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}


export class PutFoldersIdRequestBodySharedLinkPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload?: boolean;
}


// PutFoldersIdRequestBodySharedLink
/** 
 * Defines a shared link for an item. Set this to `null` to remove
 * the shared link.
**/
export class PutFoldersIdRequestBodySharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PutFoldersIdRequestBodySharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=password" })
  password?: string;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: PutFoldersIdRequestBodySharedLinkPermissions;

  @SpeakeasyMetadata({ data: "json, name=unshared_at" })
  unsharedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=vanity_name" })
  vanityName?: string;
}

export enum PutFoldersIdRequestBodySyncStateEnum {
    Synced = "synced",
    NotSynced = "not_synced",
    PartiallySynced = "partially_synced"
}


export class PutFoldersIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_non_owners_invite" })
  canNonOwnersInvite?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_non_owners_view_collaborators" })
  canNonOwnersViewCollaborators?: boolean;

  @SpeakeasyMetadata({ data: "json, name=collections", elemType: PutFoldersIdRequestBodyReference })
  collections?: PutFoldersIdRequestBodyReference[];

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=folder_upload_email" })
  folderUploadEmail?: PutFoldersIdRequestBodyFolderUploadEmail;

  @SpeakeasyMetadata({ data: "json, name=is_collaboration_restricted_to_enterprise" })
  isCollaborationRestrictedToEnterprise?: boolean;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: PutFoldersIdRequestBodyParent;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: PutFoldersIdRequestBodySharedLink;

  @SpeakeasyMetadata({ data: "json, name=sync_state" })
  syncState?: PutFoldersIdRequestBodySyncStateEnum;

  @SpeakeasyMetadata({ data: "json, name=tags" })
  tags?: string[];
}


export class PutFoldersIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFoldersIdPathParams;

  @SpeakeasyMetadata()
  queryParams: PutFoldersIdQueryParams;

  @SpeakeasyMetadata()
  headers: PutFoldersIdHeaders;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutFoldersIdRequestBody;
}


export class PutFoldersIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  folder?: shared.Folder;

  @SpeakeasyMetadata()
  statusCode: number;
}
