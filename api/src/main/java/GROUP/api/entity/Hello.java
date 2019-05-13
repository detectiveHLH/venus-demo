package GROUP.api.entity;

/**
 * Hello
 *
 * @author Lunhao Hu
 * @date 2019-03-20
 */
public class Hello {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 有权限处理当前workflow的角色id，多个角色以英文逗号分隔
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
