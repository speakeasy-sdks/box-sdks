import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFoldersIdWatermarkPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;
}

export enum PutFoldersIdWatermarkRequestBodyWatermarkImprintEnum {
    Default = "default"
}


// PutFoldersIdWatermarkRequestBodyWatermark
/** 
 * The watermark to imprint on the folder
**/
export class PutFoldersIdWatermarkRequestBodyWatermark extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=imprint" })
  imprint: PutFoldersIdWatermarkRequestBodyWatermarkImprintEnum;
}


export class PutFoldersIdWatermarkRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=watermark" })
  watermark: PutFoldersIdWatermarkRequestBodyWatermark;
}


export class PutFoldersIdWatermarkRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFoldersIdWatermarkPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutFoldersIdWatermarkRequestBody;
}


export class PutFoldersIdWatermarkResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  watermark?: shared.Watermark;
}
