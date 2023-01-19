import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetShieldInformationBarrierReportsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=shield_information_barrier_id" })
  shieldInformationBarrierId: string;
}


export class GetShieldInformationBarrierReports200ApplicationJson extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: shared.ShieldInformationBarrierReport })
  entries?: shared.ShieldInformationBarrierReport[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: string;
}


export class GetShieldInformationBarrierReportsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetShieldInformationBarrierReportsQueryParams;
}


export class GetShieldInformationBarrierReportsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  getShieldInformationBarrierReports200ApplicationJSONObject?: GetShieldInformationBarrierReports200ApplicationJson;
}
