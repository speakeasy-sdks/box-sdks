package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrashFolderUserBase
 * The user who created this folder
**/
public class TrashFolderUserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TrashFolderUserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public TrashFolderUserBase withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public TrashFolderUserBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public TrashFolderUserBaseTypeEnum type;
    public TrashFolderUserBase withType(TrashFolderUserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}