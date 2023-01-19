import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileScope } from "./filescope";


export enum AccessTokenIssuedTokenTypeEnum {
    UrnIetfParamsOauthTokenTypeAccessToken = "urn:ietf:params:oauth:token-type:access_token"
}

export enum AccessTokenTokenTypeEnum {
    Bearer = "bearer"
}


// AccessToken
/** 
 * A token that can be used to make authenticated API calls.
**/
export class AccessToken extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=access_token" })
  accessToken?: string;

  @SpeakeasyMetadata({ data: "json, name=expires_in" })
  expiresIn?: number;

  @SpeakeasyMetadata({ data: "json, name=issued_token_type" })
  issuedTokenType?: AccessTokenIssuedTokenTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=refresh_token" })
  refreshToken?: string;

  @SpeakeasyMetadata({ data: "json, name=restricted_to", elemType: FileScope })
  restrictedTo?: FileScope[];

  @SpeakeasyMetadata({ data: "json, name=token_type" })
  tokenType?: AccessTokenTokenTypeEnum;
}
