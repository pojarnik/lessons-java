package ru.lesson;

public class Calculator {
	private int result;

	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}

	/**
	 * Вычисляем деление.
	 * @param params входные параметры.
	 * @throws UserException кидаем ошибку.
	 */
	public void div(int ... params) throws UserException {
		if (params.length > 0) {

		} else {
			throw new UserException("You should enter params!");
		}
	}

	public int getResult() {
		return this.result;
	}

	public void cleanResult() {
		this.result = 0;
	}
}