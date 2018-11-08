package com.mysiga.learn.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wilson on 2018/8/8.
 */
public class Container implements Component {

    private List<Component> componentList = new ArrayList<>();

    public void addComponent(Component component) {
        componentList.add(component);
    }

    public boolean removeCompont(Component component) {
        return componentList.remove(component);
    }

    public Component getIndex(int position) {
        return componentList.get(position);
    }

    @Override
    public String getName() {
        return "Container";
    }
}
