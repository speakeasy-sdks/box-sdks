package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Metadata
 * The base representation of a metadata instance.
**/
public class Metadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$parent")
    public String dollarParent;
    public Metadata withDollarParent(String dollarParent) {
        this.dollarParent = dollarParent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$scope")
    public String dollarScope;
    public Metadata withDollarScope(String dollarScope) {
        this.dollarScope = dollarScope;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$template")
    public String dollarTemplate;
    public Metadata withDollarTemplate(String dollarTemplate) {
        this.dollarTemplate = dollarTemplate;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$version")
    public Long dollarVersion;
    public Metadata withDollarVersion(Long dollarVersion) {
        this.dollarVersion = dollarVersion;
        return this;
    }
}