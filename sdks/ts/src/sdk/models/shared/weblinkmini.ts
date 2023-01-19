import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum WebLinkMiniTypeEnum {
    WebLink = "web_link"
}


// WebLinkMini
/** 
 * Web links are objects that point to URLs. These objects
 * are also known as bookmarks within the Box web application.
 * 
 * Web link objects are treated similarly to file objects,
 * they will also support most actions that apply to regular files.
**/
export class WebLinkMini extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: WebLinkMiniTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=url" })
  url?: string;
}
