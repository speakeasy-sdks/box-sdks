package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetCollectionsIdItemsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection_id")
    public String collectionId;
    public GetCollectionsIdItemsPathParams withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }
}