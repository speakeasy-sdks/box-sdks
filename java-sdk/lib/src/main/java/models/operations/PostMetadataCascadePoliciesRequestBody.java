package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostMetadataCascadePoliciesRequestBody {
    @JsonProperty("folder_id")
    public String folderId;
    public PostMetadataCascadePoliciesRequestBody withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    @JsonProperty("scope")
    public PostMetadataCascadePoliciesRequestBodyScopeEnum scope;
    public PostMetadataCascadePoliciesRequestBody withScope(PostMetadataCascadePoliciesRequestBodyScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @JsonProperty("templateKey")
    public String templateKey;
    public PostMetadataCascadePoliciesRequestBody withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}