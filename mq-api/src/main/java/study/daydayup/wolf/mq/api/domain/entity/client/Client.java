package study.daydayup.wolf.mq.api.domain.entity.client;

import lombok.Data;
import study.daydayup.wolf.framework.layer.api.Model;

import java.time.LocalDateTime;

/**
 * study.daydayup.wolf.mq.api.domain.entity.client
 *
 * @author Wingle
 * @since 2021/4/16 4:57 下午
 **/
@Data
public class Client implements Model {
    private Long id;
    private String consumerNo;

    private String ip;
    private String name;
    private String description;
    private String tags;

    private Integer version;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
