package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UserAvatar
 * A resource holding URLs to the
 * avatar uploaded to a Box application.
**/
public class UserAvatar {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pic_urls")
    public UserAvatarPicUrls picUrls;
    public UserAvatar withPicUrls(UserAvatarPicUrls picUrls) {
        this.picUrls = picUrls;
        return this;
    }
}