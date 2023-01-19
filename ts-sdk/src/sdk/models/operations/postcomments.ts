import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostCommentsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}

export enum PostCommentsRequestBodyItemTypeEnum {
    File = "file",
    Comment = "comment"
}


// PostCommentsRequestBodyItem
/** 
 * The item to attach the comment to.
**/
export class PostCommentsRequestBodyItem extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostCommentsRequestBodyItemTypeEnum;
}


export class PostCommentsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=item" })
  item?: PostCommentsRequestBodyItem;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message: string;

  @SpeakeasyMetadata({ data: "json, name=tagged_message" })
  taggedMessage?: string;
}


export class PostCommentsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: PostCommentsQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostCommentsRequestBody;
}


export class PostCommentsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  comment?: shared.Comment;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
