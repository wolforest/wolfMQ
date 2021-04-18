package study.daydayup.wolf.mq.store.rdb.converter;

import org.springframework.beans.BeanUtils;
import study.daydayup.wolf.common.lang.contract.Converter;
import study.daydayup.wolf.common.util.collection.CollectionUtil;
import study.daydayup.wolf.mq.api.domain.entity.monitor.Owner;
import study.daydayup.wolf.mq.store.rdb.dataobject.MqOwnerDO;

import java.util.List;

/**
 * study.daydayup.wolf.business.uc.crm.biz.customer.owner.converter
 *
 * @author Wingle
 * @since 2020/3/10 3:50 下午
 **/
public class OwnerConverter implements Converter {
    public static Owner toModel(MqOwnerDO ownerDO) {
        if (ownerDO == null) {
            return null;
        }

        Owner owner = new Owner();
        BeanUtils.copyProperties(ownerDO, owner);

        return owner;
    }

    public static List<Owner> toModel(List<MqOwnerDO> ownerDOList) {
        return CollectionUtil.to(ownerDOList, OwnerConverter::toModel);
    }

    public static MqOwnerDO toDO(Owner owner) {
        if (owner == null) {
            return null;
        }

        MqOwnerDO ownerDO = new MqOwnerDO();
        BeanUtils.copyProperties(owner, ownerDO);
        return ownerDO;
    }
}
