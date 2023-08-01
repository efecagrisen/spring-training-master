package com.cydeo.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Dimensions {
    private int width, height, depth;

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

}
