import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostFilesIdCopyPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class PostFilesIdCopyQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


// PostFilesIdCopyRequestBodyParent
/** 
 * The destination folder to copy the file to.
**/
export class PostFilesIdCopyRequestBodyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}


export class PostFilesIdCopyRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent: PostFilesIdCopyRequestBodyParent;

  @SpeakeasyMetadata({ data: "json, name=version" })
  version?: string;
}


export class PostFilesIdCopyRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFilesIdCopyPathParams;

  @SpeakeasyMetadata()
  queryParams: PostFilesIdCopyQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFilesIdCopyRequestBody;
}


export class PostFilesIdCopyResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  file?: shared.File;

  @SpeakeasyMetadata()
  statusCode: number;
}
