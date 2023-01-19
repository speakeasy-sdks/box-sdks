import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFilesIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class PutFilesIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class PutFilesIdHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=if-match" })
  ifMatch?: string;
}

export enum PutFilesIdRequestBodyLockAccessEnum {
    Lock = "lock"
}


// PutFilesIdRequestBodyLock
/** 
 * Defines a lock on an item. This prevents the item from being
 * moved, renamed, or otherwise changed by anyone other than the user
 * who created the lock.
 * 
 * Set this to `null` to remove the lock.
**/
export class PutFilesIdRequestBodyLock extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PutFilesIdRequestBodyLockAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=expires_at" })
  expiresAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=is_download_prevented" })
  isDownloadPrevented?: boolean;
}


// PutFilesIdRequestBodyParent
/** 
 * The parent for this item
**/
export class PutFilesIdRequestBodyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;
}

export enum PutFilesIdRequestBodyPermissionsCanDownloadEnum {
    Open = "open",
    Company = "company"
}


// PutFilesIdRequestBodyPermissions
/** 
 * Defines who can download a file.
**/
export class PutFilesIdRequestBodyPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload?: PutFilesIdRequestBodyPermissionsCanDownloadEnum;
}

export enum PutFilesIdRequestBodySharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}


export class PutFilesIdRequestBodySharedLinkPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload?: boolean;
}


// PutFilesIdRequestBodySharedLink
/** 
 * Defines a shared link for an item. Set this to `null` to remove
 * the shared link.
**/
export class PutFilesIdRequestBodySharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PutFilesIdRequestBodySharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=password" })
  password?: string;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: PutFilesIdRequestBodySharedLinkPermissions;

  @SpeakeasyMetadata({ data: "json, name=unshared_at" })
  unsharedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=vanity_name" })
  vanityName?: string;
}


export class PutFilesIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=disposition_at" })
  dispositionAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=lock" })
  lock?: PutFilesIdRequestBodyLock;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: PutFilesIdRequestBodyParent;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: PutFilesIdRequestBodyPermissions;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: PutFilesIdRequestBodySharedLink;

  @SpeakeasyMetadata({ data: "json, name=tags" })
  tags?: string[];
}


export class PutFilesIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFilesIdPathParams;

  @SpeakeasyMetadata()
  queryParams: PutFilesIdQueryParams;

  @SpeakeasyMetadata()
  headers: PutFilesIdHeaders;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutFilesIdRequestBody;
}


export class PutFilesIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  file?: shared.File;

  @SpeakeasyMetadata()
  statusCode: number;
}
