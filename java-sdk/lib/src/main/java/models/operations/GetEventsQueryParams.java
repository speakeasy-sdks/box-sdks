package .models.operations;

import java.time.OffsetDateTime;
import .utils.SpeakeasyMetadata;

public class GetEventsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=created_after")
    public OffsetDateTime createdAfter;
    public GetEventsQueryParams withCreatedAfter(OffsetDateTime createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=created_before")
    public OffsetDateTime createdBefore;
    public GetEventsQueryParams withCreatedBefore(OffsetDateTime createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=event_type")
    public GetEventsEventTypeEnum[] eventType;
    public GetEventsQueryParams withEventType(GetEventsEventTypeEnum[] eventType) {
        this.eventType = eventType;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetEventsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=stream_position")
    public String streamPosition;
    public GetEventsQueryParams withStreamPosition(String streamPosition) {
        this.streamPosition = streamPosition;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=stream_type")
    public GetEventsStreamTypeEnum streamType;
    public GetEventsQueryParams withStreamType(GetEventsStreamTypeEnum streamType) {
        this.streamType = streamType;
        return this;
    }
}