import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetMetadataQueryIndicesScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class GetMetadataQueryIndicesQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=scope" })
  scope: GetMetadataQueryIndicesScopeEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=template_key" })
  templateKey: string;
}


export class GetMetadataQueryIndicesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetMetadataQueryIndicesQueryParams;
}


export class GetMetadataQueryIndicesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadataQueryIndices?: shared.MetadataQueryIndices;

  @SpeakeasyMetadata()
  statusCode: number;
}
