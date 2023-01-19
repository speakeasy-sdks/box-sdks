import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetFileVersionRetentionsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_version_retention_id" })
  fileVersionRetentionId: string;
}


export class GetFileVersionRetentionsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetFileVersionRetentionsIdPathParams;
}


export class GetFileVersionRetentionsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  fileVersionRetention?: shared.FileVersionRetention;

  @SpeakeasyMetadata()
  statusCode: number;
}
