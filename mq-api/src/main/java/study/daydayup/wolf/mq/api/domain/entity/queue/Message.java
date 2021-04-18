package study.daydayup.wolf.mq.api.domain.entity.queue;

import lombok.Data;
import study.daydayup.wolf.framework.layer.api.Model;

import java.time.LocalDateTime;

/**
 * study.daydayup.wolf.mq.api.domain.entity
 *
 * @author Wingle
 * @since 2021/4/16 4:41 下午
 **/
@Data
public class Message implements Model {
    private Long id;

    private String messageNo;

    private Long topicId;

    private Integer shard;

    private Integer state;

    private String producer;

    private String message;

    private LocalDateTime expiredAt;

    private String locker;

    private LocalDateTime lockAt;

    private String attachment;

    private String tags;

    private Integer version;

    private Long ownerId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
