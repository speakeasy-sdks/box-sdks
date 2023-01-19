import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class DeleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class DeleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: DeleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams;
}


export class DeleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
