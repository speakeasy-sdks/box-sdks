import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostCollaborationsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=notify" })
  notify?: boolean;
}

export enum PostCollaborationsRequestBodyAccessibleByTypeEnum {
    User = "user",
    Group = "group"
}


// PostCollaborationsRequestBodyAccessibleBy
/** 
 * The user or group to give access to the item.
**/
export class PostCollaborationsRequestBodyAccessibleBy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostCollaborationsRequestBodyAccessibleByTypeEnum;
}

export enum PostCollaborationsRequestBodyItemTypeEnum {
    File = "file",
    Folder = "folder"
}


// PostCollaborationsRequestBodyItem
/** 
 * The item to attach the comment to.
**/
export class PostCollaborationsRequestBodyItem extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostCollaborationsRequestBodyItemTypeEnum;
}

export enum PostCollaborationsRequestBodyRoleEnum {
    Editor = "editor",
    Viewer = "viewer",
    Previewer = "previewer",
    Uploader = "uploader",
    PreviewerUploader = "previewer uploader",
    ViewerUploader = "viewer uploader",
    CoOwner = "co-owner"
}


export class PostCollaborationsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=accessible_by" })
  accessibleBy: PostCollaborationsRequestBodyAccessibleBy;

  @SpeakeasyMetadata({ data: "json, name=can_view_path" })
  canViewPath?: boolean;

  @SpeakeasyMetadata({ data: "json, name=expires_at" })
  expiresAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=item" })
  item: PostCollaborationsRequestBodyItem;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role: PostCollaborationsRequestBodyRoleEnum;
}


export class PostCollaborationsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: PostCollaborationsQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostCollaborationsRequestBody;
}


export class PostCollaborationsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  collaboration?: shared.Collaboration;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
