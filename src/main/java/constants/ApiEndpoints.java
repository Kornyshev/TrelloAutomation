package constants;

import tools.ApiParameters;

public enum ApiEndpoints {
    BOARDS(ApiParameters.boards()),
    LISTS(ApiParameters.lists()),
    CARDS(ApiParameters.cards());

    private final String value;

    ApiEndpoints(String boards) {
        this.value = boards;
    }

    public String value() {
        return value;
    }
}