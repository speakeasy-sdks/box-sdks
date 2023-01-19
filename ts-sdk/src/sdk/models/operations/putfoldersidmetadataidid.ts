import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PutFoldersIdMetadataIdIdScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class PutFoldersIdMetadataIdIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scope" })
  scope: PutFoldersIdMetadataIdIdScopeEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=template_key" })
  templateKey: string;
}

export enum PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum {
    Add = "add",
    Replace = "replace",
    Remove = "remove",
    Test = "test",
    Move = "move",
    Copy = "copy"
}


// PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation
/** 
 * A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
 * change to make to the metadata instance.
**/
export class PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=from" })
  from?: string;

  @SpeakeasyMetadata({ data: "json, name=op" })
  op?: PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum;

  @SpeakeasyMetadata({ data: "json, name=path" })
  path?: string;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: string;
}


export class PutFoldersIdMetadataIdIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFoldersIdMetadataIdIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json-patch+json", elemType: PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation })
  request?: PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation[];
}


export class PutFoldersIdMetadataIdIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadata?: shared.Metadata;

  @SpeakeasyMetadata()
  statusCode: number;
}
