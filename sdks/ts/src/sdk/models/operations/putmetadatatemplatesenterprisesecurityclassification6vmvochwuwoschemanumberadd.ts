import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



// PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyDataClassification
/** 
 * Additional details for the classification.
**/
export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyDataClassification extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=classificationDefinition" })
  classificationDefinition?: string;

  @SpeakeasyMetadata({ data: "json, name=colorID" })
  colorID?: number;
}


// PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyData
/** 
 * The details of the classification to add.
**/
export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyData extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=classification" })
  classification?: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyDataClassification;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key: string;
}


// PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody
/** 
 * A single classification to add to the enterprise.
**/
export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyData;

  @SpeakeasyMetadata({ data: "json, name=fieldKey" })
  fieldKey: string;

  @SpeakeasyMetadata({ data: "json, name=op" })
  op: string;
}


export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json-patch+json", elemType: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody })
  request?: PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody[];
}


export class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  classificationTemplate?: shared.ClassificationTemplate;

  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
