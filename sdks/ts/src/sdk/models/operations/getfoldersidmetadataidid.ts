import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetFoldersIdMetadataIdIdScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class GetFoldersIdMetadataIdIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scope" })
  scope: GetFoldersIdMetadataIdIdScopeEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=template_key" })
  templateKey: string;
}


export class GetFoldersIdMetadataIdIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetFoldersIdMetadataIdIdPathParams;
}


export class GetFoldersIdMetadataIdIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadata?: shared.Metadata;

  @SpeakeasyMetadata()
  statusCode: number;
}
