import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetFilesIdVersionsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_version_id" })
  fileVersionId: string;
}


export class GetFilesIdVersionsIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class GetFilesIdVersionsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetFilesIdVersionsIdPathParams;

  @SpeakeasyMetadata()
  queryParams: GetFilesIdVersionsIdQueryParams;
}


export class GetFilesIdVersionsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  fileVersion?: shared.FileVersion;

  @SpeakeasyMetadata()
  statusCode: number;
}
