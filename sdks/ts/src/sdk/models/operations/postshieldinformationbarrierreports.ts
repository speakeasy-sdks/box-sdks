import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostShieldInformationBarrierReportsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: shared.ShieldInformationBarrierReference;
}


export class PostShieldInformationBarrierReportsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrierReport?: shared.ShieldInformationBarrierReport;

  @SpeakeasyMetadata()
  statusCode: number;
}
