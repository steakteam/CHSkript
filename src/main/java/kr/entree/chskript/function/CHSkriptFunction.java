package kr.entree.chskript.function;

import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.MSVersion;
import com.laytonsmith.core.exceptions.CRE.CREThrowable;
import com.laytonsmith.core.functions.AbstractFunction;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by JunHyung Lim on 2020-03-05
 */
@SuppressWarnings("ALL")
public abstract class CHSkriptFunction extends AbstractFunction {
    @Override
    public boolean isRestricted() {
        return true;
    }

    @Override
    public Class<? extends CREThrowable>[] thrown() {
        return possibleThrown().toArray(new Class[0]);
    }

    public Collection<? extends CREThrowable> possibleThrown() {
        return Collections.emptyList();
    }

    @Override
    public Boolean runAsync() {
        return Boolean.FALSE;
    }

    @Override
    public Version since() {
        return MSVersion.V3_3_4;
    }
}
