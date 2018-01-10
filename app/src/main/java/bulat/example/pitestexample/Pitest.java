package bulat.example.pitestexample;

import android.content.Context;

import javax.inject.Inject;

public class Pitest {
    Context context;

    @Inject
    public Pitest(Context context) {
        this.context = context;
    }

    public String getApi() {
        return context.getString(R.string.api_base_url);
    }
}