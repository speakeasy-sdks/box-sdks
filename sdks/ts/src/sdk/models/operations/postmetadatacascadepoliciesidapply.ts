import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostMetadataCascadePoliciesIdApplyPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=metadata_cascade_policy_id" })
  metadataCascadePolicyId: string;
}

export enum PostMetadataCascadePoliciesIdApplyRequestBodyConflictResolutionEnum {
    None = "none",
    Overwrite = "overwrite"
}


export class PostMetadataCascadePoliciesIdApplyRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=conflict_resolution" })
  conflictResolution: PostMetadataCascadePoliciesIdApplyRequestBodyConflictResolutionEnum;
}


export class PostMetadataCascadePoliciesIdApplyRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostMetadataCascadePoliciesIdApplyPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostMetadataCascadePoliciesIdApplyRequestBody;
}


export class PostMetadataCascadePoliciesIdApplyResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
