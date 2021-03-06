package study.daydayup.wolf.mq.api.domain.entity.monitor;

import lombok.Data;
import study.daydayup.wolf.framework.layer.api.Model;

import java.time.LocalDateTime;

/**
 * study.daydayup.wolf.mq.api.domain.entity.monitor
 *
 * @author Wingle
 * @since 2021/4/16 4:55 下午
 **/
@Data
public class Owner implements Model {
    private Long id;

    private String name;
    private String mobile;
    private String email;
    private String im;
    private String description;
    private String tags;

    private Integer version;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
