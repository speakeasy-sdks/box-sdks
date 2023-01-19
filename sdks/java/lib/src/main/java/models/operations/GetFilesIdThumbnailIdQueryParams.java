package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdThumbnailIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=max_height")
    public Long maxHeight;
    public GetFilesIdThumbnailIdQueryParams withMaxHeight(Long maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=max_width")
    public Long maxWidth;
    public GetFilesIdThumbnailIdQueryParams withMaxWidth(Long maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=min_height")
    public Long minHeight;
    public GetFilesIdThumbnailIdQueryParams withMinHeight(Long minHeight) {
        this.minHeight = minHeight;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=min_width")
    public Long minWidth;
    public GetFilesIdThumbnailIdQueryParams withMinWidth(Long minWidth) {
        this.minWidth = minWidth;
        return this;
    }
}