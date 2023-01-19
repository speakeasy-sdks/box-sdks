import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutWebLinksIdNumberAddSharedLinkPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=web_link_id" })
  webLinkId: string;
}


export class PutWebLinksIdNumberAddSharedLinkQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=fields" })
  fields: string;
}

export enum PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}


export class PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_edit" })
  canEdit?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_preview" })
  canPreview?: boolean;
}


// PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink
/** 
 * The settings for the shared link to create on the web link.
 * 
 * Use an empty object (`{}`) to use the default settings for shared
 * links.
**/
export class PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=password" })
  password?: string;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkPermissions;

  @SpeakeasyMetadata({ data: "json, name=unshared_at" })
  unsharedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=vanity_name" })
  vanityName?: string;
}


export class PutWebLinksIdNumberAddSharedLinkRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink;
}


export class PutWebLinksIdNumberAddSharedLinkRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutWebLinksIdNumberAddSharedLinkPathParams;

  @SpeakeasyMetadata()
  queryParams: PutWebLinksIdNumberAddSharedLinkQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutWebLinksIdNumberAddSharedLinkRequestBody;
}


export class PutWebLinksIdNumberAddSharedLinkResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  webLink?: shared.WebLink;
}
