package study.daydayup.wolf.mq.api.domain.repository;

import study.daydayup.wolf.mq.api.domain.entity.Topic;

/**
 * study.daydayup.wolf.mq.api.domain.repository
 *
 * @author Wingle
 * @since 2021/4/16 6:11 下午
 **/
public interface TopicRepository {
    int add(Topic topic);

    Topic find(Long topicId);
    Topic findByTopicNo(String topicNo);

}
