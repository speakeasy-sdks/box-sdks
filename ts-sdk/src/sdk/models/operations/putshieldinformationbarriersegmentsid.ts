import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutShieldInformationBarrierSegmentsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=shield_information_barrier_segment_id" })
  shieldInformationBarrierSegmentId: string;
}


// PutShieldInformationBarrierSegmentsIdRequestBody
/** 
 * An object containing update(s) to be made on the Shield
 * Information Barrier Segment. Possible properties include
 * 'name' and 'description', the value in object is the update.
**/
export class PutShieldInformationBarrierSegmentsIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;
}


export class PutShieldInformationBarrierSegmentsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutShieldInformationBarrierSegmentsIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutShieldInformationBarrierSegmentsIdRequestBody;
}


export class PutShieldInformationBarrierSegmentsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrierSegment?: shared.ShieldInformationBarrierSegment;

  @SpeakeasyMetadata()
  statusCode: number;
}
