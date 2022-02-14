package racingcar.servicetest;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import racingcar.service.CheckingService;

public class CheckingServiceTest {
	@Test
	public void 자동차_이름_공백_빈칸() {
		assertThatThrownBy(() -> CheckingService.checkCarNamesBlank(""))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	public void 자동차_이름_공백_NULL() {
		assertThatThrownBy(() -> CheckingService.checkCarNamesBlank(null))
			.isInstanceOf(IllegalArgumentException.class);
	}
	
	@Test
	public void 자동차_이름_예외처리() {
		assertThatThrownBy(() -> CheckingService.checkCarNamesLength(Arrays.asList("배카라쿠배네", "아스피")))
			.isInstanceOf(IllegalArgumentException.class);
	}
}