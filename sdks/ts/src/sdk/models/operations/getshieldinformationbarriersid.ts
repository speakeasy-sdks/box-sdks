import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetShieldInformationBarriersIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=shield_information_barrier_id" })
  shieldInformationBarrierId: string;
}


export class GetShieldInformationBarriersIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetShieldInformationBarriersIdPathParams;
}


export class GetShieldInformationBarriersIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrier?: shared.ShieldInformationBarrier;

  @SpeakeasyMetadata()
  statusCode: number;
}
