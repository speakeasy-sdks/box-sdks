import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutCollaborationsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=collaboration_id" })
  collaborationId: string;
}

export enum PutCollaborationsIdRequestBodyRoleEnum {
    Editor = "editor",
    Viewer = "viewer",
    Previewer = "previewer",
    Uploader = "uploader",
    PreviewerUploader = "previewer uploader",
    ViewerUploader = "viewer uploader",
    CoOwner = "co-owner",
    Owner = "owner"
}

export enum PutCollaborationsIdRequestBodyStatusEnum {
    Pending = "pending",
    Accepted = "accepted",
    Rejected = "rejected"
}


export class PutCollaborationsIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=can_view_path" })
  canViewPath?: boolean;

  @SpeakeasyMetadata({ data: "json, name=expires_at" })
  expiresAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role: PutCollaborationsIdRequestBodyRoleEnum;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: PutCollaborationsIdRequestBodyStatusEnum;
}


export class PutCollaborationsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutCollaborationsIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutCollaborationsIdRequestBody;
}


export class PutCollaborationsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  collaboration?: shared.Collaboration;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
