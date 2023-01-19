import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetShieldInformationBarrierSegmentMembersQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=shield_information_barrier_segment_id" })
  shieldInformationBarrierSegmentId: string;
}


export class GetShieldInformationBarrierSegmentMembers200ApplicationJson extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: shared.ShieldInformationBarrierSegmentMember })
  entries?: shared.ShieldInformationBarrierSegmentMember[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: string;
}


export class GetShieldInformationBarrierSegmentMembersRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetShieldInformationBarrierSegmentMembersQueryParams;
}


export class GetShieldInformationBarrierSegmentMembersResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  getShieldInformationBarrierSegmentMembers200ApplicationJSONObject?: GetShieldInformationBarrierSegmentMembers200ApplicationJson;
}
