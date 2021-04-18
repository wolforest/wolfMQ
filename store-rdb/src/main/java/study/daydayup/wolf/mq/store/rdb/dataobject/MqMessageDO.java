package study.daydayup.wolf.mq.store.rdb.dataobject;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class MqMessageDO implements Serializable {
    private Long id;

    private String messageNo;

    private Long topicId;

    private Integer shard;

    private Integer state;

    private String producer;

    private String message;

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
        sb.append(", messageNo=").append(messageNo);
        sb.append(", topicId=").append(topicId);
        sb.append(", shard=").append(shard);
        sb.append(", state=").append(state);
        sb.append(", producer=").append(producer);
        sb.append(", message=").append(message);
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
        MqMessageDO other = (MqMessageDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMessageNo() == null ? other.getMessageNo() == null : this.getMessageNo().equals(other.getMessageNo()))
            && (this.getTopicId() == null ? other.getTopicId() == null : this.getTopicId().equals(other.getTopicId()))
            && (this.getShard() == null ? other.getShard() == null : this.getShard().equals(other.getShard()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getProducer() == null ? other.getProducer() == null : this.getProducer().equals(other.getProducer()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
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
        result = prime * result + ((getMessageNo() == null) ? 0 : getMessageNo().hashCode());
        result = prime * result + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        result = prime * result + ((getShard() == null) ? 0 : getShard().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getProducer() == null) ? 0 : getProducer().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
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