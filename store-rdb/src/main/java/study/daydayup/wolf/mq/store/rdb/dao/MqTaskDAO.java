package study.daydayup.wolf.mq.store.rdb.dao;

import study.daydayup.wolf.mq.store.rdb.dataobject.MqTaskDO;

public interface MqTaskDAO {
    int deleteById(Long id);

    int insert(MqTaskDO record);

    int insertSelective(MqTaskDO record);

    MqTaskDO selectById(Long id);

    int updateByIdSelective(MqTaskDO record);

    int updateById(MqTaskDO record);
}