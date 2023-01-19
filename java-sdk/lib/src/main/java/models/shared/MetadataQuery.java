package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataQuery
 * Create a search using SQL-like syntax to return items that match specific
 * metadata.
**/
public class MetadataQuery {
    @JsonProperty("ancestor_folder_id")
    public String ancestorFolderId;
    public MetadataQuery withAncestorFolderId(String ancestorFolderId) {
        this.ancestorFolderId = ancestorFolderId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public String[] fields;
    public MetadataQuery withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @JsonProperty("from")
    public String from;
    public MetadataQuery withFrom(String from) {
        this.from = from;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public MetadataQuery withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("marker")
    public String marker;
    public MetadataQuery withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_by")
    public MetadataQueryOrderBy[] orderBy;
    public MetadataQuery withOrderBy(MetadataQueryOrderBy[] orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query")
    public String query;
    public MetadataQuery withQuery(String query) {
        this.query = query;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query_params")
    public java.util.Map<String, String> queryParams;
    public MetadataQuery withQueryParams(java.util.Map<String, String> queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}