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
 * SignRequestSignerInput
 * Prefill tags are used to prefill placeholders with signer input data. Only
 * one value field can be included.
**/
public class SignRequestSignerInput {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("checkbox_value")
    public Boolean checkboxValue;
    public SignRequestSignerInput withCheckboxValue(Boolean checkboxValue) {
        this.checkboxValue = checkboxValue;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content_type")
    public SignRequestSignerInputContentTypeEnum contentType;
    public SignRequestSignerInput withContentType(SignRequestSignerInputContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("date_value")
    public OffsetDateTime dateValue;
    public SignRequestSignerInput withDateValue(OffsetDateTime dateValue) {
        this.dateValue = dateValue;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document_tag_id")
    public String documentTagId;
    public SignRequestSignerInput withDocumentTagId(String documentTagId) {
        this.documentTagId = documentTagId;
        return this;
    }
    @JsonProperty("page_index")
    public Long pageIndex;
    public SignRequestSignerInput withPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_value")
    public String textValue;
    public SignRequestSignerInput withTextValue(String textValue) {
        this.textValue = textValue;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public SignRequestSignerInputTypeEnum type;
    public SignRequestSignerInput withType(SignRequestSignerInputTypeEnum type) {
        this.type = type;
        return this;
    }
}