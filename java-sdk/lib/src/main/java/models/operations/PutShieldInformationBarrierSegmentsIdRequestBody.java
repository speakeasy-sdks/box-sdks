package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutShieldInformationBarrierSegmentsIdRequestBody
 * An object containing update(s) to be made on the Shield
 * Information Barrier Segment. Possible properties include
 * 'name' and 'description', the value in object is the update.
**/
public class PutShieldInformationBarrierSegmentsIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PutShieldInformationBarrierSegmentsIdRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PutShieldInformationBarrierSegmentsIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }
}