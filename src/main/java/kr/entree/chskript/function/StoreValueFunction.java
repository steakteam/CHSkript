package kr.entree.chskript.function;

import ch.njol.skript.variables.Variables;
import com.laytonsmith.annotations.api;
import com.laytonsmith.core.Static;
import com.laytonsmith.core.constructs.CVoid;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.environments.Environment;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.natives.interfaces.Mixed;

/**
 * Created by JunHyung Lim on 2020-03-05
 */
@api
public class StoreValueFunction extends CHSkriptFunction {
    @Override
    public String getName() {
        return "store_value_sk";
    }

    @Override
    public Mixed exec(Target t, Environment environment, Mixed... args) throws ConfigRuntimeException {
        Object object = Static.getJavaObject(args[1]);
        Variables.setVariable(args[0].val(), object, null, false);
        return CVoid.VOID;
    }

    @Override
    public Integer[] numArgs() {
        return new Integer[]{2};
    }

    @Override
    public String docs() {
        return "void {key, value} Put the given value into Skript database.";
    }
}
