package com.wecode.bookStoreCK;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
class BookStoreCkApplicationTests {

	@Test
	@Sql(scripts = {"classpath:InsertInitialBookRecordForTest.sql"})
	void contextLoads() {
	}

}
