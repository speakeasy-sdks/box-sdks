import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum CollectionCollectionTypeEnum {
    Favorites = "favorites"
}

export enum CollectionNameEnum {
    Favorites = "Favorites"
}

export enum CollectionTypeEnum {
    Collection = "collection"
}


// Collection
/** 
 * A collection of items, including files and folders.
 * 
 * Currently, the only collection available
 * is the `favorites` collection.
 * 
 * The contents of a collection can be explored in a
 * similar way to which the contents of a folder is
 * explored.
**/
export class Collection extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=collection_type" })
  collectionType?: CollectionCollectionTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: CollectionNameEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: CollectionTypeEnum;
}
