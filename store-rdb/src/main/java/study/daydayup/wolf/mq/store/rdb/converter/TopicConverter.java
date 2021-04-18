package study.daydayup.wolf.mq.store.rdb.converter;

import org.springframework.beans.BeanUtils;
import study.daydayup.wolf.mq.api.domain.entity.Topic;
import study.daydayup.wolf.common.lang.contract.Converter;
import study.daydayup.wolf.common.util.collection.CollectionUtil;
import study.daydayup.wolf.mq.store.rdb.dataobject.MqTopicDO;

import java.util.List;

/**
 * study.daydayup.wolf.business.uc.crm.biz.customer.topic.converter
 *
 * @author Wingle
 * @since 2020/3/10 3:50 下午
 **/
public class TopicConverter implements Converter {
    public static Topic toModel(MqTopicDO topicDO) {
        if (topicDO == null) {
            return null;
        }

        Topic topic = new Topic();
        BeanUtils.copyProperties(topicDO, topic);

        return topic;
    }

    public static List<Topic> toModel(List<MqTopicDO> topicDOList) {
        return CollectionUtil.to(topicDOList, TopicConverter::toModel);
    }

    public static MqTopicDO toDO(Topic topic) {
        if (topic == null) {
            return null;
        }

        MqTopicDO topicDO = new MqTopicDO();
        BeanUtils.copyProperties(topic, topicDO);
        return topicDO;
    }
}
