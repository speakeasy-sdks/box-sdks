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
 * Task
 * A task allows for file-centric workflows within Box. Users can
 * create tasks on files and assign them to other users for them to complete the
 * tasks.
**/
public class Task {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action")
    public TaskActionEnum action;
    public Task withAction(TaskActionEnum action) {
        this.action = action;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completion_rule")
    public TaskCompletionRuleEnum completionRule;
    public Task withCompletionRule(TaskCompletionRuleEnum completionRule) {
        this.completionRule = completionRule;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Task withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserMini createdBy;
    public Task withCreatedBy(UserMini createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("due_at")
    public OffsetDateTime dueAt;
    public Task withDueAt(OffsetDateTime dueAt) {
        this.dueAt = dueAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public Task withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_completed")
    public Boolean isCompleted;
    public Task withIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item")
    public FileMini item;
    public Task withItem(FileMini item) {
        this.item = item;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public Task withMessage(String message) {
        this.message = message;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("task_assignment_collection")
    public TaskAssignments taskAssignmentCollection;
    public Task withTaskAssignmentCollection(TaskAssignments taskAssignmentCollection) {
        this.taskAssignmentCollection = taskAssignmentCollection;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TaskTypeEnum type;
    public Task withType(TaskTypeEnum type) {
        this.type = type;
        return this;
    }
}