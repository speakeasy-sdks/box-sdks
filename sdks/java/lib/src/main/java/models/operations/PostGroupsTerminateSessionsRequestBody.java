package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostGroupsTerminateSessionsRequestBody {
    @JsonProperty("group_ids")
    public String[] groupIds;
    public PostGroupsTerminateSessionsRequestBody withGroupIds(String[] groupIds) {
        this.groupIds = groupIds;
        return this;
    }
}