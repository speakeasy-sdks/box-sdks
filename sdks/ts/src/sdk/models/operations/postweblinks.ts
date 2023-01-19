import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



// PostWebLinksRequestBodyParent
/** 
 * The parent folder to create the web link within.
**/
export class PostWebLinksRequestBodyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}

export enum PostWebLinksRequestBodySharedLinkAccessEnum {
    Open = "open",
    Company = "company",
    Collaborators = "collaborators"
}


// PostWebLinksRequestBodySharedLink
/** 
 * The settings for the shared link to update.
**/
export class PostWebLinksRequestBodySharedLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access" })
  access?: PostWebLinksRequestBodySharedLinkAccessEnum;

  @SpeakeasyMetadata({ data: "json, name=password" })
  password?: string;

  @SpeakeasyMetadata({ data: "json, name=unshared_at" })
  unsharedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=vanity_name" })
  vanityName?: string;
}


export class PostWebLinksRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent: PostWebLinksRequestBodyParent;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: PostWebLinksRequestBodySharedLink;

  @SpeakeasyMetadata({ data: "json, name=url" })
  url: string;
}


export class PostWebLinksRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostWebLinksRequestBody;
}


export class PostWebLinksResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  webLink?: shared.WebLink;
}
