package study.daydayup.wolf.mq.api.domain.repository.schedule;

import study.daydayup.wolf.mq.api.domain.entity.schedule.Task;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * study.daydayup.wolf.mq.api.domain.repository
 *
 * @author Wingle
 * @since 2021/4/16 6:11 下午
 **/
public interface TaskRepository {
    List<Task> lockTaskByRange(LocalDateTime start, LocalDateTime end, Integer state, int limit);
    List<Task> lockTaskByTopic(LocalDateTime start, LocalDateTime end, Integer state, Long topicId, int limit);

    Task find(Long taskId);
    Task findByTaskNo(String taskNo);

    int modify(Long taskId, Task task);
    int modifyByTaskNo(String taskNo, Task task);
    int modifyByTaskIdList(Collection<Long> idList, Task task);
    int modifyByTaskNoList(Collection<String> noList, Task task);

}
