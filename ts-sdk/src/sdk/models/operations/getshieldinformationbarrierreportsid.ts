import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetShieldInformationBarrierReportsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=shield_information_barrier_report_id" })
  shieldInformationBarrierReportId: string;
}


export class GetShieldInformationBarrierReportsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetShieldInformationBarrierReportsIdPathParams;
}


export class GetShieldInformationBarrierReportsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrierReport?: shared.ShieldInformationBarrierReport;

  @SpeakeasyMetadata()
  statusCode: number;
}
