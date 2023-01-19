package .models.shared;


public enum WorkflowFlowsOutcomesIfRejectedActionTypeEnum {
    ADD_METADATA("add_metadata"),
    ASSIGN_TASK("assign_task"),
    COPY_FILE("copy_file"),
    COPY_FOLDER("copy_folder"),
    CREATE_FOLDER("create_folder"),
    DELETE_FILE("delete_file"),
    DELETE_FOLDER("delete_folder"),
    LOCK_FILE("lock_file"),
    MOVE_FILE("move_file"),
    MOVE_FOLDER("move_folder"),
    REMOVE_WATERMARK_FILE("remove_watermark_file"),
    RENAME_FOLDER("rename_folder"),
    RESTORE_FOLDER("restore_folder"),
    SHARE_FILE("share_file"),
    SHARE_FOLDER("share_folder"),
    UNLOCK_FILE("unlock_file"),
    UPLOAD_FILE("upload_file"),
    WAIT_FOR_TASK("wait_for_task"),
    WATERMARK_FILE("watermark_file"),
    GO_BACK_TO_STEP("go_back_to_step"),
    APPLY_FILE_CLASSIFICATION("apply_file_classification"),
    APPLY_FOLDER_CLASSIFICATION("apply_folder_classification"),
    SEND_NOTIFICATION("send_notification");

    public final String value;

    private WorkflowFlowsOutcomesIfRejectedActionTypeEnum(String value) {
        this.value = value;
    }
}
