package fr.fsh.fjg.rest;

import restx.factory.Module;
import restx.factory.Provides;

import javax.inject.Named;

/**
 * @author fcamblor
 */
@Module
public class TestingModule {
    @Provides
    @Named("firebase.secret")
    public String firebaseSecret(){ return "my-testing-secret"; }
}
