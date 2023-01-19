import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostFilesIdVersionsCurrentPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class PostFilesIdVersionsCurrentQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}

export enum PostFilesIdVersionsCurrentRequestBodyTypeEnum {
    FileVersion = "file_version"
}


// PostFilesIdVersionsCurrentRequestBody
/** 
 * The file version to promote
**/
export class PostFilesIdVersionsCurrentRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostFilesIdVersionsCurrentRequestBodyTypeEnum;
}


export class PostFilesIdVersionsCurrentRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFilesIdVersionsCurrentPathParams;

  @SpeakeasyMetadata()
  queryParams: PostFilesIdVersionsCurrentQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFilesIdVersionsCurrentRequestBody;
}


export class PostFilesIdVersionsCurrentResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  fileVersion?: shared.FileVersion;

  @SpeakeasyMetadata()
  statusCode: number;
}
