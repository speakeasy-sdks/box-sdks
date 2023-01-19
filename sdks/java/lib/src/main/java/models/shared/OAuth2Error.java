package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * OAuth2Error
 * An OAuth 2.0 error
**/
public class OAuth2Error {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public String error;
    public OAuth2Error withError(String error) {
        this.error = error;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error_description")
    public String errorDescription;
    public OAuth2Error withErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }
}