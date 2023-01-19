package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetCommentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=comment_id")
    public String commentId;
    public GetCommentsIdPathParams withCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }
}