<!-- Start SDK Example Usage -->
```java
package hello.world;

import .Boxsdk;
import .models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Boxsdk.Builder builder = Boxsdk.builder();

            builder.setSecurity(
                new Security() {{
                    oAuth2Security = new SchemeOAuth2Security() {{
                        authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                    }};
                }}
            );

            Boxsdk sdk = builder.build();

            GetAuthorizeRequest req = new GetAuthorizeRequest() {{
                queryParams = new GetAuthorizeQueryParams() {{
                    clientId = "sit";
                    redirectUri = "voluptas";
                    responseType = "code";
                    scope = "expedita";
                    state = "consequuntur";
                }};
            }};

            GetAuthorizeResponse res = sdk.authorization.getAuthorize(req);

            if (res.getAuthorize200TextHTMLHTMLString.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->