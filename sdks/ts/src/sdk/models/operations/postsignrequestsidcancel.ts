import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostSignRequestsIdCancelPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=sign_request_id" })
  signRequestId: string;
}


export class PostSignRequestsIdCancelRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostSignRequestsIdCancelPathParams;
}


export class PostSignRequestsIdCancelResponseOutput extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  signRequest?: shared.SignRequestOutput;

  @SpeakeasyMetadata()
  statusCode: number;
}
