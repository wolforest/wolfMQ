package study.daydayup.wolf.mq.store.rdb.dataobject;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class MqTaskDO implements Serializable {
    private Long id;

    private String name;

    private String producer;

    private String taskNo;

    private Long topicId;

    private Integer shard;

    private Integer state;

    private String executor;

    private String executorParams;

    private Integer executeMode;

    private Integer maxRetryTimes;

    private Integer executedTimes;

    private Integer maxExecuteTime;

    private LocalDateTime triggerAt;

    private LocalDateTime firstTriggerAt;

    private LocalDateTime expiredAt;

    private String locker;

    private LocalDateTime lockAt;

    private String attachment;

    private String tags;

    private Integer version;

    private Long ownerId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", producer=").append(producer);
        sb.append(", taskNo=").append(taskNo);
        sb.append(", topicId=").append(topicId);
        sb.append(", shard=").append(shard);
        sb.append(", state=").append(state);
        sb.append(", executor=").append(executor);
        sb.append(", executorParams=").append(executorParams);
        sb.append(", executeMode=").append(executeMode);
        sb.append(", maxRetryTimes=").append(maxRetryTimes);
        sb.append(", executedTimes=").append(executedTimes);
        sb.append(", maxExecuteTime=").append(maxExecuteTime);
        sb.append(", triggerAt=").append(triggerAt);
        sb.append(", firstTriggerAt=").append(firstTriggerAt);
        sb.append(", expiredAt=").append(expiredAt);
        sb.append(", locker=").append(locker);
        sb.append(", lockAt=").append(lockAt);
        sb.append(", attachment=").append(attachment);
        sb.append(", tags=").append(tags);
        sb.append(", version=").append(version);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MqTaskDO other = (MqTaskDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProducer() == null ? other.getProducer() == null : this.getProducer().equals(other.getProducer()))
            && (this.getTaskNo() == null ? other.getTaskNo() == null : this.getTaskNo().equals(other.getTaskNo()))
            && (this.getTopicId() == null ? other.getTopicId() == null : this.getTopicId().equals(other.getTopicId()))
            && (this.getShard() == null ? other.getShard() == null : this.getShard().equals(other.getShard()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getExecutor() == null ? other.getExecutor() == null : this.getExecutor().equals(other.getExecutor()))
            && (this.getExecutorParams() == null ? other.getExecutorParams() == null : this.getExecutorParams().equals(other.getExecutorParams()))
            && (this.getExecuteMode() == null ? other.getExecuteMode() == null : this.getExecuteMode().equals(other.getExecuteMode()))
            && (this.getMaxRetryTimes() == null ? other.getMaxRetryTimes() == null : this.getMaxRetryTimes().equals(other.getMaxRetryTimes()))
            && (this.getExecutedTimes() == null ? other.getExecutedTimes() == null : this.getExecutedTimes().equals(other.getExecutedTimes()))
            && (this.getMaxExecuteTime() == null ? other.getMaxExecuteTime() == null : this.getMaxExecuteTime().equals(other.getMaxExecuteTime()))
            && (this.getTriggerAt() == null ? other.getTriggerAt() == null : this.getTriggerAt().equals(other.getTriggerAt()))
            && (this.getFirstTriggerAt() == null ? other.getFirstTriggerAt() == null : this.getFirstTriggerAt().equals(other.getFirstTriggerAt()))
            && (this.getExpiredAt() == null ? other.getExpiredAt() == null : this.getExpiredAt().equals(other.getExpiredAt()))
            && (this.getLocker() == null ? other.getLocker() == null : this.getLocker().equals(other.getLocker()))
            && (this.getLockAt() == null ? other.getLockAt() == null : this.getLockAt().equals(other.getLockAt()))
            && (this.getAttachment() == null ? other.getAttachment() == null : this.getAttachment().equals(other.getAttachment()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProducer() == null) ? 0 : getProducer().hashCode());
        result = prime * result + ((getTaskNo() == null) ? 0 : getTaskNo().hashCode());
        result = prime * result + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        result = prime * result + ((getShard() == null) ? 0 : getShard().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getExecutor() == null) ? 0 : getExecutor().hashCode());
        result = prime * result + ((getExecutorParams() == null) ? 0 : getExecutorParams().hashCode());
        result = prime * result + ((getExecuteMode() == null) ? 0 : getExecuteMode().hashCode());
        result = prime * result + ((getMaxRetryTimes() == null) ? 0 : getMaxRetryTimes().hashCode());
        result = prime * result + ((getExecutedTimes() == null) ? 0 : getExecutedTimes().hashCode());
        result = prime * result + ((getMaxExecuteTime() == null) ? 0 : getMaxExecuteTime().hashCode());
        result = prime * result + ((getTriggerAt() == null) ? 0 : getTriggerAt().hashCode());
        result = prime * result + ((getFirstTriggerAt() == null) ? 0 : getFirstTriggerAt().hashCode());
        result = prime * result + ((getExpiredAt() == null) ? 0 : getExpiredAt().hashCode());
        result = prime * result + ((getLocker() == null) ? 0 : getLocker().hashCode());
        result = prime * result + ((getLockAt() == null) ? 0 : getLockAt().hashCode());
        result = prime * result + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}