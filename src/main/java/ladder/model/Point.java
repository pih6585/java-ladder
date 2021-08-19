package ladder.model;

import java.util.Objects;

import ladder.message.ErrorMessage;

public class Point {

	private final boolean left;
	private final boolean right;

	public Point(boolean left, boolean right) {
		checkDirectionStatus(left, right);
		this.left = left;
		this.right = right;
	}

	public int movePosition(int position) {
		return Direction.movePosition(left, right, position);
	}

	public boolean isLeft() {
		return left;
	}

	public boolean isRight() {
		return right;
	}

	private void checkDirectionStatus(boolean left, boolean right) {
		if (left && right) {
			throw new IllegalStateException(ErrorMessage.DIRECTION_STATUS_ERROR_MESSAGE);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Point point = (Point)o;
		return left == point.left && right == point.right;
	}

	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}
}
