import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;
}

export enum PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyOpEnum {
    Replace = "replace"
}

export enum PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyPathEnum {
    RootBoxSecurityClassificationKey = "/Box__Security__Classification__Key"
}


// PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody
/** 
 * The operation to perform on the classification
 * metadata template instance. In this case, it use
 * used to replace the value stored for the
 * `Box__Security__Classification__Key` field with a new
 * value.
**/
export class PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=op" })
  op?: PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyOpEnum;

  @SpeakeasyMetadata({ data: "json, name=path" })
  path?: PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyPathEnum;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: string;
}


export class PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json-patch+json", elemType: PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody })
  request?: PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody[];
}


export class PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  classification?: shared.Classification;

  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
