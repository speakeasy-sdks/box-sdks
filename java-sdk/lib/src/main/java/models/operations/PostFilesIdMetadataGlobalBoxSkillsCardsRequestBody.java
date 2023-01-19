package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostFilesIdMetadataGlobalBoxSkillsCardsRequestBody {
    @JsonProperty("cards")
    public Object[] cards;
    public PostFilesIdMetadataGlobalBoxSkillsCardsRequestBody withCards(Object[] cards) {
        this.cards = cards;
        return this;
    }
}