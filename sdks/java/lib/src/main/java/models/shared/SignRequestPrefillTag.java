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
 * SignRequestPrefillTag
 * Prefill tags are used to prefill placeholders with signer input data. Only
 * one value field can be included.
**/
public class SignRequestPrefillTag {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("checkbox_value")
    public Boolean checkboxValue;
    public SignRequestPrefillTag withCheckboxValue(Boolean checkboxValue) {
        this.checkboxValue = checkboxValue;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("date_value")
    public OffsetDateTime dateValue;
    public SignRequestPrefillTag withDateValue(OffsetDateTime dateValue) {
        this.dateValue = dateValue;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document_tag_id")
    public String documentTagId;
    public SignRequestPrefillTag withDocumentTagId(String documentTagId) {
        this.documentTagId = documentTagId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_value")
    public String textValue;
    public SignRequestPrefillTag withTextValue(String textValue) {
        this.textValue = textValue;
        return this;
    }
}