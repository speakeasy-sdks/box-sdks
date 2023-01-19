import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



// PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody
/** 
 * A single classification to remove.
**/
export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=enumOptionKey" })
  enumOptionKey: string;

  @SpeakeasyMetadata({ data: "json, name=fieldKey" })
  fieldKey: string;

  @SpeakeasyMetadata({ data: "json, name=op" })
  op: string;
}


export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json-patch+json", elemType: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody })
  request?: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody[];
}


export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  classificationTemplate?: shared.ClassificationTemplate;

  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
