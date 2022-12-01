package com.redhat.training.operation;

import java.util.function.BinaryOperator;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public final class Add extends BinaryOperation {
    private static final String REGEX = "(.+)\\+(.+)";
    private static final BinaryOperator<Float> OPERATOR = (lhs, rhs) -> lhs + rhs;

    public Add() {
        super(OPERATOR, REGEX);
    }

    /*
    @Override
    public Float apply(final String equation) {
        return solveGroups(equation).stream().reduce(OPERATOR).orElse(null);
    }

    private List<Float> solveGroups(final String equation) {
        Matcher matcher = Pattern.compile(REGEX).matcher(equation);
        if (matcher.matches()) {
            List<Float> result = new ArrayList<>(matcher.groupCount());
            for (int groupNum = 1; groupNum <= matcher.groupCount(); groupNum++) {
                result.add(solve(matcher.group(groupNum)));
            }
            return result;
        } else {
            return Collections.emptyList();
        }
    }

    @Inject
    SolverService solverService;

    private Float solve(final String equation) {
        return solverService.solve(equation);
    }
    */
}
