package study.daydayup.wolf.mq.store.rdb.dao;

import study.daydayup.wolf.mq.store.rdb.dataobject.MqOwnerDO;

public interface MqOwnerDAO {
    int deleteById(Long id);

    int insert(MqOwnerDO record);

    int insertSelective(MqOwnerDO record);

    MqOwnerDO selectById(Long id);

    int updateByIdSelective(MqOwnerDO record);

    int updateById(MqOwnerDO record);
}