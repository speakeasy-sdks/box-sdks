import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum DeleteFoldersIdMetadataIdIdScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class DeleteFoldersIdMetadataIdIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scope" })
  scope: DeleteFoldersIdMetadataIdIdScopeEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=template_key" })
  templateKey: string;
}


export class DeleteFoldersIdMetadataIdIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: DeleteFoldersIdMetadataIdIdPathParams;
}


export class DeleteFoldersIdMetadataIdIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
