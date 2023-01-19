import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const GetFilesUploadSessionsIdPartsServerList = [
	"https://upload.box.com/api/2.0",
] as const;


export class GetFilesUploadSessionsIdPartsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=upload_session_id" })
  uploadSessionId: string;
}


export class GetFilesUploadSessionsIdPartsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=offset" })
  offset?: number;
}


export class GetFilesUploadSessionsIdPartsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata()
  pathParams: GetFilesUploadSessionsIdPartsPathParams;

  @SpeakeasyMetadata()
  queryParams: GetFilesUploadSessionsIdPartsQueryParams;
}


export class GetFilesUploadSessionsIdPartsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  uploadParts?: shared.UploadParts;
}
