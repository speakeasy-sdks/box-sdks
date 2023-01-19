package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileUserBase
 * The user who last modified this file
**/
public class FileUserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public FileUserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public FileUserBase withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public FileUserBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public FileUserBaseTypeEnum type;
    public FileUserBase withType(FileUserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}