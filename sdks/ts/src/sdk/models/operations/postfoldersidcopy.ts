import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostFoldersIdCopyPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;
}


export class PostFoldersIdCopyQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


// PostFoldersIdCopyRequestBodyParent
/** 
 * The destination folder to copy the folder to.
**/
export class PostFoldersIdCopyRequestBodyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}


export class PostFoldersIdCopyRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent: PostFoldersIdCopyRequestBodyParent;
}


export class PostFoldersIdCopyRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFoldersIdCopyPathParams;

  @SpeakeasyMetadata()
  queryParams: PostFoldersIdCopyQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFoldersIdCopyRequestBody;
}


export class PostFoldersIdCopyResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  folder?: shared.Folder;

  @SpeakeasyMetadata()
  statusCode: number;
}
