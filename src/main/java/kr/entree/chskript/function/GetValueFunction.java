package kr.entree.chskript.function;

import ch.njol.skript.variables.Variables;
import com.laytonsmith.annotations.api;
import com.laytonsmith.core.Static;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.environments.Environment;
import com.laytonsmith.core.exceptions.CRE.CREThrowable;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.natives.interfaces.Mixed;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by JunHyung Lim on 2020-03-05
 */
@api
public class GetValueFunction extends CHSkriptFunction {
    @Override
    public String getName() {
        return "get_value_sk";
    }

    @Override
    public Mixed exec(Target t, Environment environment, Mixed... args) throws ConfigRuntimeException {
        return Static.getMSObject(Variables.getVariable(args[0].val(), null, false), t);
    }

    @Override
    public Integer[] numArgs() {
        return new Integer[]{1};
    }

    @Override
    public Collection<? extends CREThrowable> possibleThrown() {
        return Collections.emptyList();
    }

    @Override
    public String docs() {
        return "mixed {key} Returns a variable value that stored in Skript.";
    }
}
