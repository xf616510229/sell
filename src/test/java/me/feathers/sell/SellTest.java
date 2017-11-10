package me.feathers.sell;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Inherited;

/**
 * 测试注解,方便使用
 * <p>
 *
 * @author Feathers
 * @date 2017-11-10 14:50
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
@Rollback
public class SellTest {

}
