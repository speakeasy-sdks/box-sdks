import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PutFilesIdMetadataIdIdScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class PutFilesIdMetadataIdIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scope" })
  scope: PutFilesIdMetadataIdIdScopeEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=template_key" })
  templateKey: string;
}

export enum PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum {
    Add = "add",
    Replace = "replace",
    Remove = "remove",
    Test = "test",
    Move = "move",
    Copy = "copy"
}


// PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperation
/** 
 * A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
 * change to make to the metadata instance.
**/
export class PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperation extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=from" })
  from?: string;

  @SpeakeasyMetadata({ data: "json, name=op" })
  op?: PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum;

  @SpeakeasyMetadata({ data: "json, name=path" })
  path?: string;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: string;
}


export class PutFilesIdMetadataIdIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFilesIdMetadataIdIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json-patch+json", elemType: PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperation })
  request?: PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperation[];
}


export class PutFilesIdMetadataIdIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadata?: shared.Metadata;

  @SpeakeasyMetadata()
  statusCode: number;
}
