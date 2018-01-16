package com.design.unit03_decorationPattern;

public abstract class CondimentDecorator extends Beverage{
    /**
     * Beverage��ü�� �� �ڸ��� �� �� �־�� �ϹǷ�
      Beverage Ŭ������ ����� ���� Ȯ���Ѵ�.
      ����(Beverage)�� ���缭 �� �ൿ�� �߰��ϴ°��̴�.
      */
    public abstract String getDescription();
    /**
     * ��� ÷���� ���ڷ����Ϳ��� getDescription �޼ҵ带
     * ���� �����ҰŴ�.
     */

}
