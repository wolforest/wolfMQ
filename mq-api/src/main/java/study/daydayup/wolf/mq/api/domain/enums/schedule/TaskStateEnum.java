package study.daydayup.wolf.mq.api.domain.enums.schedule;

import lombok.Getter;
import study.daydayup.wolf.common.lang.enums.CodeBasedEnum;

/**
 * study.daydayup.wolf.common.lang.enums
 *
 * @author Wingle
 * @since 2019/9/29 4:51 PM
 **/
@Getter
public enum TaskStateEnum implements CodeBasedEnum {
    FAILED(120, "FAILED"),
    SUCCESS(100, "SUCCESS"),
    DEAD_LETTER(90, "deadLetter"),

    LOCK_TO_EXECUTE(60, "lockToExecute"),
    WAIT_TO_EXECUTE(50, "waitToExecute"),
    WAIT_TO_ACTIVATE(10, "waitToActivate"),
    ;

    private final int code;
    private final String name;

    TaskStateEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
