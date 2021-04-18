package study.daydayup.wolf.mq.store.rdb.dao;

import study.daydayup.wolf.mq.store.rdb.dataobject.MqTaskLogDO;

public interface MqTaskLogDAO {
    int deleteById(Long id);

    int insert(MqTaskLogDO record);

    int insertSelective(MqTaskLogDO record);

    MqTaskLogDO selectById(Long id);

    int updateByIdSelective(MqTaskLogDO record);

    int updateById(MqTaskLogDO record);
}