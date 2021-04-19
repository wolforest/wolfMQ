package study.daydayup.wolf.mq.api.domain.repository.schedule;

import study.daydayup.wolf.mq.api.domain.entity.schedule.TaskLog;

/**
 * study.daydayup.wolf.mq.api.domain.repository
 *
 * @author Wingle
 * @since 2021/4/16 6:12 下午
 **/
public interface TaskLogRepository {
    int add(TaskLog log);
}
