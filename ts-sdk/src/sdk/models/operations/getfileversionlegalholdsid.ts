import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetFileVersionLegalHoldsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_version_legal_hold_id" })
  fileVersionLegalHoldId: string;
}


export class GetFileVersionLegalHoldsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetFileVersionLegalHoldsIdPathParams;
}


export class GetFileVersionLegalHoldsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  fileVersionLegalHold?: shared.FileVersionLegalHold;

  @SpeakeasyMetadata()
  statusCode: number;
}
