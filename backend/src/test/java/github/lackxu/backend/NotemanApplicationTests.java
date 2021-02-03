package github.lackxu.backend;

import github.lackxu.backend.entity.About;
import github.lackxu.backend.mapper.AboutMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("github.lackxu.noteman.mapper")
class NotemanApplicationTests {


	@Autowired
	private AboutMapper aboutMapper;

	@Test
	public void selectAbout() {
		List<About> aboutList = aboutMapper.selectList(null);
		aboutList.forEach(System.out::println);
	}

	@Test
	void contextLoads() {
		System.out.println("HELLO TO THE SPRINGBOOT TEST!");
	}

}
