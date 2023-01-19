import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetFoldersTrashItemsDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}

export enum GetFoldersTrashItemsSortEnum {
    Id = "id",
    Name = "name",
    Date = "date",
    Size = "size"
}


export class GetFoldersTrashItemsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=direction" })
  direction?: GetFoldersTrashItemsDirectionEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=sort" })
  sort?: GetFoldersTrashItemsSortEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=usemarker" })
  usemarker?: boolean;
}


export class GetFoldersTrashItemsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetFoldersTrashItemsQueryParams;
}


export class GetFoldersTrashItemsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  items?: shared.Items;

  @SpeakeasyMetadata()
  statusCode: number;
}
