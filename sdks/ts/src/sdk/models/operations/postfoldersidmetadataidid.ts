import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostFoldersIdMetadataIdIdScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class PostFoldersIdMetadataIdIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scope" })
  scope: PostFoldersIdMetadataIdIdScopeEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=template_key" })
  templateKey: string;
}


export class PostFoldersIdMetadataIdIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFoldersIdMetadataIdIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: Record<string, string>;
}


export class PostFoldersIdMetadataIdIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadata?: shared.Metadata;

  @SpeakeasyMetadata()
  statusCode: number;
}
