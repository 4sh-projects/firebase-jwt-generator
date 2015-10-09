package fr.fsh.fjg.rest;

import com.firebase.security.token.TokenGenerator;
import com.google.common.collect.ImmutableMap;
import fr.fsh.fjg.AppSettings;
import restx.annotations.POST;
import restx.annotations.Param;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.security.PermitAll;

@Component @RestxResource
public class TokenResource {

    private AppSettings settings;

    public TokenResource(AppSettings settings) {
        this.settings = settings;
    }

    @POST("/tokens")
    @PermitAll
    public String generateNewToken(@Param(kind= Param.Kind.QUERY) String uid){
        TokenGenerator generator = new TokenGenerator(settings.firebaseSecret());
        return generator.createToken(ImmutableMap.of("uid", uid));
    }
}
