import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class SchemeOAuth2Security extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "security, name=Authorization" })
  authorization: string;
}


export class Security extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "security, scheme=true;type=oauth2" })
  oAuth2Security: SchemeOAuth2Security;
}
