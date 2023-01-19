package .models.shared;


public enum SkillCardSkillCardTypeEnum {
    TRANSCRIPT("transcript"),
    KEYWORD("keyword"),
    TIMELINE("timeline"),
    STATUS("status");

    public final String value;

    private SkillCardSkillCardTypeEnum(String value) {
        this.value = value;
    }
}
