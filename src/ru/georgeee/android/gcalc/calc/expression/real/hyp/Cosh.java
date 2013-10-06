package ru.georgeee.android.gcalc.calc.expression.real.hyp;

import ru.georgeee.android.gcalc.calc.expression.Expression;
import ru.georgeee.android.gcalc.calc.expression.RealUnaryOperator;
import ru.georgeee.android.gcalc.calc.number.GRealNumber;

/**
 * Created with IntelliJ IDEA.
 * User: georgeee
 * Date: 05.10.13
 * Time: 1:10
 * To change this template use File | Settings | File Templates.
 */
public class Cosh extends RealUnaryOperator {
    public Cosh(Expression operand) {
        super(operand);
    }

    @Override
    public GRealNumber evaluate() {
        return ((GRealNumber) operand.evaluate()).cosh();
    }
}