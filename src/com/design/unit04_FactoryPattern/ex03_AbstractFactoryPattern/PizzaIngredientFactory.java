package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;

// �� ����� ������ PizzaStore���� �����ҰŴ�~!
public interface PizzaIngredientFactory {
    // �� ��Ằ ���� �޼ҵ带 ����
    // �� ��Ằ�� Ŭ������ �����ؾ���
    /**
     *
     * ��� ���丮 �ν��Ͻ����� �������̶��
     * ����ó�� �������̽��� �ƴ� �߻�Ŭ������ ���� �ȴ�!
     * ������ ���丮 �޼ҵ� ���Ͽ��� �ô� createPizza ó��!
     */

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
