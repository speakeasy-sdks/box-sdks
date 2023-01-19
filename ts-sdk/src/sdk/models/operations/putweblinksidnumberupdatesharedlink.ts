import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutWebLinksIdNumberUpdateSharedLinkPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=web_link_id" })
  webLinkId: string;
}


export class PutWebLinksIdNumberUpdateSharedLinkQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=fields" })
  fields: string;
}

export enum PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}


export class PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_download" })
  canDownload?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_edit" })
  canEdit?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_preview" })
  canPreview?: boolean;
}


// PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink
/** 
 * The settings for the shared link to update.
**/
export class PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=password" })
  password?: string;

  @SpeakeasyMetadata({ data: "json, name=permissions" })
  permissions?: PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions;

  @SpeakeasyMetadata({ data: "json, name=unshared_at" })
  unsharedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=vanity_name" })
  vanityName?: string;
}


export class PutWebLinksIdNumberUpdateSharedLinkRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink;
}


export class PutWebLinksIdNumberUpdateSharedLinkRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutWebLinksIdNumberUpdateSharedLinkPathParams;

  @SpeakeasyMetadata()
  queryParams: PutWebLinksIdNumberUpdateSharedLinkQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutWebLinksIdNumberUpdateSharedLinkRequestBody;
}


export class PutWebLinksIdNumberUpdateSharedLinkResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  webLink?: shared.WebLink;
}
