import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FolderMini } from "./foldermini";
import { UserMini } from "./usermini";
import { FileVersionMini } from "./fileversionmini";


export enum FileItemStatusEnum {
    Active = "active",
    Trashed = "trashed",
    Deleted = "deleted"
}

export enum FileUserBaseTypeEnum {
    User = "user"
}


// FileUserBase
/** 
 * The user who last modified this file
**/
export class FileUserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FileUserBaseTypeEnum;
}

export enum FileFolderBaseTypeEnum {
    Folder = "folder"
}


// FileFolderBase
/** 
 * The folder that this file is located within.
**/
export class FileFolderBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FileFolderBaseTypeEnum;
}


// FilePathCollection
/** 
 * The tree of folders that this file is contained in,
 * starting at the root.
**/
export class FilePathCollection extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FolderMini })
  entries: FolderMini[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount: number;
}

export enum FileSharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}

export enum FileSharedLinkEffectiveAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}

export enum FileSharedLinkEffectivePermissionEnum {
    CanEdit = "can_edit",
    CanDownload = "can_download",
    CanPreview = "can_preview",
    NoAccess = "no_access"
}


// FileSharedLinkPermissions
/** 
 * Defines if this link allows a user to preview, edit, and download an item.
 * These permissions refer to the shared link only and
 * do not supersede permissions applied to the item itself.
**/
export class FileSharedLinkPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_edit" })
  canEdit: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_preview" })
  canPreview: boolean;
}


// FileSharedLink
/** 
 * The shared link for this file. This will be
 * `null` if no shared link has been created for this
 * file.
**/
export class FileSharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: FileSharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=download_count" })
  downloadCount: number;

  @SpeakeasyMetadata({ data: "json, name=download_url" })
  downloadUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=effective_access" })
  effectiveAccess: FileSharedLinkEffectiveAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=effective_permission" })
  effectivePermission: FileSharedLinkEffectivePermissionEnum;

  @SpeakeasyMetadata({ data: "json, name=is_password_enabled" })
  isPasswordEnabled: boolean;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: FileSharedLinkPermissions;

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

export enum FileTypeEnum {
    File = "file"
}


// File
/** 
 * The bare basic representation of a file, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
export class File extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=content_created_at" })
  contentCreatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=content_modified_at" })
  contentModifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description: string;

  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=file_version" })
  fileVersion?: FileVersionMini;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=item_status" })
  itemStatus: FileItemStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_by" })
  modifiedBy: FileUserBase;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy: FileUserBase;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: FileFolderBase;

  @SpeakeasyMetadata({ data: "json, name=path_collection" })
  pathCollection: FilePathCollection;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=sha1" })
  sha1: string;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: FileSharedLink;

  @SpeakeasyMetadata({ data: "json, name=size" })
  size: number;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FileTypeEnum;
}
