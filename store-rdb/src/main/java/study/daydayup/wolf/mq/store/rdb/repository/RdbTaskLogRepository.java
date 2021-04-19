package study.daydayup.wolf.mq.store.rdb.repository;

import org.springframework.stereotype.Component;
import study.daydayup.wolf.mq.api.domain.entity.schedule.TaskLog;
import study.daydayup.wolf.mq.api.domain.repository.schedule.TaskLogRepository;
import study.daydayup.wolf.mq.store.rdb.dao.MqTaskLogDAO;

import javax.annotation.Resource;

/**
 * study.daydayup.wolf.mq.store.rdb.repository
 *
 * @author Wingle
 * @since 2021/4/19 4:24 下午
 **/
@Component
public class RdbTaskLogRepository implements TaskLogRepository {
    @Resource
    private MqTaskLogDAO mqTaskLogDAO;

    @Override
    public int add(TaskLog log) {
        return 0;
    }
}
