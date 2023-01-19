import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



// PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyDataClassification
/** 
 * Additional details for the classification.
**/
export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyDataClassification extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=classificationDefinition" })
  classificationDefinition?: string;

  @SpeakeasyMetadata({ data: "json, name=colorID" })
  colorID?: number;
}


// PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyData
/** 
 * The details of the updated classification.
**/
export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyData extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=classification" })
  classification?: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyDataClassification;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key: string;
}


// PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody
/** 
 * A single classification to update.
**/
export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyData;

  @SpeakeasyMetadata({ data: "json, name=enumOptionKey" })
  enumOptionKey: string;

  @SpeakeasyMetadata({ data: "json, name=fieldKey" })
  fieldKey: string;

  @SpeakeasyMetadata({ data: "json, name=op" })
  op: string;
}


export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json-patch+json", elemType: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody })
  request?: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody[];
}


export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  classificationTemplate?: shared.ClassificationTemplate;

  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
