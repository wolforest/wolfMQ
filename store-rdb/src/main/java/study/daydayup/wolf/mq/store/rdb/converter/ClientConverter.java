package study.daydayup.wolf.mq.store.rdb.converter;

import org.springframework.beans.BeanUtils;
import study.daydayup.wolf.common.lang.contract.Converter;
import study.daydayup.wolf.common.util.collection.CollectionUtil;
import study.daydayup.wolf.mq.api.domain.entity.client.Client;
import study.daydayup.wolf.mq.store.rdb.dataobject.MqClientDO;

import java.util.List;

/**
 * study.daydayup.wolf.business.uc.crm.biz.customer.client.converter
 *
 * @author Wingle
 * @since 2020/3/10 3:50 下午
 **/
public class ClientConverter implements Converter {
    public static Client toModel(MqClientDO clientDO) {
        if (clientDO == null) {
            return null;
        }

        Client client = new Client();
        BeanUtils.copyProperties(clientDO, client);

        return client;
    }

    public static List<Client> toModel(List<MqClientDO> clientDOList) {
        return CollectionUtil.to(clientDOList, ClientConverter::toModel);
    }

    public static MqClientDO toDO(Client client) {
        if (client == null) {
            return null;
        }

        MqClientDO clientDO = new MqClientDO();
        BeanUtils.copyProperties(client, clientDO);
        return clientDO;
    }
}
