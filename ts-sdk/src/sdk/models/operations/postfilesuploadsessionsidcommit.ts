import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const PostFilesUploadSessionsIdCommitServerList = [
	"https://upload.box.com/api/2.0",
] as const;


export class PostFilesUploadSessionsIdCommitPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=upload_session_id" })
  uploadSessionId: string;
}


export class PostFilesUploadSessionsIdCommitHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=digest" })
  digest: string;

  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=if-match" })
  ifMatch?: string;

  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=if-none-match" })
  ifNoneMatch?: string;
}


export class PostFilesUploadSessionsIdCommitRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=parts", elemType: shared.UploadPart })
  parts: shared.UploadPart[];
}


export class PostFilesUploadSessionsIdCommitRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata()
  pathParams: PostFilesUploadSessionsIdCommitPathParams;

  @SpeakeasyMetadata()
  headers: PostFilesUploadSessionsIdCommitHeaders;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFilesUploadSessionsIdCommitRequestBody;
}


export class PostFilesUploadSessionsIdCommitResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  files?: shared.Files;

  @SpeakeasyMetadata()
  headers: Record<string, string[]>;

  @SpeakeasyMetadata()
  statusCode: number;
}
