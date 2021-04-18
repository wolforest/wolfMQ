package study.daydayup.wolf.mq.store.rdb.dao;

import study.daydayup.wolf.mq.store.rdb.dataobject.MqTaskDagDO;

public interface MqTaskDagDAO {
    int deleteById(Long id);

    int insert(MqTaskDagDO record);

    int insertSelective(MqTaskDagDO record);

    MqTaskDagDO selectById(Long id);

    int updateByIdSelective(MqTaskDagDO record);

    int updateById(MqTaskDagDO record);
}