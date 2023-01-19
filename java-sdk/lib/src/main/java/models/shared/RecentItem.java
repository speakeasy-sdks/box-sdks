package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * RecentItem
 * A recent item accessed by a user.
**/
public class RecentItem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("interacted_at")
    public OffsetDateTime interactedAt;
    public RecentItem withInteractedAt(OffsetDateTime interactedAt) {
        this.interactedAt = interactedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interaction_shared_link")
    public String interactionSharedLink;
    public RecentItem withInteractionSharedLink(String interactionSharedLink) {
        this.interactionSharedLink = interactionSharedLink;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interaction_type")
    public RecentItemInteractionTypeEnum interactionType;
    public RecentItem withInteractionType(RecentItemInteractionTypeEnum interactionType) {
        this.interactionType = interactionType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item")
    public Object item;
    public RecentItem withItem(Object item) {
        this.item = item;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public RecentItem withType(String type) {
        this.type = type;
        return this;
    }
}