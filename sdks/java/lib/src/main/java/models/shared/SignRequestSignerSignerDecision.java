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
 * SignRequestSignerSignerDecision
 * Final decision made by the signer
**/
public class SignRequestSignerSignerDecision {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("finalized_at")
    public OffsetDateTime finalizedAt;
    public SignRequestSignerSignerDecision withFinalizedAt(OffsetDateTime finalizedAt) {
        this.finalizedAt = finalizedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public SignRequestSignerSignerDecisionTypeEnum type;
    public SignRequestSignerSignerDecision withType(SignRequestSignerSignerDecisionTypeEnum type) {
        this.type = type;
        return this;
    }
}