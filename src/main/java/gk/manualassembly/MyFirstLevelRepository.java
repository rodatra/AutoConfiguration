package gk.manualassembly;


import org.springframework.context.annotation.Bean;

/**
 * 我的 {@link FirstLevelRepository}
 *
 * @author 小马哥
 * @since 2018/5/14
 */
@FirstLevelRepository(value = "myFirstLevelRepository") // Bean 名称
public class MyFirstLevelRepository {
}
