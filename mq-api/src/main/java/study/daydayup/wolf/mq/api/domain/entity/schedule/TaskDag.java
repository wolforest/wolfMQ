package study.daydayup.wolf.mq.api.domain.entity.schedule;

import lombok.Data;
import study.daydayup.wolf.framework.layer.api.Model;

import java.time.LocalDateTime;

/**
 * study.daydayup.wolf.mq.api.domain.entity.task
 *
 * @author Wingle
 * @since 2021/4/16 4:53 下午
 **/
@Data
public class TaskDag implements Model {
    private Long id;

    private String name;
    private String description;
    private String tags;

    private Integer version;
    private Long ownerId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
