package com.mysiga.learn.factory.statics;

import com.mysiga.learn.factory.EP6Car;
import com.mysiga.learn.factory.EP8Car;
import com.mysiga.learn.factory.EP9Car;
import com.mysiga.learn.factory.ICar;

/**
 * static factory mode
 */
public class StaticFactory {
    public enum CarType {
        EP9("ep9"),
        EP8("ep8"),
        EP6("ep6");

        private String type;

        CarType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static ICar getCar(CarType car) {
        switch (car) {
            case EP9:
                return new EP9Car();
            case EP8:
                return new EP8Car();
            case EP6:
                return new EP6Car();
            default:
                return new EP9Car();
        }
    }
}
