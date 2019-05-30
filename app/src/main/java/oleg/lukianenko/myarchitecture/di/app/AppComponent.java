package oleg.lukianenko.myarchitecture.di.app;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import oleg.lukianenko.myarchitecture.home.App;

@Singleton
@Component ( modules = { AppModule.class,
        ActivityBuilder.class,
        AndroidInjectionModule.class} )

public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(App app);

        AppComponent build();
    }

    void inject(App app);
}
