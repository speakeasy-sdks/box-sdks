package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UploadUrl
 * The details for the upload session for the file.
**/
public class UploadUrl {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("upload_token")
    public String uploadToken;
    public UploadUrl withUploadToken(String uploadToken) {
        this.uploadToken = uploadToken;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("upload_url")
    public String uploadUrl;
    public UploadUrl withUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
}