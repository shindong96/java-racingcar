package racingcar;

import racingcar.controller.RacingCarGame;

public class Application {
	public static void main(String[] args) {
		RacingCarGame racingCarGame = new RacingCarGame();
		racingCarGame.makeCars();
		racingCarGame.getGameTurn();
		racingCarGame.moveCars();
		racingCarGame.printWinners();
	}
}
