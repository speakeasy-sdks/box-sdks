import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostFilesIdMetadataIdIdScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class PostFilesIdMetadataIdIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scope" })
  scope: PostFilesIdMetadataIdIdScopeEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=template_key" })
  templateKey: string;
}


export class PostFilesIdMetadataIdIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFilesIdMetadataIdIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: Record<string, string>;
}


export class PostFilesIdMetadataIdIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadata?: shared.Metadata;

  @SpeakeasyMetadata()
  statusCode: number;
}
