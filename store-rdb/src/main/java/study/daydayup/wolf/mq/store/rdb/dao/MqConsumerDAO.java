package study.daydayup.wolf.mq.store.rdb.dao;

import study.daydayup.wolf.mq.store.rdb.dataobject.MqConsumerDO;

public interface MqConsumerDAO {
    int deleteById(Long id);

    int insert(MqConsumerDO record);

    int insertSelective(MqConsumerDO record);

    MqConsumerDO selectById(Long id);

    int updateByIdSelective(MqConsumerDO record);

    int updateById(MqConsumerDO record);
}