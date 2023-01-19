import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetFilesIdContentPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class GetFilesIdContentQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=access_token" })
  accessToken?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=version" })
  version?: string;
}


export class GetFilesIdContentHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=boxapi" })
  boxapi?: string;

  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=range" })
  range?: string;
}


export class GetFilesIdContentRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetFilesIdContentPathParams;

  @SpeakeasyMetadata()
  queryParams: GetFilesIdContentQueryParams;

  @SpeakeasyMetadata()
  headers: GetFilesIdContentHeaders;
}


export class GetFilesIdContentResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  headers: Record<string, string[]>;

  @SpeakeasyMetadata()
  statusCode: number;
}
