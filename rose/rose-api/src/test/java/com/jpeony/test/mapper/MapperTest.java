package com.jpeony.test.mapper;

import com.jpeony.common.pojo.domain.TestDO;
import com.jpeony.core.mapper.TestMapper;
import com.jpeony.test.BaseServletTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Mapper测试
 *
 * @author yihonglei
 */
@Slf4j
public class MapperTest extends BaseServletTest {
    @Autowired
    private TestMapper testMapper;

    @Test
    public void test() {
        TestDO testDO = testMapper.queryTestById(1);
        log.info("testDO={}", testDO);
    }
}
