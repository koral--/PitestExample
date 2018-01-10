package bulat.example.pitestexample.injection;


import javax.inject.Singleton;

import bulat.example.pitestexample.PitestTest;
import dagger.Component;

@Singleton
@Component(modules = {TestModule.class})
public interface TestComponent {


    void inject(PitestTest pitestTest);
}