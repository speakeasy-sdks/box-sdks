import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetWebLinksIdNumberGetSharedLinkPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=web_link_id" })
  webLinkId: string;
}


export class GetWebLinksIdNumberGetSharedLinkQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=fields" })
  fields: string;
}


export class GetWebLinksIdNumberGetSharedLinkRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetWebLinksIdNumberGetSharedLinkPathParams;

  @SpeakeasyMetadata()
  queryParams: GetWebLinksIdNumberGetSharedLinkQueryParams;
}


export class GetWebLinksIdNumberGetSharedLinkResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  webLink?: shared.WebLink;
}
