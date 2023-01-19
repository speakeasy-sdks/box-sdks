import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFilesIdNumberAddSharedLinkPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class PutFilesIdNumberAddSharedLinkQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=fields" })
  fields: string;
}

export enum PutFilesIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}


export class PutFilesIdNumberAddSharedLinkRequestBodySharedLinkPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_edit" })
  canEdit?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_preview" })
  canPreview?: boolean;
}


// PutFilesIdNumberAddSharedLinkRequestBodySharedLink
/** 
 * The settings for the shared link to create on the file.
 * Use an empty object (`{}`) to use the default settings for shared
 * links.
**/
export class PutFilesIdNumberAddSharedLinkRequestBodySharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PutFilesIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=password" })
  password?: string;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: PutFilesIdNumberAddSharedLinkRequestBodySharedLinkPermissions;

  @SpeakeasyMetadata({ data: "json, name=unshared_at" })
  unsharedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=vanity_name" })
  vanityName?: string;
}


export class PutFilesIdNumberAddSharedLinkRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: PutFilesIdNumberAddSharedLinkRequestBodySharedLink;
}


export class PutFilesIdNumberAddSharedLinkRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFilesIdNumberAddSharedLinkPathParams;

  @SpeakeasyMetadata()
  queryParams: PutFilesIdNumberAddSharedLinkQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutFilesIdNumberAddSharedLinkRequestBody;
}


export class PutFilesIdNumberAddSharedLinkResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  file?: shared.File;

  @SpeakeasyMetadata()
  statusCode: number;
}
