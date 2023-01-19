import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// PostOAuth2Revoke
/** 
 * A request to revoke an OAuth 2.0 token
**/
export class PostOAuth2Revoke extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "form, name=client_id;" })
  clientId?: string;

  @SpeakeasyMetadata({ data: "form, name=client_secret;" })
  clientSecret?: string;

  @SpeakeasyMetadata({ data: "form, name=token;" })
  token?: string;
}
