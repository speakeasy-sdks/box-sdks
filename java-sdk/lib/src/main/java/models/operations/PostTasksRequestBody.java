package .models.operations;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

public class PostTasksRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action")
    public PostTasksRequestBodyActionEnum action;
    public PostTasksRequestBody withAction(PostTasksRequestBodyActionEnum action) {
        this.action = action;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completion_rule")
    public PostTasksRequestBodyCompletionRuleEnum completionRule;
    public PostTasksRequestBody withCompletionRule(PostTasksRequestBodyCompletionRuleEnum completionRule) {
        this.completionRule = completionRule;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("due_at")
    public OffsetDateTime dueAt;
    public PostTasksRequestBody withDueAt(OffsetDateTime dueAt) {
        this.dueAt = dueAt;
        return this;
    }
    @JsonProperty("item")
    public PostTasksRequestBodyItem item;
    public PostTasksRequestBody withItem(PostTasksRequestBodyItem item) {
        this.item = item;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public PostTasksRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }
}