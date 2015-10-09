Simple RestX implementation allowing to generate a Firebase JSON Web Token given your Firebase secret.

As soon as you will have installed restx shell on your computer (see [here](http://restx.io/download.html)), you will just have to :

```
restx app grab https://github.com/4sh-projects/firebase-jwt-generator.git + app run -Drestx.admin.password=admin -Dfirebase.secret=your-secret-here
```

And it will start a restx server on port 8080 allowing to generate a JWT based on your given secret.

This may be useful while developping and wanting to play with Firebase a bit.

Also, please note that you shouldn't deploy this into production as everybody will be able to generate a JWT using your secret key,
which may be undesirable.
