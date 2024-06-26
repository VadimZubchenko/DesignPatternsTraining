/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.factrory_method;

/**
 *
 * @author vadimzubchenko
 */
public abstract class BeverageCreatingFactory {

    // esitetään muuttuja Beverage tyyppina, 
    //joka will be created inside of children classes. 
    Beverage beverage = null;

    //esitetään abstracti metodi Beverage tyyppinä
    abstract Beverage createBeverage();

    // abstarktin luokan omat metodit
    public void feed() {
        drink();
    }

    private void drink() {
        if (beverage == null) {
            beverage = createBeverage();
        }
        System.out.println("I got drunk some " + beverage);

    }

}
