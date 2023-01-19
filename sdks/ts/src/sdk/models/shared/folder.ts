import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileMini } from "./filemini";
import { FolderMini } from "./foldermini";
import { WebLinkMini } from "./weblinkmini";


export enum FolderUserBaseTypeEnum {
    User = "user"
}


// FolderUserBase
/** 
 * The user who created this folder
**/
export class FolderUserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FolderUserBaseTypeEnum;
}

export enum FolderFolderUploadEmailAccessEnum {
    Open = "open",
    Collaborators = "collaborators"
}


export class FolderFolderUploadEmail extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: FolderFolderUploadEmailAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=email" })
  email?: string;
}

export enum FolderItemsOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// FolderItemsOrder
/** 
 * The order in which a pagination is ordered
**/
export class FolderItemsOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: FolderItemsOrderDirectionEnum;
}


// FolderItems
/** 
 * A page of the items that are in the folder.
 * 
 * This field can only be requested when querying a folder's
 * information, not when querying a folder's items.
**/
export class FolderItems extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries" })
  entries?: any[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: FolderItemsOrder })
  order?: FolderItemsOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}

export enum FolderItemStatusEnum {
    Active = "active",
    Trashed = "trashed",
    Deleted = "deleted"
}

export enum FolderFolderBaseTypeEnum {
    Folder = "folder"
}


// FolderFolderBase
/** 
 * The optional folder that this folder is located within.
 * 
 * This value may be `null` for some folders such as the
 * root folder or the trash folder.
**/
export class FolderFolderBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FolderFolderBaseTypeEnum;
}


// FolderPathCollection
/** 
 * The tree of folders that this folder is contained in,
 * starting at the root.
**/
export class FolderPathCollection extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FolderMini })
  entries: FolderMini[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount: number;
}

export enum FolderSharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}

export enum FolderSharedLinkEffectiveAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}

export enum FolderSharedLinkEffectivePermissionEnum {
    CanEdit = "can_edit",
    CanDownload = "can_download",
    CanPreview = "can_preview",
    NoAccess = "no_access"
}


// FolderSharedLinkPermissions
/** 
 * Defines if this link allows a user to preview, edit, and download an item.
 * These permissions refer to the shared link only and
 * do not supersede permissions applied to the item itself.
**/
export class FolderSharedLinkPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_edit" })
  canEdit: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_preview" })
  canPreview: boolean;
}


// FolderSharedLink
/** 
 * The shared link for this folder. This will be
 * `null` if no shared link has been created for this
 * folder.
**/
export class FolderSharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: FolderSharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=download_count" })
  downloadCount: number;

  @SpeakeasyMetadata({ data: "json, name=download_url" })
  downloadUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=effective_access" })
  effectiveAccess: FolderSharedLinkEffectiveAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=effective_permission" })
  effectivePermission: FolderSharedLinkEffectivePermissionEnum;

  @SpeakeasyMetadata({ data: "json, name=is_password_enabled" })
  isPasswordEnabled: boolean;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: FolderSharedLinkPermissions;

  @SpeakeasyMetadata({ data: "json, name=preview_count" })
  previewCount: number;

  @SpeakeasyMetadata({ data: "json, name=unshared_at" })
  unsharedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=url" })
  url: string;

  @SpeakeasyMetadata({ data: "json, name=vanity_name" })
  vanityName?: string;

  @SpeakeasyMetadata({ data: "json, name=vanity_url" })
  vanityUrl?: string;
}

export enum FolderTypeEnum {
    Folder = "folder"
}


// Folder
/** 
 * The bare basic representation of a folder, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
export class Folder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=content_created_at" })
  contentCreatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=content_modified_at" })
  contentModifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy: FolderUserBase;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=folder_upload_email" })
  folderUploadEmail?: FolderFolderUploadEmail;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=item_collection" })
  itemCollection: FolderItems;

  @SpeakeasyMetadata({ data: "json, name=item_status" })
  itemStatus: FolderItemStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_by" })
  modifiedBy: FolderUserBase;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy: FolderUserBase;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: FolderFolderBase;

  @SpeakeasyMetadata({ data: "json, name=path_collection" })
  pathCollection: FolderPathCollection;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: FolderSharedLink;

  @SpeakeasyMetadata({ data: "json, name=size" })
  size: number;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FolderTypeEnum;
}
