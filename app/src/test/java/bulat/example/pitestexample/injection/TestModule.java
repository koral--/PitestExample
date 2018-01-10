package bulat.example.pitestexample.injection;

import android.content.Context;

import javax.inject.Singleton;

import bulat.example.pitestexample.PitestWrapper;
import bulat.example.pitestexample.PitestWrapperImpl;
import bulat.example.pitestexample.R;
import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Module
public class TestModule {

    @Provides
    @Singleton
    PitestWrapper providePitestWrapper(PitestWrapperImpl pitestWrapper) {
        return pitestWrapper;
    }

    @Provides
    @Singleton
    Context provideContext() {
        Context contextMock = mock(Context.class);
        when(contextMock.getString(R.string.api_base_url)).thenReturn("http://192.168.0.1:8080");
        return contextMock;
    }
}
