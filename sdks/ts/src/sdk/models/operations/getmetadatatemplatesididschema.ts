import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetMetadataTemplatesIdIdSchemaScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class GetMetadataTemplatesIdIdSchemaPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scope" })
  scope: GetMetadataTemplatesIdIdSchemaScopeEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=template_key" })
  templateKey: string;
}


export class GetMetadataTemplatesIdIdSchemaRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetMetadataTemplatesIdIdSchemaPathParams;
}


export class GetMetadataTemplatesIdIdSchemaResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadataTemplate?: shared.MetadataTemplate;

  @SpeakeasyMetadata()
  statusCode: number;
}
