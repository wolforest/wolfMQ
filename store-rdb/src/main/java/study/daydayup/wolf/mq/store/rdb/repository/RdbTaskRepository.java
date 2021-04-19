package study.daydayup.wolf.mq.store.rdb.repository;

import org.springframework.stereotype.Component;
import study.daydayup.wolf.mq.api.domain.entity.schedule.Task;
import study.daydayup.wolf.mq.api.domain.repository.schedule.TaskRepository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * study.daydayup.wolf.mq.store.rdb.repository
 *
 * @author Wingle
 * @since 2021/4/19 4:23 下午
 **/
@Component
public class RdbTaskRepository implements TaskRepository {
    @Override
    public List<Task> lockTaskByRange(LocalDateTime start, LocalDateTime end, Integer state, int limit) {
        return null;
    }

    @Override
    public List<Task> lockTaskByTopic(LocalDateTime start, LocalDateTime end, Integer state, Long topicId, int limit) {
        return null;
    }

    @Override
    public Task find(Long taskId) {
        return null;
    }

    @Override
    public Task findByTaskNo(String taskNo) {
        return null;
    }

    @Override
    public int modify(Long taskId, Task task) {
        return 0;
    }

    @Override
    public int modifyByTaskNo(String taskNo, Task task) {
        return 0;
    }

    @Override
    public int modifyByTaskIdList(Collection<Long> idList, Task task) {
        return 0;
    }

    @Override
    public int modifyByTaskNoList(Collection<String> noList, Task task) {
        return 0;
    }
}
