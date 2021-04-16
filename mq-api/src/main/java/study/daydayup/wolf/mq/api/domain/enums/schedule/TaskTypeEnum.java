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
public enum TaskTypeEnum implements CodeBasedEnum {
    FAILED(120, "FAILED"),
    ;

    private final int code;
    private final String name;

    TaskTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
