package me.feathers.sell;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 日志测试
 * <p>
 *
 * @author Feathers
 * @date 2017-11-01 18:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test() {

        // 默认只会输出info以上级别的信息
        log.trace("trace...");
        log.debug("debug...");
        log.info("info...");
        log.warn("warning...");
        log.error("error...");

        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(context);
    }
}
