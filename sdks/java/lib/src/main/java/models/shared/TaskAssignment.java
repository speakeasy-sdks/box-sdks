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
 * TaskAssignment
 * A task assignment defines which task is assigned to which user to complete.
**/
public class TaskAssignment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("assigned_at")
    public OffsetDateTime assignedAt;
    public TaskAssignment withAssignedAt(OffsetDateTime assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assigned_by")
    public UserMini assignedBy;
    public TaskAssignment withAssignedBy(UserMini assignedBy) {
        this.assignedBy = assignedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assigned_to")
    public UserMini assignedTo;
    public TaskAssignment withAssignedTo(UserMini assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("completed_at")
    public OffsetDateTime completedAt;
    public TaskAssignment withCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TaskAssignment withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item")
    public FileMini item;
    public TaskAssignment withItem(FileMini item) {
        this.item = item;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public TaskAssignment withMessage(String message) {
        this.message = message;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("reminded_at")
    public OffsetDateTime remindedAt;
    public TaskAssignment withRemindedAt(OffsetDateTime remindedAt) {
        this.remindedAt = remindedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resolution_state")
    public TaskAssignmentResolutionStateEnum resolutionState;
    public TaskAssignment withResolutionState(TaskAssignmentResolutionStateEnum resolutionState) {
        this.resolutionState = resolutionState;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TaskAssignmentTypeEnum type;
    public TaskAssignment withType(TaskAssignmentTypeEnum type) {
        this.type = type;
        return this;
    }
}