package study.daydayup.wolf.mq.store.rdb.dao;

import study.daydayup.wolf.mq.store.rdb.dataobject.MqClientDO;

public interface MqClientDAO {
    int deleteById(Long id);

    int insert(MqClientDO record);

    int insertSelective(MqClientDO record);

    MqClientDO selectById(Long id);

    int updateByIdSelective(MqClientDO record);

    int updateById(MqClientDO record);
}