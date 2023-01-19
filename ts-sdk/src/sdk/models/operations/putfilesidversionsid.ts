import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFilesIdVersionsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_version_id" })
  fileVersionId: string;
}


// PutFilesIdVersionsIdRequestBody
/** 
 * The file version to be
 * restored
**/
export class PutFilesIdVersionsIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: string;
}


export class PutFilesIdVersionsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFilesIdVersionsIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutFilesIdVersionsIdRequestBody;
}


export class PutFilesIdVersionsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  fileVersion?: shared.FileVersion;

  @SpeakeasyMetadata()
  statusCode: number;
}
