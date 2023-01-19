import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



// PostFolderLocksRequestBodyFolder
/** 
 * The folder to apply the lock to.
**/
export class PostFolderLocksRequestBodyFolder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: string;
}


// PostFolderLocksRequestBodyLockedOperations
/** 
 * The operations to lock for the folder. If `locked_operations` is
 * included in the request, both `move` and `delete` must also be
 * included and both set to `true`.
**/
export class PostFolderLocksRequestBodyLockedOperations extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=delete" })
  delete: boolean;

  @SpeakeasyMetadata({ data: "json, name=move" })
  move: boolean;
}


export class PostFolderLocksRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=folder" })
  folder: PostFolderLocksRequestBodyFolder;

  @SpeakeasyMetadata({ data: "json, name=locked_operations" })
  lockedOperations?: PostFolderLocksRequestBodyLockedOperations;
}


export class PostFolderLocksRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFolderLocksRequestBody;
}


export class PostFolderLocksResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  folderLock?: shared.FolderLock;

  @SpeakeasyMetadata()
  statusCode: number;
}
