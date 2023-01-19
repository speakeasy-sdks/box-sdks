package .models.operations;



public class PostShieldInformationBarrierReportsResponse {
    public .models.shared.ClientError clientError;
    public PostShieldInformationBarrierReportsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostShieldInformationBarrierReportsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrierReport shieldInformationBarrierReport;
    public PostShieldInformationBarrierReportsResponse withShieldInformationBarrierReport(.models.shared.ShieldInformationBarrierReport shieldInformationBarrierReport) {
        this.shieldInformationBarrierReport = shieldInformationBarrierReport;
        return this;
    }
    public Long statusCode;
    public PostShieldInformationBarrierReportsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}