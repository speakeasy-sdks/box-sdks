package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostUsersIdAvatarRequestBodyPic {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public PostUsersIdAvatarRequestBodyPic withContent(byte[] content) {
        this.content = content;
        return this;
    }
    @SpeakeasyMetadata("multipartForm:name=pic")
    public String pic;
    public PostUsersIdAvatarRequestBodyPic withPic(String pic) {
        this.pic = pic;
        return this;
    }
}