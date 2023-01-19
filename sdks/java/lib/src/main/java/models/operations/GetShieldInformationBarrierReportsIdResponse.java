package .models.operations;



public class GetShieldInformationBarrierReportsIdResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarrierReportsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarrierReportsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrierReport shieldInformationBarrierReport;
    public GetShieldInformationBarrierReportsIdResponse withShieldInformationBarrierReport(.models.shared.ShieldInformationBarrierReport shieldInformationBarrierReport) {
        this.shieldInformationBarrierReport = shieldInformationBarrierReport;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarrierReportsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}