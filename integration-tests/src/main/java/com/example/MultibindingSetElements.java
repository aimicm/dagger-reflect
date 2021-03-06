package com.example;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;
import java.util.Set;

import static java.util.Collections.singleton;

@Component(modules = MultibindingSetElements.Module1.class)
interface MultibindingSetElements {
  Set<String> values();

  @Module
  abstract class Module1 {
    @Provides @ElementsIntoSet static Set<String> one() {
      return singleton("one");
    }
    @Provides @IntoSet static String two() {
      return "two";
    }
  }
}
