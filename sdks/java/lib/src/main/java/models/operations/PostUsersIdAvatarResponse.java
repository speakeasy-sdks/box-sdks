package .models.operations;



public class PostUsersIdAvatarResponse {
    public .models.shared.ClientError clientError;
    public PostUsersIdAvatarResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostUsersIdAvatarResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostUsersIdAvatarResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.UserAvatar userAvatar;
    public PostUsersIdAvatarResponse withUserAvatar(.models.shared.UserAvatar userAvatar) {
        this.userAvatar = userAvatar;
        return this;
    }
}