package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Collection
 * A collection of items, including files and folders.
 * 
 * Currently, the only collection available
 * is the `favorites` collection.
 * 
 * The contents of a collection can be explored in a
 * similar way to which the contents of a folder is
 * explored.
**/
public class Collection {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collection_type")
    public CollectionCollectionTypeEnum collectionType;
    public Collection withCollectionType(CollectionCollectionTypeEnum collectionType) {
        this.collectionType = collectionType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public Collection withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public CollectionNameEnum name;
    public Collection withName(CollectionNameEnum name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public CollectionTypeEnum type;
    public Collection withType(CollectionTypeEnum type) {
        this.type = type;
        return this;
    }
}