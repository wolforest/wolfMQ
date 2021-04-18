package study.daydayup.wolf.mq.store.rdb.dao;

import study.daydayup.wolf.mq.store.rdb.dataobject.MqTopicDO;

public interface MqTopicDAO {
    int deleteById(Long id);

    int insert(MqTopicDO record);

    int insertSelective(MqTopicDO record);

    MqTopicDO selectById(Long id);

    int updateByIdSelective(MqTopicDO record);

    int updateById(MqTopicDO record);
}