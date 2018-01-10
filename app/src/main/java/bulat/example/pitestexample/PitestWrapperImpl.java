package bulat.example.pitestexample;

import javax.inject.Inject;

public class PitestWrapperImpl implements PitestWrapper {
    Pitest pitest;

    @Inject
    public PitestWrapperImpl(Pitest pitest) {
        this.pitest = pitest;
    }

    @Override
    public String getApi() {
        return pitest.getApi();
    }
}
