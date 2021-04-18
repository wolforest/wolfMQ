package study.daydayup.wolf.mq.store.rdb.converter;

import org.springframework.beans.BeanUtils;
import study.daydayup.wolf.common.lang.contract.Converter;
import study.daydayup.wolf.common.util.collection.CollectionUtil;
import study.daydayup.wolf.mq.api.domain.entity.schedule.TaskLog;
import study.daydayup.wolf.mq.store.rdb.dataobject.MqTaskLogDO;

import java.util.List;

/**
 * study.daydayup.wolf.business.uc.crm.biz.customer.log.converter
 *
 * @author Wingle
 * @since 2020/3/10 3:50 下午
 **/
public class TaskLogConverter implements Converter {
    public static TaskLog toModel(MqTaskLogDO logDO) {
        if (logDO == null) {
            return null;
        }

        TaskLog log = new TaskLog();
        BeanUtils.copyProperties(logDO, log);

        return log;
    }

    public static List<TaskLog> toModel(List<MqTaskLogDO> logDOList) {
        return CollectionUtil.to(logDOList, TaskLogConverter::toModel);
    }

    public static MqTaskLogDO toDO(TaskLog log) {
        if (log == null) {
            return null;
        }

        MqTaskLogDO logDO = new MqTaskLogDO();
        BeanUtils.copyProperties(log, logDO);
        return logDO;
    }
}
