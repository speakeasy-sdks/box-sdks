package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutSkillInvocationsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=skill_id")
    public String skillId;
    public PutSkillInvocationsIdPathParams withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
}