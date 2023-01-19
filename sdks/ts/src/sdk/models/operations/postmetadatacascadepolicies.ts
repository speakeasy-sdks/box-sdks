import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostMetadataCascadePoliciesRequestBodyScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class PostMetadataCascadePoliciesRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=folder_id" })
  folderId: string;

  @SpeakeasyMetadata({ data: "json, name=scope" })
  scope: PostMetadataCascadePoliciesRequestBodyScopeEnum;

  @SpeakeasyMetadata({ data: "json, name=templateKey" })
  templateKey: string;
}


export class PostMetadataCascadePoliciesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostMetadataCascadePoliciesRequestBody;
}


export class PostMetadataCascadePoliciesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  conflictError?: shared.ConflictError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadataCascadePolicy?: shared.MetadataCascadePolicy;

  @SpeakeasyMetadata()
  statusCode: number;
}
