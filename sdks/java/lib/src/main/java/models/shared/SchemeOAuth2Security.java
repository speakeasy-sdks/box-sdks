package .models.shared;

import .utils.SpeakeasyMetadata;

public class SchemeOAuth2Security {
    @SpeakeasyMetadata("security:name=Authorization")
    public String authorization;
    public SchemeOAuth2Security withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
}