import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetSharedItemsNumberWebLinksQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class GetSharedItemsNumberWebLinksHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=boxapi" })
  boxapi: string;

  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=if-none-match" })
  ifNoneMatch?: string;
}


export class GetSharedItemsNumberWebLinksRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetSharedItemsNumberWebLinksQueryParams;

  @SpeakeasyMetadata()
  headers: GetSharedItemsNumberWebLinksHeaders;
}


export class GetSharedItemsNumberWebLinksResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  webLink?: shared.WebLink;
}
