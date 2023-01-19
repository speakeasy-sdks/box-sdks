package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteCommentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=comment_id")
    public String commentId;
    public DeleteCommentsIdPathParams withCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }
}