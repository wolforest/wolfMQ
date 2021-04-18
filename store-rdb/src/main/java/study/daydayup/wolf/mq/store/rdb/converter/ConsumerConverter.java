package study.daydayup.wolf.mq.store.rdb.converter;

import org.springframework.beans.BeanUtils;
import study.daydayup.wolf.common.lang.contract.Converter;
import study.daydayup.wolf.common.util.collection.CollectionUtil;
import study.daydayup.wolf.mq.api.domain.entity.client.Consumer;
import study.daydayup.wolf.mq.store.rdb.dataobject.MqConsumerDO;

import java.util.List;

/**
 * study.daydayup.wolf.business.uc.crm.biz.customer.consumer.converter
 *
 * @author Wingle
 * @since 2020/3/10 3:50 下午
 **/
public class ConsumerConverter implements Converter {
    public static Consumer toModel(MqConsumerDO consumerDO) {
        if (consumerDO == null) {
            return null;
        }

        Consumer consumer = new Consumer();
        BeanUtils.copyProperties(consumerDO, consumer);

        return consumer;
    }

    public static List<Consumer> toModel(List<MqConsumerDO> consumerDOList) {
        return CollectionUtil.to(consumerDOList, ConsumerConverter::toModel);
    }

    public static MqConsumerDO toDO(Consumer consumer) {
        if (consumer == null) {
            return null;
        }

        MqConsumerDO consumerDO = new MqConsumerDO();
        BeanUtils.copyProperties(consumer, consumerDO);
        return consumerDO;
    }
}
