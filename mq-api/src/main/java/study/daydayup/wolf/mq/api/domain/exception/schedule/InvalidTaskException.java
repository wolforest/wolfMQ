package study.daydayup.wolf.mq.api.domain.exception.schedule;

import study.daydayup.wolf.common.lang.exception.SystemException;

/**
 * study.daydayup.wolf.business.goods.api.exception
 *
 * @author Wingle
 * @since 2019/12/12 2:04 下午
 **/
public class InvalidTaskException extends SystemException {
    public InvalidTaskException() {
        super(10100, "invalid message");
    }

}
