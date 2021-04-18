package study.daydayup.wolf.mq.api.domain.entity;

import lombok.Data;
import study.daydayup.wolf.framework.layer.api.Model;

import java.time.LocalDateTime;

/**
 * study.daydayup.wolf.mq.api.domain.entity
 *
 * @author Wingle
 * @since 2021/4/16 4:42 下午
 **/
@Data
public class Topic implements Model {
    private Long id;

    private String topicNo;

    private Integer topicType;

    private Integer triggerType;

    private String trigger;

    private Integer triggerTimeout;

    private Integer executeMode;

    private Integer maxRetryTimes;

    private Integer maxExecuteTime;

    private String concurrency;

    private String sharding;

    private String name;

    private String tags;

    private String description;

    private Integer version;

    private Long ownerId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
