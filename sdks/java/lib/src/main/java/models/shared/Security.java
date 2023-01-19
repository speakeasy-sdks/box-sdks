package .models.shared;

import .utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=oauth2")
    public SchemeOAuth2Security oAuth2Security;
    public Security withOAuth2Security(SchemeOAuth2Security oAuth2Security) {
        this.oAuth2Security = oAuth2Security;
        return this;
    }
}