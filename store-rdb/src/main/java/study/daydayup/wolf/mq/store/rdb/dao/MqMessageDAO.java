package study.daydayup.wolf.mq.store.rdb.dao;

import study.daydayup.wolf.mq.store.rdb.dataobject.MqMessageDO;

public interface MqMessageDAO {
    int deleteById(Long id);

    int insert(MqMessageDO record);

    int insertSelective(MqMessageDO record);

    MqMessageDO selectById(Long id);

    int updateByIdSelective(MqMessageDO record);

    int updateById(MqMessageDO record);
}