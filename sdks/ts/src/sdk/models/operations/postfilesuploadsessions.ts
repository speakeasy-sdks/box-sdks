import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const PostFilesUploadSessionsServerList = [
	"https://upload.box.com/api/2.0",
] as const;


export class PostFilesUploadSessionsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=file_name" })
  fileName: string;

  @SpeakeasyMetadata({ data: "json, name=file_size" })
  fileSize: number;

  @SpeakeasyMetadata({ data: "json, name=folder_id" })
  folderId: string;
}


export class PostFilesUploadSessionsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFilesUploadSessionsRequestBody;
}


export class PostFilesUploadSessionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  uploadSession?: shared.UploadSession;
}
