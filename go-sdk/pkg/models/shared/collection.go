package shared

type CollectionCollectionTypeEnum string

const (
	CollectionCollectionTypeEnumFavorites CollectionCollectionTypeEnum = "favorites"
)

type CollectionNameEnum string

const (
	CollectionNameEnumFavorites CollectionNameEnum = "Favorites"
)

type CollectionTypeEnum string

const (
	CollectionTypeEnumCollection CollectionTypeEnum = "collection"
)

// Collection
// A collection of items, including files and folders.
//
// Currently, the only collection available
// is the `favorites` collection.
//
// The contents of a collection can be explored in a
// similar way to which the contents of a folder is
// explored.
type Collection struct {
	CollectionType *CollectionCollectionTypeEnum `json:"collection_type,omitempty"`
	ID             *string                       `json:"id,omitempty"`
	Name           *CollectionNameEnum           `json:"name,omitempty"`
	Type           *CollectionTypeEnum           `json:"type,omitempty"`
}
