package study.daydayup.wolf.mq.store.rdb.converter;

import org.springframework.beans.BeanUtils;
import study.daydayup.wolf.common.lang.contract.Converter;
import study.daydayup.wolf.common.util.collection.CollectionUtil;
import study.daydayup.wolf.mq.api.domain.entity.queue.Message;
import study.daydayup.wolf.mq.store.rdb.dataobject.MqMessageDO;

import java.util.List;

/**
 * study.daydayup.wolf.business.uc.crm.biz.customer.message.converter
 *
 * @author Wingle
 * @since 2020/3/10 3:50 下午
 **/
public class MessageConverter implements Converter {
    public static Message toModel(MqMessageDO messageDO) {
        if (messageDO == null) {
            return null;
        }

        Message message = new Message();
        BeanUtils.copyProperties(messageDO, message);

        return message;
    }

    public static List<Message> toModel(List<MqMessageDO> messageDOList) {
        return CollectionUtil.to(messageDOList, MessageConverter::toModel);
    }

    public static MqMessageDO toDO(Message message) {
        if (message == null) {
            return null;
        }

        MqMessageDO messageDO = new MqMessageDO();
        BeanUtils.copyProperties(message, messageDO);
        return messageDO;
    }
}
