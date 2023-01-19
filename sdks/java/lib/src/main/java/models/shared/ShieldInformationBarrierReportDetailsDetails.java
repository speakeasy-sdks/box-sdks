package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ShieldInformationBarrierReportDetailsDetails {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_id")
    public String folderId;
    public ShieldInformationBarrierReportDetailsDetails withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}