package study.daydayup.wolf.mq.store.rdb.dataobject;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class MqTopicDO implements Serializable {
    private Long id;

    private String topicNo;

    private Integer topicType;

    private Integer triggerType;

    private String trigger;

    private Integer triggerTimeout;

    private Integer executeMode;

    private Integer maxRetryTimes;

    private Integer maxExecuteTime;

    private String concurrency;

    private String sharding;

    private String name;

    private String tags;

    private String description;

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
        sb.append(", topicNo=").append(topicNo);
        sb.append(", topicType=").append(topicType);
        sb.append(", triggerType=").append(triggerType);
        sb.append(", trigger=").append(trigger);
        sb.append(", triggerTimeout=").append(triggerTimeout);
        sb.append(", executeMode=").append(executeMode);
        sb.append(", maxRetryTimes=").append(maxRetryTimes);
        sb.append(", maxExecuteTime=").append(maxExecuteTime);
        sb.append(", concurrency=").append(concurrency);
        sb.append(", sharding=").append(sharding);
        sb.append(", name=").append(name);
        sb.append(", tags=").append(tags);
        sb.append(", description=").append(description);
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
        MqTopicDO other = (MqTopicDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTopicNo() == null ? other.getTopicNo() == null : this.getTopicNo().equals(other.getTopicNo()))
            && (this.getTopicType() == null ? other.getTopicType() == null : this.getTopicType().equals(other.getTopicType()))
            && (this.getTriggerType() == null ? other.getTriggerType() == null : this.getTriggerType().equals(other.getTriggerType()))
            && (this.getTrigger() == null ? other.getTrigger() == null : this.getTrigger().equals(other.getTrigger()))
            && (this.getTriggerTimeout() == null ? other.getTriggerTimeout() == null : this.getTriggerTimeout().equals(other.getTriggerTimeout()))
            && (this.getExecuteMode() == null ? other.getExecuteMode() == null : this.getExecuteMode().equals(other.getExecuteMode()))
            && (this.getMaxRetryTimes() == null ? other.getMaxRetryTimes() == null : this.getMaxRetryTimes().equals(other.getMaxRetryTimes()))
            && (this.getMaxExecuteTime() == null ? other.getMaxExecuteTime() == null : this.getMaxExecuteTime().equals(other.getMaxExecuteTime()))
            && (this.getConcurrency() == null ? other.getConcurrency() == null : this.getConcurrency().equals(other.getConcurrency()))
            && (this.getSharding() == null ? other.getSharding() == null : this.getSharding().equals(other.getSharding()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
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
        result = prime * result + ((getTopicNo() == null) ? 0 : getTopicNo().hashCode());
        result = prime * result + ((getTopicType() == null) ? 0 : getTopicType().hashCode());
        result = prime * result + ((getTriggerType() == null) ? 0 : getTriggerType().hashCode());
        result = prime * result + ((getTrigger() == null) ? 0 : getTrigger().hashCode());
        result = prime * result + ((getTriggerTimeout() == null) ? 0 : getTriggerTimeout().hashCode());
        result = prime * result + ((getExecuteMode() == null) ? 0 : getExecuteMode().hashCode());
        result = prime * result + ((getMaxRetryTimes() == null) ? 0 : getMaxRetryTimes().hashCode());
        result = prime * result + ((getMaxExecuteTime() == null) ? 0 : getMaxExecuteTime().hashCode());
        result = prime * result + ((getConcurrency() == null) ? 0 : getConcurrency().hashCode());
        result = prime * result + ((getSharding() == null) ? 0 : getSharding().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}