import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";

export const GetAuthorizeServerList = [
	"https://account.box.com/api/oauth2",
] as const;

export enum GetAuthorizeResponseTypeEnum {
    Code = "code"
}


export class GetAuthorizeQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=client_id" })
  clientId: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=redirect_uri" })
  redirectUri?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=response_type" })
  responseType: GetAuthorizeResponseTypeEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=scope" })
  scope?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=state" })
  state?: string;
}


export class GetAuthorizeRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata()
  queryParams: GetAuthorizeQueryParams;
}


export class GetAuthorizeResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  getAuthorize200TextHTMLHTMLString?: string;

  @SpeakeasyMetadata()
  getAuthorizeDefaultTextHTMLHTMLString?: string;
}
