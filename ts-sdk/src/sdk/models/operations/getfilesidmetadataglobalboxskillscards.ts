import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetFilesIdMetadataGlobalBoxSkillsCardsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class GetFilesIdMetadataGlobalBoxSkillsCardsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetFilesIdMetadataGlobalBoxSkillsCardsPathParams;
}


export class GetFilesIdMetadataGlobalBoxSkillsCardsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  skillCardsMetadata?: shared.SkillCardsMetadata;

  @SpeakeasyMetadata()
  statusCode: number;
}
