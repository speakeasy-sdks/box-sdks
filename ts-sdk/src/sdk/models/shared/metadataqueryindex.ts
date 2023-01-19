import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum MetadataQueryIndexFieldsSortDirectionEnum {
    Asc = "asc",
    Desc = "desc"
}


// MetadataQueryIndexFields
/** 
 * The field which makes up the index.
**/
export class MetadataQueryIndexFields extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=key" })
  key?: string;

  @SpeakeasyMetadata({ data: "json, name=sort_direction" })
  sortDirection?: MetadataQueryIndexFieldsSortDirectionEnum;
}

export enum MetadataQueryIndexStatusEnum {
    Building = "building",
    Active = "active",
    Disabled = "disabled"
}


// MetadataQueryIndex
/** 
 * A metadata query index
**/
export class MetadataQueryIndex extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=fields", elemType: MetadataQueryIndexFields })
  fields?: MetadataQueryIndexFields[];

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status: MetadataQueryIndexStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: string;
}
