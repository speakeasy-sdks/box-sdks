import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// UserAvatarPicUrls
/** 
 * Represents an object with user avatar URLs.
**/
export class UserAvatarPicUrls extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=large" })
  large?: string;

  @SpeakeasyMetadata({ data: "json, name=preview" })
  preview?: string;

  @SpeakeasyMetadata({ data: "json, name=small" })
  small?: string;
}


// UserAvatar
/** 
 * A resource holding URLs to the
 * avatar uploaded to a Box application.
**/
export class UserAvatar extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=pic_urls" })
  picUrls?: UserAvatarPicUrls;
}
