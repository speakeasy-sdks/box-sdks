package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUsersIdEmailAliasesRequestBody {
    @JsonProperty("email")
    public String email;
    public PostUsersIdEmailAliasesRequestBody withEmail(String email) {
        this.email = email;
        return this;
    }
}