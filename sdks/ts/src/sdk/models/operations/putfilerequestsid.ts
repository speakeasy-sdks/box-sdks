import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFileRequestsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_request_id" })
  fileRequestId: string;
}


export class PutFileRequestsIdHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=if-match" })
  ifMatch?: string;
}


export class PutFileRequestsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFileRequestsIdPathParams;

  @SpeakeasyMetadata()
  headers: PutFileRequestsIdHeaders;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: shared.FileRequestUpdateRequest;
}


export class PutFileRequestsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  fileRequest?: shared.FileRequest;

  @SpeakeasyMetadata()
  statusCode: number;
}
