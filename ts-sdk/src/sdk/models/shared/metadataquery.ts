import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum MetadataQueryOrderByDirectionEnum {
    AscUpper = "ASC",
    DescUpper = "DESC",
    AscLower = "asc",
    DescLower = "desc"
}


// MetadataQueryOrderBy
/** 
 * An object representing one of the metadata template fields to sort the
 * metadata query results by.
**/
export class MetadataQueryOrderBy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: MetadataQueryOrderByDirectionEnum;

  @SpeakeasyMetadata({ data: "json, name=field_key" })
  fieldKey?: string;
}


// MetadataQuery
/** 
 * Create a search using SQL-like syntax to return items that match specific
 * metadata.
**/
export class MetadataQuery extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=ancestor_folder_id" })
  ancestorFolderId: string;

  @SpeakeasyMetadata({ data: "json, name=fields" })
  fields?: string[];

  @SpeakeasyMetadata({ data: "json, name=from" })
  from: string;

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "json, name=order_by", elemType: MetadataQueryOrderBy })
  orderBy?: MetadataQueryOrderBy[];

  @SpeakeasyMetadata({ data: "json, name=query" })
  query?: string;

  @SpeakeasyMetadata({ data: "json, name=query_params" })
  queryParams?: Record<string, string>;
}
