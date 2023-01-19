import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostSignRequestsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: shared.SignRequestCreateRequest;
}


export class PostSignRequestsResponseOutput extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  signRequest?: shared.SignRequestOutput;

  @SpeakeasyMetadata()
  statusCode: number;
}
