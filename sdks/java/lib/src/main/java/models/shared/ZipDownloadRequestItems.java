package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ZipDownloadRequestItems
 * An item to add to the `zip` archive. This can be a file or a folder.
**/
public class ZipDownloadRequestItems {
    @JsonProperty("id")
    public String id;
    public ZipDownloadRequestItems withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public ZipDownloadRequestItemsTypeEnum type;
    public ZipDownloadRequestItems withType(ZipDownloadRequestItemsTypeEnum type) {
        this.type = type;
        return this;
    }
}