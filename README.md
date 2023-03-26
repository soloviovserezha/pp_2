# PP_2 Task_2.1.3

Почему Scope не работает в классе?
```
@Scope("prototype")
public class Cat {}
```
Сработал только при использовании в методе, где как раз создавали котов
```
@Bean
@Scope("prototype")
public Cat getCat() {
    return null;
}
```