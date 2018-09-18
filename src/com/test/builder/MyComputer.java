package com.test.builder;

import java.util.Objects;

public class MyComputer extends Computer {
    public enum Brand {ASUS, HP, DELL}
    private final Brand brand;

    public static class Builder extends Computer.Builder<Builder>{
        private final Brand brand;

        public Builder(Brand brand){
            this.brand = Objects.requireNonNull(brand);
        }

        @Override
        public MyComputer build(){
            return new MyComputer(this);
        }

        @Override
        protected Builder self(){return this;}
    }
    private MyComputer(Builder builder){
        super(builder);
        brand = builder.brand;
    }
}
