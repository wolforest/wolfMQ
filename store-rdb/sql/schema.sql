CREATE DATABASE IF NOT EXISTS `wolf_mq` DEFAULT CHARACTER SET utf8mb4;
USE `wolf_mq`;

DROP TABLE IF EXISTS `wmq_topic`;
CREATE TABLE IF NOT EXISTS `wmq_topic`
(
    `id`                BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `topic_id`          VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'topicId',
    `topic_type`        TINYINT(4) UNSIGNED  NOT NULL DEFAULT 0 COMMENT 'topicType',

    `trigger_type`      TINYINT(4) UNSIGNED  NOT NULL DEFAULT 0 COMMENT 'triggerType',
    `trigger`           VARCHAR(5000)        NOT NULL DEFAULT '' COMMENT 'trigger',
    `trigger_timeout`   INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT 'triggerTimeout(ms)',

    `execute_mode`      TINYINT(4) UNSIGNED  NOT NULL DEFAULT 0 COMMENT 'executeMod',
    `max_retry_times`   INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT 'maxRetryTimes',
    `max_execute_time`  INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT 'maxExecuteTime(ms)',

    `concurrency`       VARCHAR(1000)        NOT NULL DEFAULT '' COMMENT 'concurrency',
    `sharding`          VARCHAR(1000)        NOT NULL DEFAULT '' COMMENT 'sharding',

    `name`              VARCHAR(100) NOT NULL DEFAULT '' COMMENT 'topicName',
    `description`       VARCHAR(1000)        NOT NULL DEFAULT '' COMMENT 'description',

    `version`           INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '版本号',
    `owner_id`          BIGINT(20) UNSIGNED NOT NULL DEFAULT 0 COMMENT '最后编辑者',
    `created_at`        DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`        DATETIME ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COMMENT = 'topic';


DROP TABLE IF EXISTS `wmq_message`;
CREATE TABLE IF NOT EXISTS `wmq_message`
(
    `id`                BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `message_id`        VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'messageId',
    `topic_id`          BIGINT(20) UNSIGNED NOT NULL DEFAULT 0 COMMENT 'topic',
    `shard`             INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT 'shard',
    `state`             TINYINT(4) UNSIGNED  NOT NULL DEFAULT 0 COMMENT 'state',

    `producer`          VARCHAR(100)         NOT NULL DEFAULT '' COMMENT 'producer',
    `message`           VARCHAR(5000)        NOT NULL DEFAULT '' COMMENT 'message',

    `expired_at`        DATETIME COMMENT 'expiredAt',

    `locker`            VARCHAR(50)         NOT NULL DEFAULT '' COMMENT 'locker',
    `lock_at`           DATETIME COMMENT 'lockAt',

    `attachment`        VARCHAR(5000)        NOT NULL DEFAULT '' COMMENT 'attachment',
    `tags`              VARCHAR(100)         NOT NULL DEFAULT '' COMMENT 'tags',

    `version`           INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '版本号',
    `owner_id`          BIGINT(20) UNSIGNED NOT NULL DEFAULT 0 COMMENT '最后编辑者',
    `created_at`        DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`        DATETIME ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COMMENT = 'message';


DROP TABLE IF EXISTS `wmq_task`;
CREATE TABLE IF NOT EXISTS `wmq_task`
(
    `id`                BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',

    `version`           INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '版本号',
    `owner_id`          BIGINT(20) UNSIGNED NOT NULL DEFAULT 0 COMMENT '最后编辑者',
    `created_at`        DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`        DATETIME ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COMMENT = '任务';


DROP TABLE IF EXISTS `wmq_task`;
CREATE TABLE IF NOT EXISTS `wmq_task`
(
    `id`                BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',

    `version`           INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '版本号',
    `owner_id`          BIGINT(20) UNSIGNED NOT NULL DEFAULT 0 COMMENT '最后编辑者',
    `created_at`        DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`        DATETIME ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COMMENT = '任务';

DROP TABLE IF EXISTS `wmq_task`;
CREATE TABLE IF NOT EXISTS `wmq_task`
(
    `id`                BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',

    `version`           INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '版本号',
    `owner_id`          BIGINT(20) UNSIGNED NOT NULL DEFAULT 0 COMMENT '最后编辑者',
    `created_at`        DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`        DATETIME ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COMMENT = '任务';