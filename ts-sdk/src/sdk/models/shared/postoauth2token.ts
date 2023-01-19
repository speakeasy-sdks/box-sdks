import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum PostOAuth2TokenActorTokenTypeEnum {
    UrnIetfParamsOauthTokenTypeIdToken = "urn:ietf:params:oauth:token-type:id_token"
}

export enum PostOAuth2TokenBoxSubjectTypeEnum {
    Enterprise = "enterprise",
    User = "user"
}

export enum PostOAuth2TokenGrantTypeEnum {
    AuthorizationCode = "authorization_code",
    RefreshToken = "refresh_token",
    ClientCredentials = "client_credentials",
    UrnIetfParamsOauthGrantTypeJwtBearer = "urn:ietf:params:oauth:grant-type:jwt-bearer",
    UrnIetfParamsOauthGrantTypeTokenExchange = "urn:ietf:params:oauth:grant-type:token-exchange"
}

export enum PostOAuth2TokenSubjectTokenTypeEnum {
    UrnIetfParamsOauthTokenTypeAccessToken = "urn:ietf:params:oauth:token-type:access_token"
}


// PostOAuth2Token
/** 
 * A request for a new OAuth 2.0 token
**/
export class PostOAuth2Token extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "form, name=actor_token;" })
  actorToken?: string;

  @SpeakeasyMetadata({ data: "form, name=actor_token_type;" })
  actorTokenType?: PostOAuth2TokenActorTokenTypeEnum;

  @SpeakeasyMetadata({ data: "form, name=assertion;" })
  assertion?: string;

  @SpeakeasyMetadata({ data: "form, name=box_shared_link;" })
  boxSharedLink?: string;

  @SpeakeasyMetadata({ data: "form, name=box_subject_id;" })
  boxSubjectId?: string;

  @SpeakeasyMetadata({ data: "form, name=box_subject_type;" })
  boxSubjectType?: PostOAuth2TokenBoxSubjectTypeEnum;

  @SpeakeasyMetadata({ data: "form, name=client_id;" })
  clientId?: string;

  @SpeakeasyMetadata({ data: "form, name=client_secret;" })
  clientSecret?: string;

  @SpeakeasyMetadata({ data: "form, name=code;" })
  code?: string;

  @SpeakeasyMetadata({ data: "form, name=grant_type;" })
  grantType: PostOAuth2TokenGrantTypeEnum;

  @SpeakeasyMetadata({ data: "form, name=refresh_token;" })
  refreshToken?: string;

  @SpeakeasyMetadata({ data: "form, name=resource;" })
  resource?: string;

  @SpeakeasyMetadata({ data: "form, name=scope;" })
  scope?: string;

  @SpeakeasyMetadata({ data: "form, name=subject_token;" })
  subjectToken?: string;

  @SpeakeasyMetadata({ data: "form, name=subject_token_type;" })
  subjectTokenType?: PostOAuth2TokenSubjectTokenTypeEnum;
}
