package services;

public enum TestDataVariables {

    manufacturer("manufacturer"),
    bottomPrice("bottomPrice"),
    topPrice("topPrice"),
    resultPageNumber("resultPageNumber");

    private String variable;

    TestDataVariables(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }
}
