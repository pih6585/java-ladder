package nextstep.step4.ladder.view.impl;

import nextstep.step4.ladder.view.InputView;

import java.util.Scanner;

/**
 * author       : gwonbyeong-yun <sksggg123>
 * ------------------------------------------
 * | email        : sksggg123               |
 * | github       : github.com/sksggg123    |
 * | blog         : sksggg123.github.io     |
 * ------------------------------------------
 * project      : java-ladder
 * create date  : 2019-06-29 02:06
 */
public class ConsoleInputView implements InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String INPUT_CUSTOM_NAME_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String INPUT_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private static final String INPUT_EXECUTION_RESULT_MESSAGE = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String INPUT_RESULT_RARGET_NAME_MESSAGE = "결과를 보고 싶은 사람은?";

    @Override
    public String inputCustomNames() {
        System.out.println(INPUT_CUSTOM_NAME_MESSAGE);
        return scanner.nextLine();
    }

    @Override
    public int inputLadderHeight() {
        System.out.println(INPUT_LADDER_HEIGHT_MESSAGE);
        return Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String inputExecutionResult() {
        System.out.println(INPUT_EXECUTION_RESULT_MESSAGE);
        return scanner.nextLine();
    }

    @Override
    public String inputResultInfo() {
        System.out.println(INPUT_RESULT_RARGET_NAME_MESSAGE);
        return scanner.nextLine();
    }
}