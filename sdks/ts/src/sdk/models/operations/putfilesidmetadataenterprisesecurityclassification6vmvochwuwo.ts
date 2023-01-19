import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}

export enum PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyOpEnum {
    Replace = "replace"
}

export enum PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyPathEnum {
    RootBoxSecurityClassificationKey = "/Box__Security__Classification__Key"
}


// PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody
/** 
 * The operation to perform on the classification
 * metadata template instance. In this case, it use
 * used to replace the value stored for the
 * `Box__Security__Classification__Key` field with a new
 * value.
**/
export class PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=op" })
  op?: PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyOpEnum;

  @SpeakeasyMetadata({ data: "json, name=path" })
  path?: PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyPathEnum;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: string;
}


export class PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json-patch+json", elemType: PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody })
  request?: PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody[];
}


export class PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  classification?: shared.Classification;

  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
