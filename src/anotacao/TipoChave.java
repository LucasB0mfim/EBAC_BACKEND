package anotacao;

import java.lang.annotation.*;

/**
 * @author Lucas
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
