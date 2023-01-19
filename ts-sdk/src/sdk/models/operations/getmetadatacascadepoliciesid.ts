import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetMetadataCascadePoliciesIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=metadata_cascade_policy_id" })
  metadataCascadePolicyId: string;
}


export class GetMetadataCascadePoliciesIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetMetadataCascadePoliciesIdPathParams;
}


export class GetMetadataCascadePoliciesIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadataCascadePolicy?: shared.MetadataCascadePolicy;

  @SpeakeasyMetadata()
  statusCode: number;
}
