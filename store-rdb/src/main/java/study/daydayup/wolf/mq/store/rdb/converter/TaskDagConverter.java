package study.daydayup.wolf.mq.store.rdb.converter;

import org.springframework.beans.BeanUtils;
import study.daydayup.wolf.common.lang.contract.Converter;
import study.daydayup.wolf.common.util.collection.CollectionUtil;
import study.daydayup.wolf.mq.api.domain.entity.schedule.TaskDag;
import study.daydayup.wolf.mq.store.rdb.dataobject.MqTaskDagDO;

import java.util.List;

/**
 * study.daydayup.wolf.business.uc.crm.biz.customer.dag.converter
 *
 * @author Wingle
 * @since 2020/3/10 3:50 下午
 **/
public class TaskDagConverter implements Converter {
    public static TaskDag toModel(MqTaskDagDO dagDO) {
        if (dagDO == null) {
            return null;
        }

        TaskDag dag = new TaskDag();
        BeanUtils.copyProperties(dagDO, dag);

        return dag;
    }

    public static List<TaskDag> toModel(List<MqTaskDagDO> dagDOList) {
        return CollectionUtil.to(dagDOList, TaskDagConverter::toModel);
    }

    public static MqTaskDagDO toDO(TaskDag dag) {
        if (dag == null) {
            return null;
        }

        MqTaskDagDO dagDO = new MqTaskDagDO();
        BeanUtils.copyProperties(dag, dagDO);
        return dagDO;
    }
}
