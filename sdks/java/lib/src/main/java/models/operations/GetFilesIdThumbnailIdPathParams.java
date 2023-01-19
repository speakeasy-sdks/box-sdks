package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdThumbnailIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=extension")
    public GetFilesIdThumbnailIdExtensionEnum extension;
    public GetFilesIdThumbnailIdPathParams withExtension(GetFilesIdThumbnailIdExtensionEnum extension) {
        this.extension = extension;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdThumbnailIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}