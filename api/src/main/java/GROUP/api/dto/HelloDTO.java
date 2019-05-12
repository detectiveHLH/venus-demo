package GROUP.api.dto;

/**
 * HelloDTO
 *
 * @author Lunhao Hu
 * @date 2019-05-10 14:28
 **/
public class HelloDTO {
    private String message;

    private Long createdAt;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
}
