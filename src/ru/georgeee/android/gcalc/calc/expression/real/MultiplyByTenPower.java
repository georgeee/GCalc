package ru.georgeee.android.gcalc.calc.expression.real;

import ru.georgeee.android.gcalc.calc.expression.Expression;
import ru.georgeee.android.gcalc.calc.expression.RealBinaryOperator;
import ru.georgeee.android.gcalc.calc.expression.RealExpression;
import ru.georgeee.android.gcalc.calc.number.GRealNumber;

/**
 * Created with IntelliJ IDEA.
 * User: georgeee
 * Date: 06.10.13
 * Time: 23:23
 * To change this template use File | Settings | File Templates.
 */
public class MultiplyByTenPower extends RealBinaryOperator {
    public MultiplyByTenPower(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public GRealNumber evaluate() {
        return ((GRealNumber) leftOperand.evaluate()).multiplyByTenPower((GRealNumber)rightOperand.evaluate());
    }
}
