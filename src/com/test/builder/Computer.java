package com.test.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Computer {
    public enum  Component {MOUSE, KEYBOARD, MONITOR}
    final Set<Component> components;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Component> components = EnumSet.noneOf(Component.class);
        public T addComponent(Component component){
            components.add(Objects.requireNonNull(component));
            return self();
        }
        abstract  Computer build();

        protected abstract T self();
    }
    Computer(Builder<?> builder){
        components = builder.components.clone();
    }
}
