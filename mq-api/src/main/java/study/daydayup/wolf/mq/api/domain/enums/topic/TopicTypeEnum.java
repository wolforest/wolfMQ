package study.daydayup.wolf.mq.api.domain.enums.topic;

import lombok.Getter;
import study.daydayup.wolf.common.lang.enums.CodeBasedEnum;

/**
 * study.daydayup.wolf.common.lang.enums
 *
 * @author Wingle
 * @since 2019/9/29 4:51 PM
 **/
@Getter
public enum TopicTypeEnum implements CodeBasedEnum {
    SIMPLE_TASK(3, "simpleTask"),

    DELAYED_TASK(2, "delayedTask"),
    MESSAGE_QUEUE(1, "messageQueue"),
    ;

    private final int code;
    private final String name;

    TopicTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
