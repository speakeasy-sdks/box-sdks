import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostFilesIdMetadataGlobalBoxSkillsCardsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class PostFilesIdMetadataGlobalBoxSkillsCardsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cards" })
  cards: any[];
}


export class PostFilesIdMetadataGlobalBoxSkillsCardsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostFilesIdMetadataGlobalBoxSkillsCardsPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostFilesIdMetadataGlobalBoxSkillsCardsRequestBody;
}


export class PostFilesIdMetadataGlobalBoxSkillsCardsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  skillCardsMetadata?: shared.SkillCardsMetadata;

  @SpeakeasyMetadata()
  statusCode: number;
}
