package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class ShieldInformationBarrierSegmentMembers {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ShieldInformationBarrierSegmentMembers(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteShieldInformationBarrierSegmentMembersId - Delete shield information barrier segment member by ID
     *
     * Deletes a shield information barrier
     * segment member based on provided ID.
    **/
    public .models.operations.DeleteShieldInformationBarrierSegmentMembersIdResponse deleteShieldInformationBarrierSegmentMembersId(.models.operations.DeleteShieldInformationBarrierSegmentMembersIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/shield_information_barrier_segment_members/{shield_information_barrier_segment_member_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteShieldInformationBarrierSegmentMembersIdResponse res = new .models.operations.DeleteShieldInformationBarrierSegmentMembersIdResponse() {{
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
     * getShieldInformationBarrierSegmentMembers - List shield information barrier segment members
     *
     * Lists shield information barrier segment members
     * based on provided segment IDs.
    **/
    public .models.operations.GetShieldInformationBarrierSegmentMembersResponse getShieldInformationBarrierSegmentMembers(.models.operations.GetShieldInformationBarrierSegmentMembersRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/shield_information_barrier_segment_members");
        
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

        .models.operations.GetShieldInformationBarrierSegmentMembersResponse res = new .models.operations.GetShieldInformationBarrierSegmentMembersResponse() {{
            getShieldInformationBarrierSegmentMembers200ApplicationJSONObject = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.GetShieldInformationBarrierSegmentMembers200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.GetShieldInformationBarrierSegmentMembers200ApplicationJson.class);
                res.getShieldInformationBarrierSegmentMembers200ApplicationJSONObject = out;
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
     * getShieldInformationBarrierSegmentMembersId - Get shield information barrier segment member by ID
     *
     * Retrieves a shield information barrier
     * segment member by its ID.
    **/
    public .models.operations.GetShieldInformationBarrierSegmentMembersIdResponse getShieldInformationBarrierSegmentMembersId(.models.operations.GetShieldInformationBarrierSegmentMembersIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/shield_information_barrier_segment_members/{shield_information_barrier_segment_member_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetShieldInformationBarrierSegmentMembersIdResponse res = new .models.operations.GetShieldInformationBarrierSegmentMembersIdResponse() {{
            shieldInformationBarrierSegmentMember = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ShieldInformationBarrierSegmentMember out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ShieldInformationBarrierSegmentMember.class);
                res.shieldInformationBarrierSegmentMember = out;
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
     * postShieldInformationBarrierSegmentMembers - Create shield information barrier segment member
     *
     * Creates a new shield information barrier segment member.
    **/
    public .models.operations.PostShieldInformationBarrierSegmentMembersResponse postShieldInformationBarrierSegmentMembers(.models.operations.PostShieldInformationBarrierSegmentMembersRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/shield_information_barrier_segment_members");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostShieldInformationBarrierSegmentMembersResponse res = new .models.operations.PostShieldInformationBarrierSegmentMembersResponse() {{
            shieldInformationBarrierSegmentMember = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ShieldInformationBarrierSegmentMember out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ShieldInformationBarrierSegmentMember.class);
                res.shieldInformationBarrierSegmentMember = out;
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