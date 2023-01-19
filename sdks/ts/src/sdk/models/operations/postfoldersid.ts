import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostFoldersIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;
}


export class PostFoldersIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


// PostFoldersIdRequestBodyParent
/** 
 * The parent for this item
**/
export class PostFoldersIdRequestBodyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;
}


export class PostFoldersIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: PostFoldersIdRequestBodyParent;
}


export class PostFoldersIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFoldersIdPathParams;

  @SpeakeasyMetadata()
  queryParams: PostFoldersIdQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFoldersIdRequestBody;
}


export class PostFoldersIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  trashFolderRestored?: shared.TrashFolderRestored;
}
