import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostUsersIdEmailAliasesPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=user_id" })
  userId: string;
}


export class PostUsersIdEmailAliasesRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=email" })
  email: string;
}


export class PostUsersIdEmailAliasesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostUsersIdEmailAliasesPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostUsersIdEmailAliasesRequestBody;
}


export class PostUsersIdEmailAliasesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  emailAlias?: shared.EmailAlias;

  @SpeakeasyMetadata()
  statusCode: number;
}
