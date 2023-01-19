import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=Box__Security__Classification__Key" })
  boxSecurityClassificationKey?: string;
}


export class PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody;
}


export class PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  classification?: shared.Classification;

  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
