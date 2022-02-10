package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import racingcar.controller.RacingCarGame;

public class RacingCarTest {
	RacingCarGame racingCarGame = new RacingCarGame();

	@Test
	public void 자동차_이름_공백() throws Exception {
		assertThatThrownBy(() -> racingCarGame.checkCarNamesBlank(""))
			.isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> racingCarGame.checkCarNamesBlank(null))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	public void 자동차_이름_구분() throws Exception {
		List<String> result = racingCarGame.splitCarNames("배카라,아스피");
		assertThat(result).isEqualTo(Arrays.asList("배카라", "아스피"));
	}

	@Test
	public void 자동차_이름_예외처리() throws Exception {
		assertThatThrownBy(() -> racingCarGame.checkCarNamesLength(Arrays.asList("배카라쿠배네", "아스피")))
			.isInstanceOf(IllegalArgumentException.class);
	}
}