package study.daydayup.wolf.mq.store.rdb.converter;

import org.springframework.beans.BeanUtils;
import study.daydayup.wolf.common.lang.contract.Converter;
import study.daydayup.wolf.common.util.collection.CollectionUtil;
import study.daydayup.wolf.mq.api.domain.entity.client.Client;
import study.daydayup.wolf.mq.store.rdb.dataobject.MqConsumerDO;

import java.util.List;

/**
 * study.daydayup.wolf.business.uc.crm.biz.customer.consumer.converter
 *
 * @author Wingle
 * @since 2020/3/10 3:50 下午
 **/
public class ClientConverter implements Converter {
    public static Client toModel(MqConsumerDO consumerDO) {
        if (consumerDO == null) {
            return null;
        }

        Client client = new Client();
        BeanUtils.copyProperties(consumerDO, client);

        return client;
    }

    public static List<Client> toModel(List<MqConsumerDO> consumerDOList) {
        return CollectionUtil.to(consumerDOList, ClientConverter::toModel);
    }

    public static MqConsumerDO toDO(Client client) {
        if (client == null) {
            return null;
        }

        MqConsumerDO consumerDO = new MqConsumerDO();
        BeanUtils.copyProperties(client, consumerDO);
        return consumerDO;
    }
}
