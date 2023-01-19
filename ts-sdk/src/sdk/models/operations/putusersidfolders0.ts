import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutUsersIdFolders0PathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=user_id" })
  userId: string;
}


export class PutUsersIdFolders0QueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=notify" })
  notify?: boolean;
}


// PutUsersIdFolders0RequestBodyOwnedBy
/** 
 * The user who the folder will be transferred to
**/
export class PutUsersIdFolders0RequestBodyOwnedBy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}


export class PutUsersIdFolders0RequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy: PutUsersIdFolders0RequestBodyOwnedBy;
}


export class PutUsersIdFolders0Request extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutUsersIdFolders0PathParams;

  @SpeakeasyMetadata()
  queryParams: PutUsersIdFolders0QueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutUsersIdFolders0RequestBody;
}


export class PutUsersIdFolders0Response extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  folder?: shared.Folder;

  @SpeakeasyMetadata()
  statusCode: number;
}
