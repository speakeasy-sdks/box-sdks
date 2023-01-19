import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetSharedItemsNumberFoldersQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class GetSharedItemsNumberFoldersHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=boxapi" })
  boxapi: string;

  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=if-none-match" })
  ifNoneMatch?: string;
}


export class GetSharedItemsNumberFoldersRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetSharedItemsNumberFoldersQueryParams;

  @SpeakeasyMetadata()
  headers: GetSharedItemsNumberFoldersHeaders;
}


export class GetSharedItemsNumberFoldersResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  folder?: shared.Folder;

  @SpeakeasyMetadata()
  statusCode: number;
}
