package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        sortLotto(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    private void sortLotto(List<Integer> beforeSortNumbers) {
        Collections.sort(beforeSortNumbers);
    }

    public void printLotto() {
        System.out.println(numbers);
    }

    // TODO: 추가 기능 구현
}
