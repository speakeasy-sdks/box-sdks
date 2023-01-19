import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const PutFilesUploadSessionsIdServerList = [
	"https://upload.box.com/api/2.0",
] as const;


export class PutFilesUploadSessionsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=upload_session_id" })
  uploadSessionId: string;
}


export class PutFilesUploadSessionsIdHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=content-range" })
  contentRange: string;

  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=digest" })
  digest: string;
}


export class PutFilesUploadSessionsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata()
  pathParams: PutFilesUploadSessionsIdPathParams;

  @SpeakeasyMetadata()
  headers: PutFilesUploadSessionsIdHeaders;

  @SpeakeasyMetadata({ data: "request, media_type=application/octet-stream" })
  request?: Uint8Array;
}


export class PutFilesUploadSessionsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  uploadedPart?: shared.UploadedPart;
}
