package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EventSource
 * The source file or folder that triggered an event in
 * the event stream.
**/
public class EventSource {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classification")
    public EventSourceClassification classification;
    public EventSource withClassification(EventSourceClassification classification) {
        this.classification = classification;
        return this;
    }
    @JsonProperty("item_id")
    public String itemId;
    public EventSource withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    @JsonProperty("item_name")
    public String itemName;
    public EventSource withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    @JsonProperty("item_type")
    public EventSourceItemTypeEnum itemType;
    public EventSource withItemType(EventSourceItemTypeEnum itemType) {
        this.itemType = itemType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owned_by")
    public EventSourceUserBase ownedBy;
    public EventSource withOwnedBy(EventSourceUserBase ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public EventSourceFolderBase parent;
    public EventSource withParent(EventSourceFolderBase parent) {
        this.parent = parent;
        return this;
    }
}