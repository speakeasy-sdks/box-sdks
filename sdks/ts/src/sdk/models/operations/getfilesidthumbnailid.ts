import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetFilesIdThumbnailIdExtensionEnum {
    Png = "png",
    Jpg = "jpg"
}


export class GetFilesIdThumbnailIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=extension" })
  extension: GetFilesIdThumbnailIdExtensionEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class GetFilesIdThumbnailIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=max_height" })
  maxHeight?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=max_width" })
  maxWidth?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=min_height" })
  minHeight?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=min_width" })
  minWidth?: number;
}


export class GetFilesIdThumbnailIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetFilesIdThumbnailIdPathParams;

  @SpeakeasyMetadata()
  queryParams: GetFilesIdThumbnailIdQueryParams;
}


export class GetFilesIdThumbnailIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  headers: Record<string, string[]>;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  getFilesIdThumbnailId200ImageJpgBinaryString?: Uint8Array;

  @SpeakeasyMetadata()
  getFilesIdThumbnailId200ImagePngBinaryString?: Uint8Array;
}
