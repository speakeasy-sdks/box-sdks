import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;
}


export class GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  classificationTemplate?: shared.ClassificationTemplate;

  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
