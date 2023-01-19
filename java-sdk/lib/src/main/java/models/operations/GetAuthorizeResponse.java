package .models.operations;



public class GetAuthorizeResponse {
    public String contentType;
    public GetAuthorizeResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetAuthorizeResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getAuthorize200TextHTMLHTMLString;
    public GetAuthorizeResponse withGetAuthorize200TextHtmlHtmlString(String getAuthorize200TextHTMLHTMLString) {
        this.getAuthorize200TextHTMLHTMLString = getAuthorize200TextHTMLHTMLString;
        return this;
    }
    public String getAuthorizeDefaultTextHTMLHTMLString;
    public GetAuthorizeResponse withGetAuthorizeDefaultTextHtmlHtmlString(String getAuthorizeDefaultTextHTMLHTMLString) {
        this.getAuthorizeDefaultTextHTMLHTMLString = getAuthorizeDefaultTextHTMLHTMLString;
        return this;
    }
}