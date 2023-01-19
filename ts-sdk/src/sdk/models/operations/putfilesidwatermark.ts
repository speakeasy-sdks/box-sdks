import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFilesIdWatermarkPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}

export enum PutFilesIdWatermarkRequestBodyWatermarkImprintEnum {
    Default = "default"
}


// PutFilesIdWatermarkRequestBodyWatermark
/** 
 * The watermark to imprint on the file
**/
export class PutFilesIdWatermarkRequestBodyWatermark extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=imprint" })
  imprint: PutFilesIdWatermarkRequestBodyWatermarkImprintEnum;
}


export class PutFilesIdWatermarkRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=watermark" })
  watermark: PutFilesIdWatermarkRequestBodyWatermark;
}


export class PutFilesIdWatermarkRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFilesIdWatermarkPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutFilesIdWatermarkRequestBody;
}


export class PutFilesIdWatermarkResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  watermark?: shared.Watermark;
}
