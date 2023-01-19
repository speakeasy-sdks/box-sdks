<!-- Start SDK Example Usage -->
```go
package main

import (
    "openapi"
    "openapi/pkg/models/shared"
    "openapi/pkg/models/operations"
)

func main() {
    opts := []boxsdk.SDKOption{
        boxsdk.WithSecurity(
            shared.Security{
                OAuth2Security: shared.SchemeOAuth2Security{
                    Authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
                },
            }
        ),
    }

    s := boxsdk.New(opts...)
    
    req := operations.GetAuthorizeRequest{
        QueryParams: operations.GetAuthorizeQueryParams{
            ClientID: "sit",
            RedirectURI: "voluptas",
            ResponseType: "code",
            Scope: "expedita",
            State: "consequuntur",
        },
    }
    
    res, err := s.Authorization.GetAuthorize(ctx, req)
    if err != nil {
        log.Fatal(err)
    }

    if res.GetAuthorize200TextHTMLHTMLString != nil {
        // handle response
    }
```
<!-- End SDK Example Usage -->