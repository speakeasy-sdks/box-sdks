import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFoldersIdNumberUpdateSharedLinkPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;
}


export class PutFoldersIdNumberUpdateSharedLinkQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=fields" })
  fields: string;
}

export enum PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}


export class PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_edit" })
  canEdit?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_preview" })
  canPreview?: boolean;
}


// PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLink
/** 
 * The settings for the shared link to update.
**/
export class PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=password" })
  password?: string;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions;

  @SpeakeasyMetadata({ data: "json, name=unshared_at" })
  unsharedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=vanity_name" })
  vanityName?: string;
}


export class PutFoldersIdNumberUpdateSharedLinkRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLink;
}


export class PutFoldersIdNumberUpdateSharedLinkRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFoldersIdNumberUpdateSharedLinkPathParams;

  @SpeakeasyMetadata()
  queryParams: PutFoldersIdNumberUpdateSharedLinkQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutFoldersIdNumberUpdateSharedLinkRequestBody;
}


export class PutFoldersIdNumberUpdateSharedLinkResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  folder?: shared.Folder;

  @SpeakeasyMetadata()
  statusCode: number;
}
