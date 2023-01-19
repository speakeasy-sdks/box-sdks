package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileRequestUserBase
 * The user who last modified this file request.
**/
public class FileRequestUserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public FileRequestUserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public FileRequestUserBase withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public FileRequestUserBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public FileRequestUserBaseTypeEnum type;
    public FileRequestUserBase withType(FileRequestUserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}