package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetZipDownloadsIdStatusPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=zip_download_id")
    public String zipDownloadId;
    public GetZipDownloadsIdStatusPathParams withZipDownloadId(String zipDownloadId) {
        this.zipDownloadId = zipDownloadId;
        return this;
    }
}