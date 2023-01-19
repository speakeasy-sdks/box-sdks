<!-- Start SDK Example Usage -->
```typescript
import { Boxsdk, withSecurity} from "openapi";
import { GetAuthorizeRequest, GetAuthorizeResponse } from "openapi/src/sdk/models/operations";
import { AxiosError } from "axios";

const sdk = new Boxsdk(withSecurity(
  security: {
    oAuth2Security: {
      authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
    },
  }
));
    
const req: GetAuthorizeRequest = {
  queryParams: {
    clientId: "sit",
    redirectUri: "voluptas",
    responseType: "code",
    scope: "expedita",
    state: "consequuntur",
  },
};

sdk.authorization.getAuthorize(req).then((res: GetAuthorizeResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->