import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetShieldInformationBarrierSegmentRestrictionsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=shield_information_barrier_segment_id" })
  shieldInformationBarrierSegmentId: string;
}


export class GetShieldInformationBarrierSegmentRestrictions200ApplicationJson extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: shared.ShieldInformationBarrierSegmentRestriction })
  entries?: shared.ShieldInformationBarrierSegmentRestriction[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: string;
}


export class GetShieldInformationBarrierSegmentRestrictionsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetShieldInformationBarrierSegmentRestrictionsQueryParams;
}


export class GetShieldInformationBarrierSegmentRestrictionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  getShieldInformationBarrierSegmentRestrictions200ApplicationJSONObject?: GetShieldInformationBarrierSegmentRestrictions200ApplicationJson;
}
