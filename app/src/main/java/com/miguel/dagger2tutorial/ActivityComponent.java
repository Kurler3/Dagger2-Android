package com.miguel.dagger2tutorial;

import androidx.constraintlayout.solver.widgets.analyzer.Dependency;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);



    // We can either override the builder or we can use the factory

    /*
    @Subcomponent.Builder
    interface Builder{

        @BindsInstance
        Builder bindHorsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder bindEngineCapacity(@Named("engine capacity") int engineCapacity);

        //Since we override the builder interface then we have to manually add the appComponent function that
        // assigns the AppComponent object when creating a ActivityComponent

        Builder appComponent(AppComponent appComponent);

        ActivityComponent build();
    }*/

    @Subcomponent.Factory
    interface Factory{

        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower,
                                 @BindsInstance @Named("engine capacity") int engineCapacity);
    }
}
