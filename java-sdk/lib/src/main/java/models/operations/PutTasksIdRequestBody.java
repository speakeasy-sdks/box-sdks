package .models.operations;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

public class PutTasksIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action")
    public PutTasksIdRequestBodyActionEnum action;
    public PutTasksIdRequestBody withAction(PutTasksIdRequestBodyActionEnum action) {
        this.action = action;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completion_rule")
    public PutTasksIdRequestBodyCompletionRuleEnum completionRule;
    public PutTasksIdRequestBody withCompletionRule(PutTasksIdRequestBodyCompletionRuleEnum completionRule) {
        this.completionRule = completionRule;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("due_at")
    public OffsetDateTime dueAt;
    public PutTasksIdRequestBody withDueAt(OffsetDateTime dueAt) {
        this.dueAt = dueAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public PutTasksIdRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }
}