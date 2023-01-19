package .models.operations;



public class GetUsersIdAvatarResponse {
    public .models.shared.ClientError clientError;
    public GetUsersIdAvatarResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetUsersIdAvatarResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetUsersIdAvatarResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public byte[] getUsersIdAvatar200ImageJpgBinaryString;
    public GetUsersIdAvatarResponse withGetUsersIdAvatar200ImageJpgBinaryString(byte[] getUsersIdAvatar200ImageJpgBinaryString) {
        this.getUsersIdAvatar200ImageJpgBinaryString = getUsersIdAvatar200ImageJpgBinaryString;
        return this;
    }
}