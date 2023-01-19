import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetFoldersIdItemsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;
}

export enum GetFoldersIdItemsDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}

export enum GetFoldersIdItemsSortEnum {
    Id = "id",
    Name = "name",
    Date = "date",
    Size = "size"
}


export class GetFoldersIdItemsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=direction" })
  direction?: GetFoldersIdItemsDirectionEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=sort" })
  sort?: GetFoldersIdItemsSortEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=usemarker" })
  usemarker?: boolean;
}


export class GetFoldersIdItemsHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=boxapi" })
  boxapi?: string;
}


export class GetFoldersIdItemsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetFoldersIdItemsPathParams;

  @SpeakeasyMetadata()
  queryParams: GetFoldersIdItemsQueryParams;

  @SpeakeasyMetadata()
  headers: GetFoldersIdItemsHeaders;
}


export class GetFoldersIdItemsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  items?: shared.Items;

  @SpeakeasyMetadata()
  statusCode: number;
}
