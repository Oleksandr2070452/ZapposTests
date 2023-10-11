package enumes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMassages {
    NOT_FOUND("No Results Found");

    private final String uiName;
}