package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostUsersIdAvatarRequestBody {
    @SpeakeasyMetadata("multipartForm:file")
    public PostUsersIdAvatarRequestBodyPic pic;
    public PostUsersIdAvatarRequestBody withPic(PostUsersIdAvatarRequestBodyPic pic) {
        this.pic = pic;
        return this;
    }
}