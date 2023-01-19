<!-- Start SDK Example Usage -->
```python
import boxsdk
from boxsdk.models import operations, shared

s = boxsdk.Boxsdk()
s.config_security(
    security=shared.Security(
        o_auth2_security=shared.SchemeOAuth2Security(
            authorization="Bearer YOUR_ACCESS_TOKEN_HERE",
        ),
    )
)
    
req = operations.GetAuthorizeRequest(
    query_params=operations.GetAuthorizeQueryParams(
        client_id="sit",
        redirect_uri="voluptas",
        response_type="code",
        scope="expedita",
        state="consequuntur",
    ),
)
    
res = s.authorization.get_authorize(req)

if res.get_authorize_200_text_html_html_string is not None:
    # handle response
```
<!-- End SDK Example Usage -->