package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutCommentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=comment_id")
    public String commentId;
    public PutCommentsIdPathParams withCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }
}