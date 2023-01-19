package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrashFolderRestoredUserBase
 * The user who created this folder
**/
public class TrashFolderRestoredUserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TrashFolderRestoredUserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public TrashFolderRestoredUserBase withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public TrashFolderRestoredUserBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public TrashFolderRestoredUserBaseTypeEnum type;
    public TrashFolderRestoredUserBase withType(TrashFolderRestoredUserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}