import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostFoldersQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}

export enum PostFoldersRequestBodyFolderUploadEmailAccessEnum {
    Open = "open",
    Collaborators = "collaborators"
}


// PostFoldersRequestBodyFolderUploadEmail
/** 
 * The Write Folder Upload Email object
**/
export class PostFoldersRequestBodyFolderUploadEmail extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PostFoldersRequestBodyFolderUploadEmailAccessEnum;
}


// PostFoldersRequestBodyParent
/** 
 * The parent folder to create the new folder within.
**/
export class PostFoldersRequestBodyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}

export enum PostFoldersRequestBodySyncStateEnum {
    Synced = "synced",
    NotSynced = "not_synced",
    PartiallySynced = "partially_synced"
}


export class PostFoldersRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=folder_upload_email" })
  folderUploadEmail?: PostFoldersRequestBodyFolderUploadEmail;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent: PostFoldersRequestBodyParent;

  @SpeakeasyMetadata({ data: "json, name=sync_state" })
  syncState?: PostFoldersRequestBodySyncStateEnum;
}


export class PostFoldersRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: PostFoldersQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFoldersRequestBody;
}


export class PostFoldersResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  folder?: shared.Folder;

  @SpeakeasyMetadata()
  statusCode: number;
}
