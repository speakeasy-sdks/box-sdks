import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const GetZipDownloadsIdContentServerList = [
	"https://dl.boxcloud.com/2.0",
] as const;


export class GetZipDownloadsIdContentPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=zip_download_id" })
  zipDownloadId: string;
}


export class GetZipDownloadsIdContentRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata()
  pathParams: GetZipDownloadsIdContentPathParams;
}


export class GetZipDownloadsIdContentResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  headers: Record<string, string[]>;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  getZipDownloadsIdContent200ApplicationOctetStreamBinaryString?: Uint8Array;
}
