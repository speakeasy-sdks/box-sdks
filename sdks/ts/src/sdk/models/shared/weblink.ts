import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FolderMini } from "./foldermini";
import { UserMini } from "./usermini";


export enum WebLinkItemStatusEnum {
    Active = "active",
    Trashed = "trashed",
    Deleted = "deleted"
}


// WebLinkPathCollection
/** 
 * The tree of folders that this web link is contained in,
 * starting at the root.
**/
export class WebLinkPathCollection extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FolderMini })
  entries: FolderMini[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount: number;
}

export enum WebLinkSharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}

export enum WebLinkSharedLinkEffectiveAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}

export enum WebLinkSharedLinkEffectivePermissionEnum {
    CanEdit = "can_edit",
    CanDownload = "can_download",
    CanPreview = "can_preview",
    NoAccess = "no_access"
}


// WebLinkSharedLinkPermissions
/** 
 * Defines if this link allows a user to preview, edit, and download an item.
 * These permissions refer to the shared link only and
 * do not supersede permissions applied to the item itself.
**/
export class WebLinkSharedLinkPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_edit" })
  canEdit: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_preview" })
  canPreview: boolean;
}


// WebLinkSharedLink
/** 
 * The shared link object for this item. Will be
 * `null` if no shared link has been created.
**/
export class WebLinkSharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: WebLinkSharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=download_count" })
  downloadCount: number;

  @SpeakeasyMetadata({ data: "json, name=download_url" })
  downloadUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=effective_access" })
  effectiveAccess: WebLinkSharedLinkEffectiveAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=effective_permission" })
  effectivePermission: WebLinkSharedLinkEffectivePermissionEnum;

  @SpeakeasyMetadata({ data: "json, name=is_password_enabled" })
  isPasswordEnabled: boolean;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: WebLinkSharedLinkPermissions;

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

export enum WebLinkTypeEnum {
    WebLink = "web_link"
}


// WebLink
/** 
 * Web links are objects that point to URLs. These objects
 * are also known as bookmarks within the Box web application.
 * 
 * Web link objects are treated similarly to file objects,
 * they will also support most actions that apply to regular files.
**/
export class WebLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=item_status" })
  itemStatus?: WebLinkItemStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_by" })
  modifiedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: FolderMini;

  @SpeakeasyMetadata({ data: "json, name=path_collection" })
  pathCollection?: WebLinkPathCollection;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: WebLinkSharedLink;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: WebLinkTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=url" })
  url?: string;
}
