package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FolderUserBase
 * The user who created this folder
**/
public class FolderUserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public FolderUserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public FolderUserBase withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public FolderUserBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public FolderUserBaseTypeEnum type;
    public FolderUserBase withType(FolderUserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}