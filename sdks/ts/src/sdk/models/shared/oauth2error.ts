import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// OAuth2Error
/** 
 * An OAuth 2.0 error
**/
export class OAuth2Error extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=error" })
  error?: string;

  @SpeakeasyMetadata({ data: "json, name=error_description" })
  errorDescription?: string;
}
