package com.company.web;

import java.io.Serializable;
import java.util.Locale;
//Task9
public enum Day implements Serializable, Wrapper {
    Mon_(1){
        public String stringReturn() {
            return "Mon";
        }
    },
    Tue_(2){
        public String stringReturn() {
            return "Tue";
        }
    }, Wed_(3){
        public String stringReturn() {
            return "Wed";
        }
    }, Thu_(4){
        public String stringReturn() {
            return "Thu";
        }
    }, Fri_(5){
        public String stringReturn() {
            return "Fri";
        }
    }, Sat_(6){
        public String stringReturn() {
            return "Sat";
        }
    }, Sun_(7){
        public String stringReturn() {
            return "Sun";
        }
    };
    private final Integer hourOfBegin;
    //Task 7
    private Day(Integer hourOfBegin){
        this.hourOfBegin=hourOfBegin;
    }

    @Override
    public String toString() {
        //Task 2
        return this.name().toLowerCase().replace("_","");
    }

    public Integer getHourPlus1(){
        //Task 8
        return this.hourOfBegin+1;
    }


}
