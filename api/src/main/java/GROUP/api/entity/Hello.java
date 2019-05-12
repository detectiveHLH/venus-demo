package GROUP.api.entity;

/**
 * 账单流转状态
 *
 * @author WangQuanzhou
 * @date 2019-03-20
 */
public class Hello {

    /**
     * 账单流转阶段id
     */
    private String workflowId;

    /**
     * 有权限处理当前workflow的角色id，多个角色以英文逗号分隔
     */
    private String roleIds;

    /**
     * 状态名称
     */
    private String workflowName;

    /**
     * 下一状态id
     */
    private String nextWorkflowId;

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public String getNextWorkflowId() {
        return nextWorkflowId;
    }

    public void setNextWorkflowId(String nextWorkflowId) {
        this.nextWorkflowId = nextWorkflowId;
    }
}
