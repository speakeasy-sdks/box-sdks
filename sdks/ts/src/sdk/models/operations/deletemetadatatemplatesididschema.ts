import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum DeleteMetadataTemplatesIdIdSchemaScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class DeleteMetadataTemplatesIdIdSchemaPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scope" })
  scope: DeleteMetadataTemplatesIdIdSchemaScopeEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=template_key" })
  templateKey: string;
}


export class DeleteMetadataTemplatesIdIdSchemaRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: DeleteMetadataTemplatesIdIdSchemaPathParams;
}


export class DeleteMetadataTemplatesIdIdSchemaResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
