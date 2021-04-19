package study.daydayup.wolf.mq.store.rdb.repository;

import org.springframework.stereotype.Component;
import study.daydayup.wolf.mq.api.domain.entity.Topic;
import study.daydayup.wolf.mq.api.domain.repository.TopicRepository;

/**
 * study.daydayup.wolf.mq.store.rdb.repository
 *
 * @author Wingle
 * @since 2021/4/19 4:23 下午
 **/
@Component
public class RdbTopicRepository implements TopicRepository {
    @Override
    public int add(Topic topic) {
        return 0;
    }

    @Override
    public Topic find(Long topicId) {
        return null;
    }

    @Override
    public Topic findByTopicNo(String topicNo) {
        return null;
    }
}
