import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostWebLinksIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=web_link_id" })
  webLinkId: string;
}


export class PostWebLinksIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


// PostWebLinksIdRequestBodyParent
/** 
 * The parent for this item
**/
export class PostWebLinksIdRequestBodyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;
}


export class PostWebLinksIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: PostWebLinksIdRequestBodyParent;
}


export class PostWebLinksIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostWebLinksIdPathParams;

  @SpeakeasyMetadata()
  queryParams: PostWebLinksIdQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostWebLinksIdRequestBody;
}


export class PostWebLinksIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  trashWebLinkRestored?: shared.TrashWebLinkRestored;
}
