package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UserAvatarPicUrls
 * Represents an object with user avatar URLs.
**/
public class UserAvatarPicUrls {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("large")
    public String large;
    public UserAvatarPicUrls withLarge(String large) {
        this.large = large;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preview")
    public String preview;
    public UserAvatarPicUrls withPreview(String preview) {
        this.preview = preview;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("small")
    public String small;
    public UserAvatarPicUrls withSmall(String small) {
        this.small = small;
        return this;
    }
}