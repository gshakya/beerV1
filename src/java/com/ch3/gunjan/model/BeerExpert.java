/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch3.gunjan.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grsky
 */
public class BeerExpert {

    public List getBrands(String color) {
        List brands = new ArrayList();
        if (color.equals("Amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
            }
        else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Scout");
        }
        return brands;
    }   
}
