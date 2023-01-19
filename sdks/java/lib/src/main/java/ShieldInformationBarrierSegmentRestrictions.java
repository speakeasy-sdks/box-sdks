package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class ShieldInformationBarrierSegmentRestrictions {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ShieldInformationBarrierSegmentRestrictions(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteShieldInformationBarrierSegmentRestrictionsId - Delete shield information barrier segment restriction by ID
     *
     * Delete shield information barrier segment restriction
     * based on provided ID.
    **/
    public .models.operations.DeleteShieldInformationBarrierSegmentRestrictionsIdResponse deleteShieldInformationBarrierSegmentRestrictionsId(.models.operations.DeleteShieldInformationBarrierSegmentRestrictionsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/shield_information_barrier_segment_restrictions/{shield_information_barrier_segment_restriction_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteShieldInformationBarrierSegmentRestrictionsIdResponse res = new .models.operations.DeleteShieldInformationBarrierSegmentRestrictionsIdResponse() {{
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 404) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }

        return res;
    }
	
	
    /**
     * getShieldInformationBarrierSegmentRestrictions - List shield information barrier segment restrictions
     *
     * Lists shield information barrier segment restrictions
     * based on provided segment ID.
    **/
    public .models.operations.GetShieldInformationBarrierSegmentRestrictionsResponse getShieldInformationBarrierSegmentRestrictions(.models.operations.GetShieldInformationBarrierSegmentRestrictionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/shield_information_barrier_segment_restrictions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetShieldInformationBarrierSegmentRestrictionsResponse res = new .models.operations.GetShieldInformationBarrierSegmentRestrictionsResponse() {{
            getShieldInformationBarrierSegmentRestrictions200ApplicationJSONObject = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.GetShieldInformationBarrierSegmentRestrictions200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.GetShieldInformationBarrierSegmentRestrictions200ApplicationJson.class);
                res.getShieldInformationBarrierSegmentRestrictions200ApplicationJSONObject = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }

        return res;
    }
	
	
    /**
     * getShieldInformationBarrierSegmentRestrictionsId - Get shield information barrier segment restriction by ID
     *
     * Retrieves a shield information barrier segment
     * restriction based on provided ID.
    **/
    public .models.operations.GetShieldInformationBarrierSegmentRestrictionsIdResponse getShieldInformationBarrierSegmentRestrictionsId(.models.operations.GetShieldInformationBarrierSegmentRestrictionsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/shield_information_barrier_segment_restrictions/{shield_information_barrier_segment_restriction_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetShieldInformationBarrierSegmentRestrictionsIdResponse res = new .models.operations.GetShieldInformationBarrierSegmentRestrictionsIdResponse() {{
            shieldInformationBarrierSegmentRestriction = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ShieldInformationBarrierSegmentRestriction out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ShieldInformationBarrierSegmentRestriction.class);
                res.shieldInformationBarrierSegmentRestriction = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }

        return res;
    }
	
	
    /**
     * postShieldInformationBarrierSegmentRestrictions - Create shield information barrier segment restriction
     *
     * Creates a shield information barrier
     * segment restriction object.
    **/
    public .models.operations.PostShieldInformationBarrierSegmentRestrictionsResponse postShieldInformationBarrierSegmentRestrictions(.models.operations.PostShieldInformationBarrierSegmentRestrictionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/shield_information_barrier_segment_restrictions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostShieldInformationBarrierSegmentRestrictionsResponse res = new .models.operations.PostShieldInformationBarrierSegmentRestrictionsResponse() {{
            shieldInformationBarrierSegmentRestriction = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ShieldInformationBarrierSegmentRestriction out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ShieldInformationBarrierSegmentRestriction.class);
                res.shieldInformationBarrierSegmentRestriction = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }

        return res;
    }
	
}