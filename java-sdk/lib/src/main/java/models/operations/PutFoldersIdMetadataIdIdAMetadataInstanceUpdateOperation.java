package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation
 * A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
 * change to make to the metadata instance.
**/
public class PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public String from;
    public PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation withFrom(String from) {
        this.from = from;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("op")
    public PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum op;
    public PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation withOp(PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum op) {
        this.op = op;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("path")
    public String path;
    public PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation withPath(String path) {
        this.path = path;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String value;
    public PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation withValue(String value) {
        this.value = value;
        return this;
    }
}