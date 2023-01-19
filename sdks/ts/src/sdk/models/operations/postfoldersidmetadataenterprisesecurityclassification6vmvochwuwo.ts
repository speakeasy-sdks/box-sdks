import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;
}


export class PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=Box__Security__Classification__Key" })
  boxSecurityClassificationKey?: string;
}


export class PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody;
}


export class PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  classification?: shared.Classification;

  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
