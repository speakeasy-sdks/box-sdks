package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetZipDownloadsIdContentPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=zip_download_id")
    public String zipDownloadId;
    public GetZipDownloadsIdContentPathParams withZipDownloadId(String zipDownloadId) {
        this.zipDownloadId = zipDownloadId;
        return this;
    }
}