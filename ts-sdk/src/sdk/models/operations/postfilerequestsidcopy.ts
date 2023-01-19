import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostFileRequestsIdCopyPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_request_id" })
  fileRequestId: string;
}


export class PostFileRequestsIdCopyRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFileRequestsIdCopyPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: shared.FileRequestCopyRequest;
}


export class PostFileRequestsIdCopyResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  fileRequest?: shared.FileRequest;

  @SpeakeasyMetadata()
  statusCode: number;
}
