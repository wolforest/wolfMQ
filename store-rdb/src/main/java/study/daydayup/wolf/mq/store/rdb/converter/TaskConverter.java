package study.daydayup.wolf.mq.store.rdb.converter;

import org.springframework.beans.BeanUtils;
import study.daydayup.wolf.common.lang.contract.Converter;
import study.daydayup.wolf.common.util.collection.CollectionUtil;
import study.daydayup.wolf.mq.api.domain.entity.schedule.Task;
import study.daydayup.wolf.mq.store.rdb.dataobject.MqTaskDO;

import java.util.List;

/**
 * study.daydayup.wolf.business.uc.crm.biz.customer.task.converter
 *
 * @author Wingle
 * @since 2020/3/10 3:50 下午
 **/
public class TaskConverter implements Converter {
    public static Task toModel(MqTaskDO taskDO) {
        if (taskDO == null) {
            return null;
        }

        Task task = new Task();
        BeanUtils.copyProperties(taskDO, task);

        return task;
    }

    public static List<Task> toModel(List<MqTaskDO> taskDOList) {
        return CollectionUtil.to(taskDOList, TaskConverter::toModel);
    }

    public static MqTaskDO toDO(Task task) {
        if (task == null) {
            return null;
        }

        MqTaskDO taskDO = new MqTaskDO();
        BeanUtils.copyProperties(task, taskDO);
        return taskDO;
    }
}
