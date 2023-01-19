import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFilesIdMetadataGlobalBoxSkillsCardsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}

export enum PutFilesIdMetadataGlobalBoxSkillsCardsRequestBodyOpEnum {
    Replace = "replace"
}


// PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody
/** 
 * An operation that replaces an existing card.
**/
export class PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=op" })
  op?: PutFilesIdMetadataGlobalBoxSkillsCardsRequestBodyOpEnum;

  @SpeakeasyMetadata({ data: "json, name=path" })
  path?: string;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: any;
}


export class PutFilesIdMetadataGlobalBoxSkillsCardsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFilesIdMetadataGlobalBoxSkillsCardsPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json-patch+json", elemType: PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody })
  request?: PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody[];
}


export class PutFilesIdMetadataGlobalBoxSkillsCardsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  skillCardsMetadata?: shared.SkillCardsMetadata;

  @SpeakeasyMetadata()
  statusCode: number;
}
