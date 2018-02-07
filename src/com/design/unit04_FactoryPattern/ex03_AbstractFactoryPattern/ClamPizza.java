package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        // � ���丮�� �����ϳĿ� ���� ��ᰡ �޶�����!
    }

    void prepare(){
        System.out.println("�غ����� "+name);
        dough = ingredientFactory.createDough();
        /**
         * ingredientFactory�� ����� ���丮!
         * createDough();�� �ش� �������� ���̴� ���츦 �����Ѵ�.
         */
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
